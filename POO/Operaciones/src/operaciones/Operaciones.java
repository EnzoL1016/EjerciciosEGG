/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package operaciones;

import java.util.Scanner;
import operaciones.newpackage.Operacion;
import static operaciones.newpackage.Operacion.crearOperacion;
import static operaciones.newpackage.Operacion.dividir;
import static operaciones.newpackage.Operacion.multiplicar;
import static operaciones.newpackage.Operacion.restar;
import static operaciones.newpackage.Operacion.sumar;


public class Operaciones {

    
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Operacion cuentas = new Operacion();
    crearOperacion(cuentas);
        System.out.println("Elija una opción:"+"\n"+"1)-Sumar"+"\n"+"2)-Restar"+"\n"+"3)-Multiplicar"+"\n"+"4)-Dividir");
        int n = leer.nextInt();
    switch(n){
        case 1:
            sumar(cuentas);
            break;
        case 2:
            restar(cuentas);
            break;
        case 3:
            multiplicar(cuentas);
            break;
        case 4: 
          dividir(cuentas);
            break;
        default: System.out.println("El dato ingresado no es válido.");           
    } 
    }
    
   
}
