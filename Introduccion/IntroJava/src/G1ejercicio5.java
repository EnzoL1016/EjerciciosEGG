
import java.util.Scanner;

/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número.
 */


public class G1ejercicio5 {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        System.out.println("Ingrese un numero:");
       int num =leer.nextInt();
        System.out.println("");
        System.out.println("El DOBLE del numero ingresado es "+num*2);
        System.out.println("");
        System.out.println("El TRIPLE del numero ingresado es "+num*3);
        System.out.println("");
        System.out.println("La RAIZ CUADRADA del numero ingresado es "+ Math.sqrt(num));
        
    }
    
}
