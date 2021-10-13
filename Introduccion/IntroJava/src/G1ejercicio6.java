
import java.util.Scanner;

/*
Implementar un programa que ingresados dos numeros entero determine cual
es el mayor y lo muestre por pantalla

 */


public class G1ejercicio6 {


    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
         System.out.println("Ingrese dos numeros enteros: ");
        int num =leer.nextInt();
        int num2= leer.nextInt();
        System.out.println("");
        System.out.println("El numero mayor ingresado es "+ Math.max( num,num2));
    }
    
}
