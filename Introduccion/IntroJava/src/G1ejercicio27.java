
import java.util.Scanner;

/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
public class G1ejercicio27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {67, 78, 87, 45, 89, 90, 75, 42, 56, 78},
        {24, 67, 97, 46, 14, 22, 26, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        int[][] matrizb = {{36, 5, 67},
                          {89, 90, 75},
                          {14, 22, 26}};
        encontrarmatriz(matriz, matrizb);
    }

    public static void encontrarmatriz(int[][] matriz, int[][] matrizb) {
        boolean aux;
        for (int i = 0; i < matriz.length - 2; i++) {
            for (int j = 0; j < matriz.length - 2; j++) {

                aux = true;

                for (int k = 0; k < matrizb.length; k++) {
                    for (int l = 0; l < matrizb.length; l++) {
                        if (matriz[i + k][j + l] != matrizb[k][l]) {
                            aux = false;
                            break;
                        }
                    }
                }
                if (aux) {
                    System.out.println("Se ha encontrado la matriz P en la fila " + i + " y la columna " + j + " de M.");
                    return;
                }
            }         
        }
           System.out.println("No se ha encontrado la matriz P.");
    }
}
