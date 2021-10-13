
import java.util.Scanner;

/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */


public class G1ejercicio19extra {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de valores del vector:");
        int n = leer.nextInt();
    int []vector=new int [n];
    rellenarv(vector,n);
    }
  public static void rellenarv(int[] vector,int n){
      System.out.println("Se rellenara el vector con valores aleatorios");
      System.out.println("");
    for (int i=0;i<n;i++){
        vector[i]=(int)(Math.random()*10);
    }
   mostrarv(vector,n);   
  } 
  public static void mostrarv(int [] vector,int n){
      System.out.println("El vector quedó así:");
    for (int i=0;i<5;i++){
        System.out.print("["+vector[i]+"]");
    } 
      System.out.println("");
  }
}
