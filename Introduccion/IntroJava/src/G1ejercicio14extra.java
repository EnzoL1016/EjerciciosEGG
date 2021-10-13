
import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */


public class G1ejercicio14extra {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese dos numeros enteros positivos: ");
        int n = leer.nextInt();
        int n2 = leer.nextInt();
        boolean var = false;

        do {
            System.out.println("Elija que hacer con ambos numeros: ");
            System.out.println("1)- Sumar");
            System.out.println("2)- Restar");
            System.out.println("3)- Multiplicar");
            System.out.println("4)- Dividir");
            System.out.println("5)- Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                     sumarnum(n,n2);
                    continue;
                case 2:
                    restarnum(n,n2);
                    continue;
                case 3:
                    multnum(n,n2);
                    continue;
                case 4:
                    divnum(n,n2);
                    continue;
                case 5:
                    System.out.println("Desea salir? (s/n)");
                    String salir = leer.next();
                    if (salir.equals("n")) {
                        break;
                    } else if  (salir.equals("s")){
                        
                        var = true;
                    }else System.out.println("Esa no es una opción.");
                    continue;
            }

        } while (var != true);
    }
 public static void sumarnum(int n, int n2){
     System.out.println("La suma de ambos numeros es de "+(n+n2));
} 
 public static void restarnum(int n, int n2){
     System.out.println("La resta de ambos numeros es de "+(n-n2));
}  
 public static void multnum(int n, int n2){
     System.out.println("La multiplicación de ambos numeros es de "+(n*n2));
}  
 public static void divnum(int n, int n2){
     System.out.println("La división de ambos numeros es de "+(n/n2));
} 
}


