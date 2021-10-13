package clases;

public class Metodos {

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        Integer num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
        return num;
    }
    
    public static final String nombres[] = {"Enzo", "Carlos", "Fernando", "Raul", "Samuel", "Matias", "Henrique", "Valentina", "Juliana", "Julieta", "Ana", "Paula"};
    
    public static final String apellidos[] = {"Morales","Lopez","Gonzales","Fernandez","Perez","Asis","Guzman","Martinelli","Luconi","Castro","Escudero","Paredes","Martinez"};
    
    public static final String letras[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"};
}
