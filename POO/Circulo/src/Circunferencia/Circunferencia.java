
package Circunferencia;

import java.util.Scanner;



public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   public static void crearCircunferencia(Circunferencia circulo){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio del circulo: ");
        circulo.setRadio(leer.nextDouble());
        area(circulo);
    }
     public static void area(Circunferencia circulo){
         System.out.println("El area de la circunferencia es: "+(Math.PI * circulo.getRadio()));
         perimetro(circulo);
     }
     public static void perimetro(Circunferencia circulo){
         System.out.println("El perímetro de la circunferencia es: "+(2*Math.PI *circulo.getRadio()));
}
    
}
