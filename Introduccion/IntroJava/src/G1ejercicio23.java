
import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class G1ejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la cantidad de valores que tendrá el vector:");
        int n = leer.nextInt(); int c1=0;int c2=0;int c3 =0; int c4=0; int c5=0;
        int cifras = 0;       
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
        for (int i = 0; i < vector.length; i++) {
                int digit = Integer.toString(vector[i]).length();
                switch (digit){
                    case 1: c1++;
                    break;
                    case 2: c2++;
                    break;
                    case 3: c3++;
                    break;
                    case 4: c4++;
                    break;
                    case 5: c5++;
                    break;                            
                }
            }
         System.out.println("Se encontraron "+c1+ " numeros de 1 dígito.");
         System.out.println("Se encontraron "+c2+ " numeros de 2 dígitos.");
         System.out.println("Se encontraron "+c3+ " numeros de 3 dígitos.");
         System.out.println("Se encontraron "+c4+ " numeros de 4 dígitos.");
         System.out.println("Se encontraron "+c5+ " numeros de 5 dígitos.");
        }
    }
        
        
        
       
       
       
    


