
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANI
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String n = leer.next();
 System.out.println("Ingrese una letra para evaluar cuantas veces se repite:");
        String x = leer.next();
        int cont = 0;       
        for (int i = 0; i < n.length(); i++) {
            if (x.equals(n.substring(0, n.length()))) {
                cont++;
            }
        }
        System.out.println("La letra se repite un total de " + cont + " veces");
    }
    
}
