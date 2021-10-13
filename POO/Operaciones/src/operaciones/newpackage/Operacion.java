
package operaciones.newpackage;

import java.util.Scanner;
import operaciones.Operaciones;


public class Operacion {
    private int n1;
    private int n2;

   

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public Operacion() {
    }
    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public static void crearOperacion(Operacion cuentas){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer valor: ");
        cuentas.setN1(leer.nextInt());
        System.out.println("Ingrese el segundo valor: ");
        cuentas.setN2(leer.nextInt());
    } 
    public static void sumar(Operacion cuentas){
        System.out.println("La suma de los numeros ingresados es: "+(cuentas.getN1()+cuentas.getN2()));         
    } 
    public static void restar(Operacion cuentas){
        System.out.println("La resta de los numeros ingresados es: "+(cuentas.getN1()-cuentas.getN2()));         
    }
    public static void multiplicar(Operacion cuentas){
        System.out.println("La multiplicación de los numeros ingresados es: "+(cuentas.getN1()*cuentas.getN2()));         
    } 
    public static void dividir(Operacion cuentas){
        if(cuentas.getN2()>0 ){
        System.out.println("La división de los numeros ingresados es: "+(cuentas.getN1()/cuentas.getN2()));         
    } else System.out.println("No se puede dividir por cero.");
}
}