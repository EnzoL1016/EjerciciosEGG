
import java.util.Scanner;

/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
 */


public class G1ejercicio17 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     for (int i=0; i<=9; i++){
         for (int j=0; j<=9; j++){
             for(int z=0; z<=9; z++){
                 System.out.print(i != 3 ? i: "E");   //La expresión (i != 3 ? i: "E")Es lo mismo que decir if(i!=3) entonces escribir i sino escribir "E" )
                 System.out.print("-");
                 System.out.print(j != 3 ? j: "E");
                 System.out.print("-");
                 System.out.println(z != 3 ? z: "E");
                }         
           }
    }
}  
}
