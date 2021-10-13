
import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
 */


public class G1ejercicio15extra {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String p="S";
    while(p.equals("S")){
        System.out.println("Ingrese el nombre de la persona:");
        String n = leer.next();
        System.out.println("Ingrese la edad de la persona:");
        int e = leer.nextInt();
        System.out.println("Nombre de la persona: "+n+"\n"+"Edad: "+e);
        if(e>18){
            System.out.println("Es mayor de edad.");
        }else System.out.println("Es menor de edad.");
        System.out.println("¿Desea ingresar los datos de otra persona? (S/N)");
        p=leer.next();
        if (p.equals("s")||p.equals("n")||p.equals("S")||p.equals("N")){
        p=p.toUpperCase();
    }else System.out.println("Esa no es una respuesta válida.");   
    }    
}
}