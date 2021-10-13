
import java.util.Scanner;

/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”.
 */


public class G1ejercicio9 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba una frase de o palabra, si esta tiene 8 de largo, sera correcta.");
        String frase = leer.next(); 
        int  n = frase.length();
        if (n == 8)
        System.out.println("CORRECTO");
        else
        System.out.println("INCORRECTO");
            
        
    }
    
}
