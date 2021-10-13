
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */


public class G1ejercicio5extra {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la clase de socio (A,B o C):");
     String s = leer.next();
     System.out.println("Ingrese el importe a pagar:");
     int n = leer.nextInt();
     s=toUpperCase(s);
     switch(s){
         case "A":
             System.out.println("El importe a pagar por el socio sera de "+ (n*.50)+"$");
             break;
         case "B":
             System.out.println("El importe a pagar por el socio sera de "+ (n*.35)+"$");
         case "C":
             System.out.println("El importe a pagar por el socio sera de "+n+"$");  
         default:
             System.out.println("Esa no es una clase de socio.");
     }
    }  
}
