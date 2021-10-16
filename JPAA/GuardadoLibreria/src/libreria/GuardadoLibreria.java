
package libreria;
import libreria.servicios.MenuService;

public class GuardadoLibreria {

   
    public static void main(String[] args) throws Exception {
        
       MenuService menu = new MenuService();      
       menu.menu();
    }    
}
