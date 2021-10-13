
import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */


public class G1ejercicio4 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una temperatura en grados centigrados: ");
        int grados = leer.nextInt();
        System.out.println("");
        System.out.println("La temperatura ingresada pero en grados Fahrenheit es: " +(32+(9*grados/5))+"ºF");
                
    }
    
}
