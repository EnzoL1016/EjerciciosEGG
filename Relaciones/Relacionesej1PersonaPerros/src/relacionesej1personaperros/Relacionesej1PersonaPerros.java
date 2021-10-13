/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package relacionesej1personaperros;

import entidades.Adopcion;
import entidades.Metodos;
import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Relacionesej1PersonaPerros {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<Perro> n = new ArrayList();
        Metodos.llenarPerros(n);
        ArrayList<Persona> p = new ArrayList();
        Metodos.llenarPersonas(p);
        ArrayList<Adopcion> a = new ArrayList();
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i).getNombre() + " escriba el nombre de la mascota que desea adoptar: ");
            String nombremascota = leer.next();
            int pos = 0; Adopcion e = null; int per=i;
            Metodos.buscarmascota(n, nombremascota, pos,e,a,p,per);                     
        }
        Metodos.mostraradopciones(a);
    }  
}
