package excepcionesej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesEJ3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Ingrese dos numeros para dividir: ");
            System.out.print("Numero A: ");
            String a = leer.next();
            System.out.print("Numero B: ");
            String b = leer.next();
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            System.out.println("La division de los numeros ingresados es " + DivisionNumero.dividirnumbers(aa, bb));
        } catch (InputMismatchException a) {
            System.out.println("El dato ingresado es invalido.");
        } catch (NumberFormatException a) {
            System.out.println("El valor ingresado no puede convertirse a entero.");
        } catch (ArithmeticException a) {
            System.out.println("No se puede divir por cero.");
        }

    }

}
