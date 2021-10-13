
import java.util.Scanner;

/*
Crear un programa que dado un numero determine si es par o impar
 */

public class G1ejercicio7 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        System.out.println("");
       if (num%2==0)
        System.out.println("El numero que ingresaste es par.");
       else 
        System.out.println("El numero que ingresaste es impar.");
    }
    }
    

