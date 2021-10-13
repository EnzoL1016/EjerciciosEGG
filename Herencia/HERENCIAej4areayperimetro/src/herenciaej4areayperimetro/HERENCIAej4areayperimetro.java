package herenciaej4areayperimetro;


import clases.Circulo;
import clases.Formas;
import clases.Rectangulo;
import java.util.Scanner;

public class HERENCIAej4areayperimetro {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Formas f = new Formas();
        Rectangulo r = new Rectangulo();
        Circulo c = new Circulo();       
        System.out.println("Ingrese la base: ");
        r.setBase(leer.nextInt());
        System.out.println("Ingrese la altura: ");
        r.setAltura(leer.nextInt());        
        System.out.println("Ingrese el radio del circulo: ");
        c.setRadio(leer.nextInt());
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("El area del triangulo es: " + f.calcularAreaRectangulo(r.getBase(), r.getAltura()));
        System.out.println("El perimetro del triangulo es: " + f.calcularPerimetroRectangulo(r.getBase(), r.getAltura()));
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("El area del circulo es: " + f.calcularAreaCirculo(c.getRadio()));
        System.out.println("El Perimetro del circulo es: " + f.calcularPerimetroCirculo(c.getRadio()));
        System.out.println("________________________________________________");
    }

}
