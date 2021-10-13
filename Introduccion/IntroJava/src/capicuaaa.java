
import java.util.Scanner;

public class capicuaaa {

    public static void main(String[] args) {
        int N, aux, inverso = 0, cifra;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.print("Introduce un número >= 10: ");
            N = leer.nextInt();
        } while (N < 10);

        //le damos la vuelta al número
        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (N == inverso) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }

        System.out.print("Ingresa una palabra y te dire si e capicua: ");
        String capicua = leer.next();
        System.out.println(capicua);
        StringBuilder strb = new StringBuilder(capicua);
        String alreves = strb.reverse().toString();
         if(capicua.equalsIgnoreCase(alreves)){
            System.out.println("Es capicua");
        }else System.out.println("No es capicua");          
    }
}
