package clasess;

public class Metodos {

    public static final String nombres[] = {"Enzo", "Carlos", "Fernando", "Raul", "Samuel", "Matias", "Henrique", "Valentina", "Juliana", "Julieta", "Ana", "Paula"};

    public static Pelicula pelicula[]={

      
    };

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        Integer num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
        return num;
    }

    public static double generarRealAleatorio(int minimo, int maximo) {
        double num = Math.floor(Math.random() * (minimo - maximo + 1) + (maximo + 1));
        return num;
    }

}
