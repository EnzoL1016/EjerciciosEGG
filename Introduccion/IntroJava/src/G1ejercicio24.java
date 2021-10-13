
import java.util.Scanner;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre traspuesta.
 */

public class G1ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];
        
        //Rellenamos la matriz con numeros aleatorios:
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Se rellenó una matriz:");
        
        //Mostramos la matriz original:
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        
        //Realizamos la trasposicion de la matriz:
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                traspuesta[y][x] = matriz[x][y];
            }
        }
        System.out.println("La matriz traspuesta sería:");
        
        //Mostramos la matriz traspuesta:
        for (int x = 1; x < 4; x++) {
            for (int y = 1; y < 4; y++) {
                System.out.print(" [" + traspuesta[x][y] + "] ");
            }
            System.out.println("");
        }
    }
}
