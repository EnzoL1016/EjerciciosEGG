
import java.util.Scanner;

/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 */


public class G1ejercicio8 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
         String aux= "eureka";
         System.out.println("Ingrese una frase: ");
         String frase = leer.next();
         if (aux.equals(frase))
             System.out.println("Correcto!");
         else
             System.out.println("Incorrecto!");
         
    }
    
}
