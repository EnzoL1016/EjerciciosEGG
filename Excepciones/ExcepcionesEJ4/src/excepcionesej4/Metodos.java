
package excepcionesej4;


public class Metodos {
    
    public static int generarespacioaleatorio(int minimo, int maximo){
     Integer num =  (int)Math.floor(Math.random()*(maximo-minimo+1)+minimo);   
        return num;
    }
}
