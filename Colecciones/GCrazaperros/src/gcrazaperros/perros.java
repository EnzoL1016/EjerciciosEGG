
package gcrazaperros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class perros {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private String raza;
    private ArrayList <String> perros;

    public perros() {
        this.perros = new ArrayList();
    }

  
    public void crearraza(){
        boolean x = false;      
        do{
        System.out.println("Ingrese una raza de perro: ");
        raza = leer.next();
        perros.add(raza);
            System.out.println("¿Desea ingresar otra raza?");
            String xx = leer.next();
            String zz = toUpperCase(xx);           
            if(zz.equals("N")){
                x=true;
            }
        }while(x==false);
        mostrarrazas();
        analizarlista();
                
    }

   public void mostrarrazas(){
       System.out.println("Las razas de perros ingresadas son:");
       for (int i = 0; i < perros.size(); i++) {
           System.out.println(perros.get(i));
       }
   }
   public void analizarlista(){
       Iterator <String> it = perros.iterator();
       System.out.println("Ingrese una raza de perro y si se encuentra en la lista será eliminada: ");
       String replace = leer.next();
       int auxx=perros.size(); 
       while (it.hasNext()){            
           String aux = it.next();         
           if(aux.equals(replace)){              
               it.remove();              
           }
       }
           if(auxx>perros.size()){
             System.out.println("Se encontró la raza ingresada, ha sido eliminada");
              perros.forEach((e)-> System.out.println(e));
           }else { System.out.println("La raza ingresada no se encontró");          
               perros.forEach((e)-> System.out.println(e)); 
           }      
       }
   }
    

