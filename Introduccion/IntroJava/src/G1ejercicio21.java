
import java.util.Scanner;

/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
public class G1ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n[] = new int[100];
        for (int i = 0; i < n.length; i++) {
            n[i] = i;}             
        int temporal;    
        for (int i = 0; i < n.length / 2; i++) {
            temporal = n[i];
            int indiceContrario = n.length - i - 1;
            n[i] = n[indiceContrario];
            n[indiceContrario] = temporal;}       
        for (int j = 1; j < n.length; j++) {
            System.out.println(n[j]);
        }
    }
}
