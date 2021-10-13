
package clases;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Formas implements Calculos {
    protected Scanner leer = new Scanner (System.in).useDelimiter("\n"); 
    public Formas() {
    }

    @Override
    public double calcularAreaCirculo(int radio) {
        
        return PI*Math.pow(radio,2); 
    }

    @Override
    public double calcularPerimetroCirculo(int radio) {
      return PI*(radio*2);  
    }

    @Override
    public double calcularAreaRectangulo(int base, int altura) {
      return base * altura;  
    }

    @Override
    public double calcularPerimetroRectangulo(int base, int altura) {
      return (base+altura)*2;
    }

    
    
}
