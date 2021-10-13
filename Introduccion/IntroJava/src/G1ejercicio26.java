
import java.util.Scanner;

/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class G1ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los valores cuadrados que tendrá la matriz:");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Ahora ingrese los valores que se guardaran en la matriz (del 1 al 9):");

        //Rellenamos la matriz comprobando que los valores sean correctos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] > 0 && matriz[i][j] <= 9) {
                    System.out.println("El valor ingresado es correcto.");
                } else {
                    System.out.println("El valor ingresado es incorrecto, no encontraras una matriz mágica asi.");
                }
            }
        }

        //Chequeamos que la matriz sea magica con un vector que sumara los valores de cada fila y los comparara con una variable logica
        int sumacolum = 0;
        int filas = 0;
        int sumadiagonal = 0;
        boolean a = false;
        for (int i = 0; i < matriz.length; i++) {
            sumacolum=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumacolum+= matriz[i][j];               
            }
        }
      for (int i = 0; i < matriz.length; i++) {
            sumacolum=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumacolum+= matriz[i][j];               
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            sumadiagonal = sumadiagonal + matriz[i][i];
        }
        if ((sumadiagonal == sumacolum) && (sumacolum == sumacolum)) {
            a = true;
            System.out.println("Has hallado una matriz mágica!!");
        } else {
            System.out.println("No has hallado una matriz mágica.");
        }
        System.out.println("");

        //Finalmente mostramos la matriz con los valores de sus sumas
        if (a == true) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(" [" + matriz[i][j] + "] ");
                }
                System.out.println("=" + sumacolum);
            }
            System.out.println("  ||  ||   ||   `");
            System.out.println("  " + sumacolum + "  " + sumacolum + "   " + sumacolum + "      " + sumadiagonal);
        }
    }
}
