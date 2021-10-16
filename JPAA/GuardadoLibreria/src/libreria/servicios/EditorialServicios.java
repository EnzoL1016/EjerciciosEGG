package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;


public class EditorialServicios {

    ServicioGeneral sg = new ServicioGeneral();
    Scanner sc = new Scanner(System.in,"ISO-8859-1");
    
    public void ingresarEditorial(){
         Editorial editorial = new Editorial();
        System.out.println("Ingrese el nombre de la Editorial:");
        editorial.setNombre(sc.nextLine());
        sg.ingresarEntidad(editorial);
    }
    
    public void modificarEditorial(){
        System.out.println("Seleccione la editorial a modificar:");
        listarEditorial();
        int opcion = sc.nextInt();sc.nextLine();
        Editorial editorial = buscarEditorialID(opcion);
        System.out.println("Ingrese el nuevo nombre de la editorial:");
        editorial.setNombre(sc.nextLine());
        sg.actualizarEntidad(editorial);
    }
    
    public void eliminarEditorial(){
        System.out.println("Ingrese el numero de Id de la editorial a eliminar:");
        int isbn = sc.nextInt();
        String jpql = "Select a FROM Editorial a WHERE a.id="+isbn;
        Editorial editorial = (Editorial) sg.listarEntidad(jpql);
        
        if (editorial == null) {
            System.out.println("No hay Editorial para eliminar");
        }else{
            editorial.setAlta(false);
            sg.eliminarEntidad(editorial);
        }
    }
    
    public void listarEditorial() {
        String sql = "Select a FROM Editorial a";
        List<Editorial> list = sg.listarEntidades(sql);

        if (list.isEmpty()) {
            System.out.println("No hay Editoriales para mostrar");
        }else{
            for (Editorial a : list) {
                System.out.println(+a.getId() + " ) Nombre: " + a.getNombre());
            }
            System.out.println("");
        }

    }
    
    public Editorial buscarEditorialID(int id){
        
        String sql = "Select a FROM Editorial a WHERE a.id = "+id;
        Editorial editorial = (Editorial) sg.listarEntidad(sql);
        return editorial;
    }
}
