
package clases;


public class Metodos {
    
    public static int generarNumeroAleatorio(int minimo, int maximo) {
        Integer num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
        return num;
    }
    
     public static final String zonas[] = {"VA", "BA", "PM", "LU", "AT"};
     
     public static final String lista[] = {"1ª", "2ª", "3ª", "4ª", "5ª","6ª","7ª","8ª","9ª"};
     
     public static final String posicion_amarre[] = {"Largo", "Spring", "Traves", "Codera"};
}
