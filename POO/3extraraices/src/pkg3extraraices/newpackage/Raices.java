
package pkg3extraraices.newpackage;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Raices {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Scanner getLeer() {
        return leer;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void llenarvalores(){
        System.out.println("Ingrese el valor de (a):");
        setA(leer.nextDouble());
        System.out.println("Ingrese el valor de (b):");
        setB(leer.nextDouble());
        System.out.println("Ingrese el valor de (c):");
        setC(leer.nextDouble());
        getDiscriminante();
    }
    public void getDiscriminante(){
        System.out.println("A continuación se calculará el valor del discriminante...");
        System.out.println("El valor del discriminante es de "+((pow(getB(),2))-4*getA()*getC()));
        System.out.println("");
        tieneraices();
    }
    public void tieneraices(){
        boolean z=false;
        System.out.println("A continuacion se evaluará si la ecuación tiene raices...");
        double x = (pow(getB(),2))-4*getA()*getC();
        if(x==0){
            z=true;
            System.out.println(z);
        }else System.out.println(z);
        obtenerraices(z);
    }
    public void obtenerraices(boolean z){
        if (z=true){
            System.out.println("Las raices de la ecuación son: "+((-getB()+sqrt(pow(getB(),2)-4*getA()*getC()))/2*getA())+"\n"+((-getB()-sqrt(pow(getB(),2)-4*getA()*getC()))/2*getA()));
        }
        calcular(z);
    }
    public void  calcular(boolean z){
        if(z=true){
        System.out.println("Las posibles soluciones son: ");
        System.out.println("x1: "+((-getB()+sqrt(pow(getB(),2)-4*getA()*getC()))/2*getA()) );
        System.out.println("x2: "+((-getB()-sqrt(pow(getB(),2)-4*getA()*getC()))/2*getA()));
    }else{ System.out.println("No se encontraron soluciones posibles");
}
}
}   