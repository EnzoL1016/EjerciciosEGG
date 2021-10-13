
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
 */


public class G1ejercicio22extra {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     String[] l = {"1","2","3","4","5","6","7","8","9"}; 
        System.out.println("Ingrese las palabras que se incluiran en la sopa de letras (de 3 a 5 letras)");
        String[] p = new String[5];int x=0;
        for(int i=0;i<5;i++){
          p[i]= leer.next();           
        }        
        String [][] sopa = new String [20][20];
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
        sopa[i][j]= l[(int)(Math.random()*8)];
                for (int k = 0; k < p.length; k++) {
                   sopa[i][j]= substring(p[k],x,x);
                    x++;
                }
        
     }          
    }                
        
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                System.out.print("["+sopa[i][j]+"]");           
            }
            System.out.println("");
        }
}
}