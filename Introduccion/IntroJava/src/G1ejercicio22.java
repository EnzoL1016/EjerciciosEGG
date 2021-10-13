
import java.util.Scanner;

/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido.
 */
public class G1ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean buscar = false;
        System.out.println("Ingrese el numero de valores que tendra el vector:");
        int n = leer.nextInt();
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(" [" + x[i] + "] ");
        }
        System.out.println("");
        System.out.println("Ingrese el valor que desea buscar dentro del vector:");
        int b = leer.nextInt();
        for (int i = 0; i < x.length; i++) {
            if (b == x[i]) {
                System.out.println("El valor ingresado existe y se encuentra en la posición " + i);
                buscar = true;
            }
        }
        if (!buscar) {
            System.out.println("El valor ingresado no se encuentra en el vector.");
        }
    }
}
