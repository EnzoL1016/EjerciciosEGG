
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.
 */


public class G1ejercicio3extra {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una letra:");
        String l = leer.next();
        l= toUpperCase(l);
        if (l.equals("A")|| l.equals("E")|| l.equals("I") || l.equals("O")|| l.equals("U")){
            System.out.println("La letra es una vocal.");          
        }else System.out.println("La letra no es una vocal.");
    }
    
}
