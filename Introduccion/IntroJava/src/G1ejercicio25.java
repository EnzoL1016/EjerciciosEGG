
import java.util.Arrays;
import java.util.Scanner;

/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 */


public class G1ejercicio25 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese las dimensiones cuadradas de la matriz:");
    int n = leer.nextInt();
    int [][] matriz = new int [n][n];
    int [][] matrizT= new int [n][n];
    int [][] matrizN = new int [n][n];
    
    
    //Llenamos la matriz con valores seleccionados:
        System.out.println("A continuación ingrese los valores que tendrá la matriz:");
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }   
    //Generamos una matriz traspuesta a la original:
    for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    matrizT[y][x] = matriz[x][y];
    }    
}
    //Generamos una matriz que sea negativa de la original:
    for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    matrizN[x][y] = -matriz[x][y];
}
}
    //Comparamos las matrices para saber si la original es antisimetrica:
    if (Arrays.deepEquals(matrizN, matrizT))
  System.out.println("Es una Matriz Antisimétrica");
  else
  System.out.println("No es una Matriz Antisimétrica");   
    }
}