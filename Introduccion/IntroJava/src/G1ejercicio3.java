
import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas.
 */


public class G1ejercicio3 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba una frase:");
        String frase= leer.next();
        System.out.println("");
        System.out.println("Su frase en mayúsculas quedaría de la siguiente manera:");
        System.out.println("");
        System.out.println(frase.toUpperCase());
        System.out.println("");
        System.out.println("Su frase en minúsculas quedaría de la siguiente manera:");
        System.out.println("");
        System.out.println(frase.toLowerCase());
    }
    
}
