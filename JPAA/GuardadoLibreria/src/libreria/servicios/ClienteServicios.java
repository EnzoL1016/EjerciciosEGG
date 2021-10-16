
package libreria.servicios;

import java.util.List;
import java.util.Scanner;

import libreria.entidades.Cliente;


public class ClienteServicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");    
    ServicioGeneral sg = new ServicioGeneral();
    
    public void ingresarCliente(){
        Cliente cliente = new Cliente();
        boolean x = false;
        do{
            System.out.print("Ingrese el numero de documento: ");
            long doc = leer.nextLong();
            String docc = String.valueOf(doc);
            if(docc.length()== 8){
                cliente.setDocumento(doc);
                x=true;
            }else{
                System.out.println("El documento ingresado es incorrecto, vuelva a intentarlo");
            }               
        }while(x=false);
        System.out.print("Ingrese el nombre: ");
        cliente.setNombre(leer.next());
        System.out.print("Ingrese el apellido: ");
        cliente.setApellido(leer.next());
        System.out.print("Ingrese el numero de telefono: ");
        cliente.setTelefono(leer.next());
        sg.ingresarEntidad(cliente);       
    }
    
    public void eliminarCliente(){
        
        System.out.print("Ingrese el ID del cliente que desea eliminar: ");
        int id = leer.nextInt();
        String sql = "Select a FROM Cliente a WHERE a.id = "+id;
        Cliente cliente = (Cliente) sg.listarEntidad(sql);
        if(cliente == null){
            System.out.println("No hay cliente para eliminar");
        }else{
            sg.eliminarEntidad(cliente);
        }
    }
    
    public void modificarCliente(){
        
        System.out.println("Seleccione el cliente que desea modificar: ");
        listarCliente();
        int opcion = leer.nextInt();leer.nextLine();
        Cliente cliente = buscarClienteID(opcion);
        System.out.print("Escribe el nombre del nuevo cliente: ");
        cliente.setNombre(leer.nextLine());
        System.out.print("Escribe el apeliido del nuevo cliente: ");
        cliente.setApellido(leer.nextLine());
        System.out.println("Escribe el documento del nuevo cliente: ");
        boolean x = false;
        do{
            long doc = leer.nextLong();
            String docc = String.valueOf(doc);
            if(docc.length()== 8){
                cliente.setDocumento(doc);
                x=true;
            }else{
                System.out.println("El documento ingresado es incorrecto, vuelva a intentarlo");
            }               
        }while(x=false);
        System.out.print("Ingrese el numero de telefono del nuevo cliente: ");
        cliente.setTelefono(leer.nextLine());
        sg.actualizarEntidad(cliente);
        
    }
    
    public void listarCliente(){
        String sql = "SELECT a FROM Cliente a";
        List <Cliente> list = sg.listarEntidades(sql);
        if(list.isEmpty()){
            System.out.println("No hay clientes para mostrar");
        }else{
            for (Cliente c : list) {
                System.out.println(c.getId()+") Nombre y Apellido: "+c.getNombre()+" "+c.getApellido()+"\n"+"Documento: "+c.getDocumento());
            }
            System.out.println("");
        }       
    }
    
    public Cliente buscarClienteID(int id){
        
        String sql = "Select a FROM Cliente a WHERE a.id = "+id;
        Cliente cliente = (Cliente) sg.listarEntidad(sql);
        return cliente;
    }
}
