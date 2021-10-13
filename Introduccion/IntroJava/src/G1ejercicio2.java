
import java.util.Scanner;

/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */

public class G1ejercicio2 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("A continuacion ingrese su nombre: ");
       String nombre = leer.next();
        System.out.println("Hola " + nombre + " un gusto conocerte!");
    }
    
}
