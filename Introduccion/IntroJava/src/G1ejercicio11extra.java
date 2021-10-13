
import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división.
 */


public class G1ejercicio11extra {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int x=0;
        System.out.println("Ingrese un numero entero:");
        int n = leer.nextInt();
        while(n>0){
            n=n/10;
            Math.round(n);
            x=x+1;
        }
        System.out.println("El numero ingresado tiene "+x+" digitos.");
    }   
}
