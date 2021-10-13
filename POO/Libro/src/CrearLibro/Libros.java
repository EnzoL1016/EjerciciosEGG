
package CrearLibro;

import java.util.Scanner;


public class Libros {
 private String ISBN;
 private String autor;
 private String titulo;
 private int paginas;

    public Libros() {
    }

    public Libros(String autor, String titulo, int paginas,String ISBN  ) {
                  
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.ISBN = ISBN; 
    }

   
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

     public void setISBN(String ISBN) {
        this.ISBN = 950+"-"+(int)(Math.random()*100000000 )+"-"+ (int)(Math.random()*1000000000); ;
    }
    

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }
    
    public String getISBN() {
        return ISBN;
    }
public static void Ingresadatos(Libros nuevolibro){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo del libro:"); 
        nuevolibro.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor:");
        nuevolibro.setAutor(leer.next());
        System.out.println("Ingrese el numero de páginas");
        nuevolibro.setPaginas(leer.nextInt());
        System.out.println("Generando código ISBN...");
        nuevolibro.setISBN(950+"-"+(int)(Math.random()*100000000 )+"-"+ (int)(Math.random()*1000000000));
        mostrarlibro(nuevolibro);
    }
    public static void mostrarlibro(Libros nuevolibro){
        System.out.println("-----------------------------------------");
        System.out.println(nuevolibro);
    }
    @Override
    public String toString() {
        return "El libro generado queda de la siguiente manera:"+"\n"+"Autor: " + autor + "\n"+"Titulo: " + titulo +"\n"+ "Paginas: " + paginas+"\n" +"ISBN: " + ISBN;
    }

    
    
}
