
import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”.
 */


public class G1ejercicio10 {

    
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
 String aux= "A"; 
        System.out.println("Ingrese una frase o palabra: ");
        String frase= leer.next();
        System.out.println("");
        if (aux.equals(frase.substring(0,1)))
            System.out.println("CORRECTO");
        else 
            System.out.println("INCORRECTO");
                
    }
    
}
