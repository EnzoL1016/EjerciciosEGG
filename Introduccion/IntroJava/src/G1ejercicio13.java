
import java.util.Scanner;

/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */


public class G1ejercicio13 {

    
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   int suma=0;
        System.out.println("Escriba un valor límite:");
        int n = leer.nextInt();
        do{ System.out.println("Escriba un valor ");
            int n1 = leer.nextInt();
            suma = suma + n1;
        } while (suma<n);
        System.out.println("La suma de los numeros ingresados superó el limite establecido: " + suma);
    }
    
}
