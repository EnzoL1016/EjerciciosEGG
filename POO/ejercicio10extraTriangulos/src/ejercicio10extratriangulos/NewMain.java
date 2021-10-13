/*
Definir una clase triangulo que modelara triángulos isósceles.
Definir los atributos necesarios para operar.
Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
 Calcular área
 Calcular perímetro
 Mostrar los datos del triángulo que tenga el área de mayor superficie
 */
package ejercicio10extratriangulos;


import java.util.Arrays;

import java.util.Scanner;

public class NewMain {
    
 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Triangulo ss = new Triangulo();
        int x = 1;
        int area = 0;
        int perimetro = 0;
        Triangulo n[] = new Triangulo[4];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Ingrese los datos del triangulo " + x + ":");
            System.out.println("Ingrese las medidas del lado A: ");
            int a = leer.nextInt();
            ss.setLadoa(a);
            System.out.println("Ingrese las medidas del lado B: ");
            int b = leer.nextInt();
            ss.setLadob(b);
            System.out.println("Ingrese las medidas del lado C: ");
            int c = leer.nextInt();
            ss.setLadoc(c);
            ss.comprobartriangulo();
            area = ss.calculararea();
            perimetro = ss.calcularperimetro();
            leer.nextLine();
            x++;
            n[i] = new Triangulo(a, b, c, area, perimetro);
        }       
        Arrays.sort(n);
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("");
        System.out.println("Se mostrará en pantalla los datos del triangulo con el area mas grande: ");
        System.out.println("Area: " + n[3].getArea() + "\n" + "Perimetro: " + n[3].getPerimetro() + "\n" + "Lado A: " + n[3].getLadoa() + "\n" + "Lado B: " + n[3].getLadob() + "\n" + "Lado C: " + n[3].getLadoc());
    }
}
