
import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class G1ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros positivos: ");
        int n = leer.nextInt();
        int n2 = leer.nextInt();
        boolean var = false;
 try{
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
                    System.out.println("La suma de ambos numeros es " + (n + n2));
                    continue;
                case 2:
                    System.out.println("La resta de ambos numeros es " + (n - n2));
                    continue;
                case 3:
                    System.out.println("La multiplicacion de ambos numeros es " + (n * n2));
                    continue;
                case 4:
                    if(n2>0){
                        System.out.println("La división de ambos numeros es " + (n / n2));
                    }else System.out.println("No se puede dividir por cero.");
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
                default: System.out.println("Esa no es una opción.");
            }

        } while (var != true);
    }catch(Exception valores){
        System.out.println("Estas ingresando un dato no válido.");       
    }
}
}