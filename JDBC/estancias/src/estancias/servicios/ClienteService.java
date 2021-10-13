
package estancias.servicios;

import estancias.entidades.Clientes;

import estancias.entidades.Comentarios;
import estancias.persistencia.ClienteDAO;
import estancias.persistencia.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;





public class ClienteService {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    private ClienteDAO dao;
    private DAO daoo ;
    private Comentarios c;
    private Clientes cl;
    public ClienteService() {
        this.dao = new ClienteDAO();
        this.daoo =new DAO();
    }
    
    public void CrearCliente(Integer id_cliente, String nombre, String calle, Integer numero, String codigo_postal, String ciudad, String pais, String email) throws Exception{
        
        try {
            if (id_cliente == null) {
                throw new Exception("Debe indicar un id de cliente");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }
            if (calle == null || calle.trim().isEmpty()) {
                throw new Exception("Debe indicar una calle");
            }
            if (numero == null) {
                throw new Exception("Debe indicar el numero de calle");
            }
            if (codigo_postal == null || codigo_postal.trim().isEmpty()) {
                throw new Exception("Debe indicar un codigo postal");
            }
            if (ciudad == null || ciudad.trim().isEmpty()) {
                throw new Exception("Debe indicar una ciudad");
            }
            if (pais == null || pais.trim().isEmpty()) {
                throw new Exception("Debe indicar un pais");
            }
            if (email == null || email.trim().isEmpty()) {
                throw new Exception("Debe indicar un email");
            }
            if (email.contains("@") == false) {
                throw new Exception("El email ingresado es incorrecto");
            }
            Clientes cliente = new Clientes();
            cliente.setId_cliente(id_cliente);
            cliente.setNombre(nombre);
            cliente.setCalle(calle);
            cliente.setNumero(numero);
            cliente.setCodigo_postal(codigo_postal);
            cliente.setCiudad(ciudad);
            cliente.setPais(pais);
            cliente.setEmail(email);
            dao.GuardarCliente(cliente);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Object> ListarClientesConEstancia() throws Exception{
        try {
            List<Object> lista = dao.ListarClientesConEstancia();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void mostrarTablaClientes() throws SQLException, Exception {
        //Realizamos la consulta sql para mostrar todos los datos de la tabla estudiante
      ResultSet r  = daoo.buscar("SELECT clientes.* , comentarios.comentario "
                    + "FROM clientes "  
                    + "INNER JOIN estancias "
                    + "ON estancias.id_cliente = clientes.id_cliente "  
                    + "INNER JOIN comentarios " 
                    + "ON comentarios.id_casa = estancias.id_casa "
                    + "GROUP BY  comentarios.id_casa;");
        try {
            System.out.println("\n TODOS LOS CLIENTES QUE TIENEN UNA ESTANCIA:\n");
            System.out.println("ID Cliente:" +"\t\t" +"Nombre:"+"\t\t\t" +"      Calle:"+"\t\t\t"+"    Numero:"+"\t\t\t" +"  Codigo Postal:"+"\t\t"+"Ciudad:"+"\t\t\t" +"      Pais:"+"\t\t\t" +"    Email:"+"\t\t\t"+"  Descripcion Casa:");
            while (r.next()) {            
                System.out.println(r.getInt("ID_Cliente")+"\t\t\t"+espacios(r.getString("Nombre"))+espacios(r.getString("Calle"))+espacios(String.valueOf(r.getInt("Numero")))+espacios(r.getString("Codigo_Postal"))+espacios(r.getString("Ciudad"))+espacios(r.getString("Pais"))+espacios(r.getString("Email"))+espacios(r.getString("Comentario")));
            }
        } catch (SQLException ex) {
           throw ex;
        }
    }
    
     
    public static String espacios(String cadena) {
        int cantEspacios = 30 - cadena.length();
        for (int i = 0; i < cantEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }
}
