/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas.
 */
package herencia5ej5edificio;

import clases.Edificio;
import clases.EdificiodeOficinas;
import clases.Polideportivo;
import java.util.ArrayList;

public class HERENCIA5ej5Edificio {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        Polideportivo p = new Polideportivo();
        EdificiodeOficinas o = new EdificiodeOficinas();
        edificios.add(p.crearPolideportivo());
        edificios.add(p.crearPolideportivo());
        edificios.add(o.crearEdificioOficinas());
        o.cantidadPersonas(); 
        edificios.add(o.crearEdificioOficinas());
        o.cantidadPersonas(); 
        System.out.println("_________________________________________________________");
        System.out.println("");
        for (int i = 0; i < edificios.size(); i++) {
            System.out.println("La superficie del edificio " + (i + 1) + " es: " + edificios.get(i).calcularSuperficie(edificios.get(i).getAncho(), edificios.get(i).getLargo()) + " metros cuadrados");
            System.out.println("El volumen del edificio " + (i + 1) + " es: " + edificios.get(i).calcularVolumen(edificios.get(i).getLargo(), edificios.get(i).getAncho(), edificios.get(i).getAlto()) + " metros cubicos");
            System.out.println("_________________________________________________________");
        }
             
        System.out.println("El Polideportivo 1 es "+edificios.get(0).getTecho());
        System.out.println("El Polideportivo 2 es "+edificios.get(1).getTecho());
    }
}
