
import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */


public class G1ejercicio18extra {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese la cantidad de valores de los vectores:");
         int n = leer.nextInt();
         int [] vector = new int [n]; int []vector2= new int[n]; int x=0;       
         for(int i=0;i<n;i++){
            vector[i]= (int)(Math.random()*10);              
            }       
         for(int i=0;i<n;i++){
            vector2[i]= (int)(Math.random()*10);          
            }
         System.out.println("Vector 1:");
         for(int i=0;i<n;i++){
             System.out.print(" ["+vector[i]+"] ");              
            }
         System.out.println("");
         System.out.println("vector 2:");
         for(int i=0;i<n;i++){
             System.out.print(" ["+vector2[i]+"] ");              
            }
         for (int i=0;i<n;i++){
         if(vector[i]==vector2[i]){
             x=x+1;
         }         
        }
         System.out.println("");
         if(x==n){
             System.out.println("Los vectores son iguales.");
         }else System.out.println("Los vectores no son iguales.");
    }
}

