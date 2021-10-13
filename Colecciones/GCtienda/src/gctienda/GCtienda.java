/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
package gctienda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GCtienda {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        productos n = new productos();
        HashMap<String, Integer> Productos = new HashMap();
        boolean x = false;
        System.out.println("Introduce algunos productos iniciales: ");
        do {
            System.out.println("Nombre del producto: ");
            n.setProd(leer.next());
            System.out.println("Precio: ");
            n.setPrecio(leer.nextInt());
            Productos.put(n.getProd(), n.getPrecio());
            System.out.println("¿Desea añadir otro producto?");
            String res = leer.next();
            if (res.equalsIgnoreCase("N")) {
                x = true;
            } else if (res.equalsIgnoreCase("S")) {
                System.out.println("");
            } else {
                System.out.println("Opcion incorrecta");
                System.out.println("¿Desea añadir otro producto?");
                res = leer.next();
            }
        } while (!x);
        System.out.println("A continuación se le mostrará un menu de opciones...");
        System.out.println("-------------------------------------------------------");
        boolean xx=false;
        do{
         System.out.println("¿Que desea hacer?" + "\n" + "1) Añadir producto" + "\n" + "2) Modificar un precio" + "\n" + "3) Eliminar un producto" + "\n" + "4) Mostrar productos" + "\n" + "5) Salir");
        int op = leer.nextInt(); 
        switch (op) {
            case 1:
                añadirelemento(Productos,n);
                continue;
            case 2:              
                modificarprecio(Productos,n);
                continue;
            case 3:
                eliminarunproducto(Productos,n);
                continue;
            case 4:
                mostrarproductos(Productos,n);               
                continue;
            case 5:
                xx=true;
        }
        }while(!xx);
    }

    public static void añadirelemento(HashMap<String, Integer> Productos, productos n) {
        System.out.println("Ingrese los datos del producto que desea añadir: ");
        System.out.println("Nombre del producto: ");
        n.setProd(leer.next());
        System.out.println("Precio: ");
        n.setPrecio(leer.nextInt());
        Productos.put(n.getProd(), n.getPrecio());
        System.out.println("Producto añadido con exito!");
    }

    public static void modificarprecio(HashMap<String, Integer> Productos, productos n) {
        int x = 1;
        System.out.println("A continuacion elija el producto al que quieres modificarle el precio:");
        for (Map.Entry<String, Integer> aux : Productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println(x + ") " + key + "\n" + "Precio: " + value+"$");
            x++;
        }
        String keyy = leer.next();
        System.out.println("Ahora ingrese el precio nuevo: ");
        Integer nuev = leer.nextInt();
        Productos.put(keyy, nuev);
        System.out.println("Precio modificado con exito!");
    }

    public static void eliminarunproducto(HashMap<String, Integer> Productos, productos n) {
        int x = 1;
        System.out.println("A continuacion elije que producto desea eliminar: ");
        for (Map.Entry<String, Integer> aux : Productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println(x + ") " + key + "\n" + "Precio: " + value+"$");
            x++;
        }
         String eli = leer.next();
        for (Iterator <String> iterator = Productos.keySet().iterator(); iterator.hasNext();) {
            String key = iterator.next();
            if (key.equalsIgnoreCase(eli)) {
                iterator.remove();
            }
        }
        System.out.println("El producto fue eliminado con exito!");
    }
    
    public static void mostrarproductos(HashMap<String, Integer> Productos, productos n){
        System.out.println("Los productos que hay actualmente son: ");
        int x=1;
        for (Map.Entry<String, Integer> aux : Productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println(x + ") " + key + "\n" + "Precio: " + value+"$");
            x++;
        }
    }
    
}
