
import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */


public class G1ejercicio10extra {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int n = (int)(Math.random()*10); int x=0;
     int n2 = (int)(Math.random()*10);
     do{
         System.out.println("Adivine el resultado de la multiplicación:");
         x=leer.nextInt();
         if (x==(n*n2)){
             System.out.println("Adivinaste!!");
         }else System.out.println("No es ese el resultado.");
     }while(x!=(n*n2));
    }    
}
