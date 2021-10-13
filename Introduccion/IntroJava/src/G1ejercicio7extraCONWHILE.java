
import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */


public class G1ejercicio7extraCONWHILE {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int n=1;int mayor=0; int menor=0;int x=0;int suma=0;
     while (n>0){
         System.out.println("Ingrese un valor:");
         n= leer.nextInt();
         if (n>mayor){
             mayor=n;
     }
         if(n<menor){
             menor=n;
         }
         x=x+1;
         suma=suma+n;
    }
        System.out.println("El valor máximo ingresado es de "+mayor);
        System.out.println("El valor mínimo ingresado es de "+menor);
        System.out.println("El promedio de los valores ingresados es de "+(suma/x));
    
}
}
