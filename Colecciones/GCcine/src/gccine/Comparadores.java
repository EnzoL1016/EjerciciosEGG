
package gccine;

import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Pelicula> ordenarporduracionmayora1 = new Comparator <Pelicula>() {
   
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            if(t.getDuracion()>1 && t1.getDuracion()>1){
           return t.getDuracion().compareTo(t1.getDuracion());
        }else  return 0;  
    }      
    };
    public static Comparator<Pelicula> ordenarporduracionmayamen = new Comparator <Pelicula>() {
   
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
           return t1.getDuracion().compareTo(t.getDuracion());
        }        
    };
    public static Comparator<Pelicula> ordenarporduracionmenamay = new Comparator <Pelicula>() {
   
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
           return t.getDuracion().compareTo(t1.getDuracion());
        }         
    };
    public static Comparator<Pelicula> ordenarportitulo = new Comparator <Pelicula>() {
   
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
           return t.getTitulo().compareTo(t1.getTitulo());
        }
         
    };
    public static Comparator<Pelicula> ordenarpordirector= new Comparator <Pelicula>() {
   
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
           return t.getDirector().compareTo(t1.getDirector());
        }
         
    };
}
