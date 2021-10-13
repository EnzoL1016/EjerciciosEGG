package rectangulos.newpackage;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static void crearrect(Rectangulo rect) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectángulo: ");
        rect.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo: ");
        rect.setAltura(leer.nextInt());
        superficie(rect);
        perimetro(rect);
        dibujar(rect);
    }

    public static void superficie(Rectangulo rect) {
        System.out.println("La superficie del rectángulo ingresado es de: " + (rect.getBase() * rect.getAltura()));
    }

    public static void perimetro(Rectangulo rect) {
        System.out.println("El perímetro del rectángulo ingresado es de: " + ((rect.getBase() + rect.getAltura()) * 2));
    }

    public static void dibujar(Rectangulo rect) {
        
        System.out.println("El rectángulo queda representado de la siguiente manera: ");
        System.out.println("");
        for (int i = 1; i <= rect.getAltura(); i++) {
            for (int j = 1; j <= rect.getBase(); j++) {
                if (i == 1 || i == rect.getAltura() || j == 1 || j == rect.getBase()) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

