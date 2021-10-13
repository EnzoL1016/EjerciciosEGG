
import java.util.Scanner;

/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class G1ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n[] = new int[4];
        System.out.println("A continuacion ingrese 4 numeros del 1 al 20:");
        for (int i = 0; i < n.length; i++) {
            n[i] = leer.nextInt();
            if (n[i] > 0 && n[i] <= 20) {
                System.out.println("El numero es correcto, se mostrara en pantalla.");
            }
            System.out.print(n[i]);
            for (int j = 0; j < n[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
