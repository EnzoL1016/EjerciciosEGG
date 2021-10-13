package excepcionesej4;


import java.util.Scanner;

public class ExcepcionesEJ4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("A continuación se generara un numero entre 1 y 500, deberas adivinarlo...");
        int alea = Metodos.generarespacioaleatorio(1, 500);
        int adivina = 0;
        int x = 1;
        System.out.println(alea);
        System.out.print("Ingrese el numero que cree que ha salido: ");

        do {
            try {
                adivina = leer.nextInt();
                if (adivina > alea) {
                    System.out.println("El numero a adivinar es menor que el ingresado");
                    System.out.print("Prueba de nuevo: ");
                    x++;
                }
                if (adivina < alea) {
                    System.out.println("El numero a adivinar es mayor que el ingresado");
                    System.out.print("Prueba de nuevo: ");
                    x++;
                }
            } catch (Exception a) {
                System.out.println("El dato ingresado no es un entero.");
                System.out.print("Ingresa un numero entero: ");
                leer.nextLine();
                x++;
            }
        } while (adivina != alea);

        System.out.println("");
        System.out.println("Has adivinado! Luego de " + x + " intentos :D ");
    }
}
