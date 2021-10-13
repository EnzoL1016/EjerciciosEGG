/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package gcpaises;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class GCpaises {

   private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
     Set <Paises> paises = new HashSet();
     Paises n = new Paises();
     boolean x=false;
        System.out.println("Ingrese un pais para añadir al conjunto: ");
     do{
         n.setPaises(leer.next());
         paises.add(new Paises(n.getPaises()));
         System.out.println("Pais agregado con exito!!");
         System.out.println("----------------------------------------");
         System.out.println("¿Desea agregar otro pais?");
         String nn = leer.next();
         if(nn.equalsIgnoreCase("N")){
             x=true;
         }else if(nn.equalsIgnoreCase("S")){
             System.out.println("Ingrese el pais: ");
         }else{System.out.println("Opción incorrecta");
          System.out.println("¿Desea agregar otro pais?");
          nn = leer.next();
         }
     }while(!x);
        System.out.println("Se mostraran todos los paises ingresados: ");
     for (Paises paise : paises) {
            System.out.println(paise);
        }
      ArrayList <Paises> orden = new ArrayList(paises);
     ordenarpaisesalf(orden,n);     
     buscaryeliminarpais(orden,paises,n);
    }
    public static void ordenarpaisesalf(ArrayList <Paises> orden,Paises n){
       
        System.out.println("A continuación se mostraran los paises ordenados alfabeticamente: ");
        Collections.sort(orden, Comparador.ordenaralfabeticamente); 
        System.out.println("Paises ingresados: ");
         for (Paises paise : orden) {
            System.out.println(paise);
        }         
    }
    public static void buscaryeliminarpais(ArrayList <Paises> orden,Set <Paises> paises,Paises n){
        boolean esta=false;
        System.out.println("Ingrese un pais para buscar y si se encuentra se eliminará: ");
        String pa = leer.next();
        orden.add(new Paises (pa));     
        for(Iterator <Paises> it = paises.iterator(); it.hasNext();){
          Paises auxx = it.next();
          if(auxx.equals(new Paises (pa))){
          it.remove(); 
          esta=true;
          System.out.println("Se encontró el pais ingresado, ha sido eliminado");
          paises.forEach((e)-> System.out.println(e));
          }
        }
        if(!esta){
             System.out.println("El pais ingresado no se encontró");          
             paises.forEach((e)-> System.out.println(e)); 
        }
    }
}
