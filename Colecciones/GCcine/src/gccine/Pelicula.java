
package gccine;

public class Pelicula {
  private String titulo;
  private Integer duracion;
  private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracion, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo +"\n" +"Duracion: " + duracion +" minutos"+ "\n"+"Director: " + director;
    }
  
}
