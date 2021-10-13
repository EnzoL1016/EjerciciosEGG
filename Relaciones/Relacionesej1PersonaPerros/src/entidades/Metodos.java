
package entidades;

import java.util.ArrayList;
import static relacionesej1personaperros.Relacionesej1PersonaPerros.leer;


public class Metodos {
    
    public static void llenarPerros(ArrayList<Perro> n) {
        Perro p1 = new Perro("Chiquito", "Beagle", 4, "Mediano");
        n.add(p1);
        Perro p2 = new Perro("Otto", "Chihuahua", 1, "Chico");
        n.add(p2);
        Perro p3 = new Perro("Lisa", "Collie", 8, "Grande");
        n.add(p3);
        Perro p4 = new Perro("Nacha", "Labrador", 3, "Grande");
        n.add(p4);
        Perro p5 = new Perro("Pipo", "Callejero", 7, "Mediano");
        n.add(p5);
    } 
    
    public static void llenarPersonas(ArrayList<Persona> p) {
        Persona n = new Persona("Hernesto", "Jerulio", 33, 37546322);
        p.add(n);
        Persona n2 = new Persona("Juan", "Cortez", 30, 38547326);
        p.add(n2);
        Persona n3 = new Persona("Juliana", "Lopez", 25, 40549342);
        p.add(n3);
        Persona n4 = new Persona("Peter", "Capusotto", 40, 32745329);
        p.add(n4);
        Persona n5 = new Persona("Lucia", "Morales", 31, 38046742);
        p.add(n5);
    }
    
    public static void buscarmascota(ArrayList<Perro> n, String nombremascota, int pos, Adopcion e,ArrayList<Adopcion> a,ArrayList<Persona> p,int per) {
        pos = -1;
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i).getNombre().equalsIgnoreCase(nombremascota)) {
                pos = i;
            }
        }
        if (pos != -1) {
            System.out.println("Oh, has elegido a " + n.get(pos).getNombre() + " que sean muy felices!");
             e = new Adopcion(p.get(per), n.get(pos));
                a.add(e);
                n.remove(pos);
        }else{
            System.out.println(nombremascota+" ya ha sido adoptado, porfavor elija otra mascota.");
                nombremascota = leer.next();
                buscarmascota(n, nombremascota, pos,e,a,p,per);
        }
    }
    
    public static void mostraradopciones(ArrayList<Adopcion> a) {
        System.out.println("");
        System.out.println("Ahora se mostrara a las mascotas con sus nuevos dueños: ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < a.size(); i++) {
            
            System.out.println(a.get(i).toString());
            System.out.println("----------------------------------");
        }
    }
    
}
