/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package gcexxtracantantesfamosos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class GCexxtracantantesfamosos {
    static Scanner leer = new Scanner (System.in).useDelimiter("\n");   
    public static void main(String[] args) {
        
        cantante nuevo = new cantante();
        HashMap <String, String> cantantes = new HashMap();
        System.out.println("A continuación agregaras 5 cantantes (Nombre/Disco):");
        for(int i=0;i<5;i++){
            System.out.println("Cantante "+(i+1)+": ");
            System.out.println("Nombre: ");
            nuevo.setNombre(leer.next());
            System.out.println("Disco más vendido: ");
            nuevo.setDiscomasvendido(leer.next());
            cantantes.put(nuevo.getNombre(),nuevo.getDiscomasvendido());
        }
        System.out.println("--------------------------------------------------");
        menudeopciones(cantantes,nuevo);
    }
     public static void menudeopciones(HashMap <String,String>cantantes,cantante nuevo){
         boolean x=false;
         System.out.println("Muy bien, ya ha ingresado los 5 cantantes, ahora se le mostrará un menú de opciones:");
         do{
             System.out.println("¿Que desea hacer?"+"\n"+"1) Agregar un cantante"+"\n"+"2) Mostrar todos los cantantes"+"\n"+"3) Eliminar un cantante"+"\n"+"4) Salir");
             int op = leer.nextInt();
             switch(op){
                 case 1: 
                     agregarcantante(cantantes, nuevo);
                     continue;
                 case 2:
                    mostrartodosloscantantes(cantantes,nuevo);
                    continue;
                 case 3:
                     eliminaruncantante(cantantes,nuevo);
                     continue;
                 case 4:
                     x=true;
             }
         }while(!x);
         System.out.println("Así quedó la lista mi panita: ");
         int xx=1;
        for (Map.Entry<String, String> aux : cantantes.entrySet()) {
            String key = aux.getKey();
            String value = aux.getValue();
            System.out.println("Cantante "+xx+":" +"\n"+ "Nombre: " + key + "\n" + "Disco más vendido: " + value);
            xx++;
            System.out.println("--------------------------------------------------------------------");
        } 
     }
     public static void agregarcantante(HashMap <String,String>cantantes,cantante nuevo){
         System.out.println("Ingrese los datos del nuevo cantante: ");
         System.out.println("Nombre: ");        
         nuevo.setNombre(leer.next());
         System.out.println("Disco más vendido: ");
         nuevo.setDiscomasvendido(leer.next());
         cantantes.put(nuevo.getNombre(),nuevo.getDiscomasvendido());
         System.out.println("Cantante agregado con exito!");
         System.out.println("--------------------------------------------------");
     }
     public static void mostrartodosloscantantes(HashMap <String,String>cantantes,cantante nuevo){
         int x=1;
       for (Map.Entry<String, String> aux : cantantes.entrySet()) {
            String key = aux.getKey();
            String value = aux.getValue();
            System.out.println("Cantante "+x+":"+"\n" + "Nombre: " + key + "\n" + "Disco más vendido: " + value);
            x++;
            System.out.println("-------------------------------------------------------------------");
        } 
     }
     public static void eliminaruncantante(HashMap <String,String>cantantes,cantante nuevo){
         ArrayList <cantante> buscar = new ArrayList();
         System.out.println("Ingrese el nombre del cantante que desea eliminar: ");
         String name = leer.next();  
         int x = 1;
                  
        for (Iterator <String> iterator = cantantes.keySet().iterator(); iterator.hasNext();) {
            String key = iterator.next();
            if (key.equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
        System.out.println("El cantante fue eliminado con exito!");
     }
}
       

