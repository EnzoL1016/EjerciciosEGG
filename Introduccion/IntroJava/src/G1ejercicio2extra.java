
import java.util.Scanner;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */


public class G1ejercicio2extra {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int A,B,C,D; int aux=0;
        System.out.println("Ingrese valor de A:");
        A=leer.nextInt();
        System.out.println("Ingrese el valor de B:");
        B=leer.nextInt();
        System.out.println("Ingrese el valor de C:");
        C=leer.nextInt();
        System.out.println("Ingrese el valor de D:");
        D=leer.nextInt();      
        aux=B;B=C;C=A;A=D;D=aux;      
        System.out.println("El valor de A pasa a ser el valor de D: "+A);
        System.out.println("El valor de B pasa a ser el valor de C: "+B);
        System.out.println("El valor de C pasa a ser el valor de A: "+C);
        System.out.println("El valor de D pasa a ser el valor de B: "+A);
    }
    
}
