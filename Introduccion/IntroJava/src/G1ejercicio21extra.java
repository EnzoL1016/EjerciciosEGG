
import java.util.Scanner;

/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
 */


public class G1ejercicio21extra {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de filas que tendrá la matriz:");
        int n =leer.nextInt(); int suma =0;
        System.out.println("Ingrese la cantidad de columnas que tendrá la matriz:");
        int m = leer.nextInt();
        System.out.println("");
        int [][] matriz= new int [n][m];
        System.out.println("Se rellenará la matriz con valores aleatorios:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              matriz[i][j]= (int)(Math.random()*10);
              suma=suma+matriz[i][j];
            }
        }
        System.out.println("");
        System.out.println("La matriz queda de la siguiente manera:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("["+matriz[i][j]+"]");   
            }
            System.out.println("");
    }
        System.out.println("");
        System.out.println("La suma de todos los valores de la matriz es "+suma);    
}
}