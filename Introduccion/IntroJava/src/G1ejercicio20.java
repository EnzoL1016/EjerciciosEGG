
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

public class G1ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de euros que desea:");
        int eur = leer.nextInt();
        convertireuros(eur);
    }

    public static void convertireuros(int eur) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        do {
            String cad = "Elija a que moneda quiere convertir los Euros:\n1)-Dólares\n2)-Yenes\n3)-Libras\n4)-Salir";
            System.out.println(cad);
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Los Euros ingresados equivaldrian a " + (eur / 1.28611) + "$ (dólares)");
                    break;
                case 2:
                    System.out.println("Los Euros ingresados equivaldrian a " + (eur * 129.852) + "¥ (yenes)");
                    break;
                case 3:
                    System.out.println("Los Euros ingresados equivaldrian a " + (eur / 0.86) + "£ (libras)");
                    break;
                case 4:
                    salir = true;
            }
        } while (!salir);
    }
}
