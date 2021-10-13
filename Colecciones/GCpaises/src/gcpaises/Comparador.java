
package gcpaises;

import java.util.Comparator;


public class Comparador {
   public static Comparator <Paises> ordenaralfabeticamente = new Comparator <Paises>() {     
       @Override
       public int compare(Paises t, Paises t1) {
          return t.getPaises().compareTo(t1.getPaises());
       }
   };
}
