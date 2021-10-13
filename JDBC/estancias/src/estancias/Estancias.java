
package estancias;



import estancias.servicios.ClienteService;

public class Estancias {

    
    public static void main(String[] args) throws Exception {
    
        ClienteService a = new ClienteService();
        
        a.mostrarTablaClientes();
      
    }   
}
