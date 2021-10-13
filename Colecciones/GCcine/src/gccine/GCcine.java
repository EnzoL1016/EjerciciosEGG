/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package gccine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GCcine {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Pelicula n = new Pelicula();
        boolean x = false;
        int xx = 0;
        ArrayList<Pelicula> pelis = new ArrayList();
        System.out.println("A continuación ingresará una nueva película...");
        System.out.println("");
        do {
            System.out.println("Ingrese el titulo de la película: ");
            n.setTitulo(leer.next());
            System.out.println("Ingrese la duración de la película (en minutos):");
            n.setDuracion(leer.nextInt());
            System.out.println("Ingrese el nombre del director de la película: ");
            n.setDirector(leer.next());
            pelis.add(new Pelicula(n.getTitulo(), n.getDuracion(), n.getDirector()));
            System.out.println("Pelicula agregada con exito!!");
            System.out.println("---------------------------------------------------");
            System.out.println("¿Desea agregar otra película?");
            String res = leer.next();
            xx++;
            if (res.equalsIgnoreCase("N")) {
                x = true;
            } else if (res.equalsIgnoreCase("S")) {
                System.out.println("A continuación ingrese una nueva película...");
            } else {
                System.out.println("Respuesta no valida...");
                System.out.println("¿Desea agregar otra película?");
                res = leer.next();
            }
        } while (!x);
        mostrardatos(pelis, n, xx);
    }

    public static void mostrardatos(ArrayList<Pelicula> pelis, Pelicula n, int xx) {
        System.out.println("A continuación se mostraran todas las peliculas: ");
        int zz = 1;
        for (int i = 0; i < xx; i++) {
            System.out.println("Pelicula " + (i+1) + ":" + "\n" + pelis.get(i).toString());
            System.out.println("------------------------------------");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("A continuación se mostrarán las peliculas ingresadas con una duración mayor a 1 hora: ");
        for (int i = 0; i < xx; i++) {         
            if (pelis.get(i).getDuracion() > 60) {
                System.out.println("Pelicula " + (i+1) + ":" + "\n" + pelis.get(i).toString());               
                System.out.println("------------------------------------");
            }
            
        }
        System.out.println("---------------------------------------------------");
        System.out.println("A continuación se ordenaron las peliculas por tiempo de duración (de menor a mayor): ");
        Collections.sort(pelis, Comparadores.ordenarporduracionmenamay);
        for (int i = 0; i < xx; i++) {
            System.out.println("Pelicula " + (i+1) + ":" + "\n" + pelis.get(i).toString());            
            System.out.println("------------------------------------");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("A continuación se ordenaron las peliculas por tiempo de duración (de mayor a menor): ");
        Collections.sort(pelis, Comparadores.ordenarporduracionmayamen);
        for (int i = 0; i < xx; i++) {
            System.out.println("Pelicula " + (i+1) + ":" + "\n" + pelis.get(i).toString());
            System.out.println("------------------------------------");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("A continuacion se ordenaron las peliculas por titulo alfabeticamente: ");
        Collections.sort(pelis, Comparadores.ordenarportitulo);
        for (int i = 0; i < xx; i++) {
            System.out.println("Pelicula " + (i+1) + ":" + "\n" + pelis.get(i).toString());
            System.out.println("------------------------------------");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("A continuacion se ordenaron las peliculas por director alfabeticamente: ");
        Collections.sort(pelis, Comparadores.ordenarpordirector);
        for (int i = 0; i < xx; i++) {
            System.out.println("Pelicula " + (i+1) + ":" + "\n" + pelis.get(i).toString());
            System.out.println("------------------------------------");
        }
    }
}
