
package pkg2extra.newpackage;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Puntos {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private double x;
   private double x2;
   private double y;
   private double y2; 

    public Puntos() {
    }

    public Puntos(double x, double x2, double y, double y2) {
        this.x = x;
        this.x2 = x2;
        this.y = y;
        this.y2 = y2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public double getX() {
        return x;
    }

    public double getX2() {
        return x2;
    }

    public double getY() {
        return y;
    }

    public double getY2() {
        return y2;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
   
    public void crearpuntos(){
        System.out.println("Ingrese las coordenadas del punto (x,x1):");
        setX(leer.nextDouble());
        setY2(getX());
        System.out.println("Ingrese las coordenadas del punto (y,y1):");
        setY(leer.nextDouble());
        setX2(getY());
        calculardistancia();
    }
    public void calculardistancia(){
        System.out.println("Se calculará la distancia entre ambos puntos: ");
        System.out.println("La distancia entre ambos puntos es de "+(sqrt(pow((getX()-getX2()),2)+pow(getY()-getY2(),2))));
    }
}
