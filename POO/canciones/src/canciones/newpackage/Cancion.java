
package canciones.newpackage;

import java.util.Scanner;


public class Cancion {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private String titulo;
   private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
   public void crearcancion(){
       System.out.println("Ingrese el autor:");
       setAutor(leer.next());
       System.out.println("Ingrese el titulo de la canción:");
       setTitulo(leer.next());
       toString();
   }

    @Override
    public String toString() {
        return  "Titulo: "+getTitulo()+"\n"+"Autor: "+getAutor();
    }
   
}
