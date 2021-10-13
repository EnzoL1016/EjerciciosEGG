
import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
public class G1ejercicio4extra {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
          int salir =0;
         do {
            System.out.println("Ingrese un numero del 1 al 10 (11 para salir):");
            int n = leer.nextInt();
           
            switch (n) {
                case 1:
                    System.out.println("El numero en romano es I");
                    continue;
                case 2:
                    System.out.println("El numero en romano es II");
                    continue;
                case 3:
                    System.out.println("El numero en romano es III");
                    continue;
                case 4:
                    System.out.println("El numero en romano es IV");
                    continue;
                case 5:
                    System.out.println("El numero en romano es V");
                    break;
                case 6:
                    System.out.println("El numero en romano es VI");
                    continue;
                case 7:
                    System.out.println("El numero en romano es VII");
                    continue;
                case 8:
                    System.out.println("El numero en romano es VIII");
                    continue;
                case 9:
                    System.out.println("El numero en romano es IX");
                    continue;
                case 10:
                    System.out.println("El numero en romano es X");
                case 11:
                    salir = 11;
                default:
                    System.out.println("Ese no es un numero del 1 al 10");
            }
        } while (salir != 11);
    }
}
