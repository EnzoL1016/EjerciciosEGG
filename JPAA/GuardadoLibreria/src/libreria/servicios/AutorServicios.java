/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Libro;

public class AutorServicios {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("GuardadoLibreriaPU");  
    ServicioGeneral sg = new ServicioGeneral();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void ingresarAutor() throws Exception {

        Autor autor = new Autor();
        System.out.print("Ingrese el nombre del autor: ");
        autor.setNombre(leer.next());
        sg.ingresarEntidad(autor);
    }

    public void eliminarAutor() throws Exception {
        EntityManager ema = emf.createEntityManager();
        System.out.print("Ingrese el numero de Id del Autor a eliminar: ");
        int id = leer.nextInt();
         String sql = "Select a FROM Autor a WHERE a.id="+id;
        Autor autor = (Autor) sg.listarEntidad(sql);   
        if (autor == null) {
            System.out.println("No hay Autor para eliminar o la ID es incorrecta");
        } else {
          sg.eliminarEntidad(autor);  
        }
    }

    public void modificarAutor() throws Exception {

        System.out.print("Seleccione el autor a modificar: ");
        listarAutor();
        int opcion = leer.nextInt();
        leer.nextLine();
        Autor autor = buscarAutorID(opcion);
        System.out.println("Escriba el nuevo nombre del autor:");
        autor.setNombre(leer.nextLine());
        sg.actualizarEntidad(autor);
    }

    public Autor buscarAutorID(int id) {

        String sql = "Select a FROM Autor a WHERE a.id = " + id;
        Autor autor = (Autor) sg.listarEntidad(sql);
        return autor;
    }

    public void buscarAutorNombre() {
        System.out.println("Indique el nombre completo del autor");
        String nombre = leer.nextLine();
        String jpql = "Select a FROM Autor a WHERE a.nombre IN ('" + nombre + "')";
        List<Autor> list = sg.listarEntidades(jpql);

        if (list.isEmpty()) {
            System.out.println("No hay autores para mostrar");
        } else {
            for (Autor a : list) {
                System.out.println("Id: " + a.getId() + " Nombre: " + a.getNombre());
            }
        }
    }
                                              
    public Libro buscarLibroID(int id) {

        String sql = "Select a FROM Libro a WHERE a.isbn = " + id;
        Libro libro = (Libro) sg.listarEntidad(sql);
        return libro;
    }

    public void listarAutor() {
        String sql = "Select a FROM Autor a";
        List<Autor> list = sg.listarEntidades(sql);
        if (list.isEmpty()) {
            System.out.println("No hay autores para mostrar");
        } else {
            for (Autor a : list) {
                System.out.println(+a.getId() + " ) Nombre: " + a.getNombre());
            }
            System.out.println("");
        }
    }
}
