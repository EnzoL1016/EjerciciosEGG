
import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */


public class G1ejercicio6extra {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elija la cantidad de personas a la que se le evaluara su altura:");
        int n = leer.nextInt(); double alt;double suma=0; double gen=0; int x=0;int z=0;
        
        do{
            System.out.println("Ingrese la altura:");
            alt=leer.nextDouble();
            gen=gen+alt;
            x=x+1;
            if(alt<=1.60){
                suma=suma+alt;
                z=z+1;
            }
        }while(x!=n);
        System.out.println("El promedio de altura de todas las personas ingresadas es de "+(gen/x)+" mts" );
        System.out.println("El promedio de altura de todas las personas por debajo de 1,60 es de "+(suma/z)+" mts" );
    }    
}
