
import java.util.Scanner;

/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
 */


public class G1ejercicio13extra {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba el numero de familias:");
        int n = leer.nextInt(); int x=0; int suma=0; int z=0; int y=0;int suma2=0;
        while(x!=n){
            System.out.println("Ahora ingrese la cantidad de hijos de la familia "+x);
            int m = leer.nextInt();
            x++;
            suma = suma+m;
        }
        while(z!=suma){
            System.out.println("Ahora ingrese la edad de cada hijo:");
          y = leer.nextInt();
          z++;
          suma2=suma2+y;
        }
        System.out.println("El promedio de edad de los hijos es de "+(suma2/z));
    }   
}
