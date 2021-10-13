
package herenciaej2electrodomesticos;

import clases.Electrodomestico;
import clases.Lavadora;
import clases.Televisor;
import java.util.ArrayList;


public class HERENCIAej2Electrodomesticos {

   
    public static void main(String[] args) {
        ArrayList <Electrodomestico> e = new ArrayList(); 
        Lavadora lavadora = new Lavadora();  
        Televisor televisor= new Televisor();
        int suma=0;
        e.add(new Lavadora(25,3000,"Azul",'A',85));
        e.add(new Lavadora(33,3500,"Negro",'A',80));
        e.add(new Televisor(50, true, 3900, "Azul", 'A', 25));
        e.add(new Televisor(42, true, 3900, "Gris", 'A', 20));
        for (int i = 0; i < e.size(); i++) {
            System.out.println("El precio del electrodomestico "+(i+1)+" es: "+e.get(i).getPrecio()+"$");
            suma+=e.get(i).getPrecio();
        }
        System.out.println("La suma total de precios de los 4 electrodomesticos es: "+suma+"$");
    }
    
}
 