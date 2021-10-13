
import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
 */


public class G1ejercicio17extra {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de valores que tendrá el vector: ");
        int n = leer.nextInt();int suma=0;
        int [] vector = new int[n];
        System.out.println("Rellene el vector con valores:");
       for (int i=0;i<n;i++){
           vector[i]=leer.nextInt();
           suma=suma+vector[i];
       }
        System.out.println("La suma de todos los valores del vector es de "+suma);
    }    
}
