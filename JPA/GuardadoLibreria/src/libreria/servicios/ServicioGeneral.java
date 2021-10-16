/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ServicioGeneral {
   
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("GuardadoLibreriaPU");  
    
    public void ingresarEntidad(Object objeto){      
        EntityManager ema = emf.createEntityManager();
        try {                                 
            ema.getTransaction().begin();
            ema.persist(objeto); 
            ema.flush(); // limpiar la conexion
            ema.getTransaction().commit();
        } catch (Exception e) {
            ema.getTransaction().rollback();
        }
        ema.close();//cerrar la conexion
    }
    
    public void actualizarEntidad(Object objeto){
        EntityManager ema = emf.createEntityManager();
        try {           
            ema.getTransaction().begin();
            ema.merge(objeto); 
            ema.flush(); // limpiar la conexion
            ema.getTransaction().commit();
        } catch (Exception e) {
            ema.getTransaction().rollback();
        }
        ema.close();//cerrar la conexion
    }
    
    public void eliminarEntidad(Object objeto){
        EntityManager ema = emf.createEntityManager();
        try {
            ema.getTransaction().begin();
            ema.remove(ema.merge(objeto)); 
            ema.flush(); // limpiar la conexion
            ema.getTransaction().commit();
        } catch (Exception e) {
            ema.getTransaction().rollback();
        }
        ema.close();//cerrar la conexion
    }
    
    public List listarEntidades(String string){
        EntityManager ema = emf.createEntityManager();
        Query query = ema.createQuery(string);
        List<Object> list = (List<Object>) query.getResultList();
        return list;
    }
    
    
    public Object listarEntidad(String string){
        EntityManager ema = emf.createEntityManager();
        Query query = ema.createQuery(string);
        Object objeto = query.getSingleResult();
        return objeto;
    }   
}
