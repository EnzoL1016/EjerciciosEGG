
package clasess;


public class Cine {
    private Asientos asientos[][];
    private Pelicula pelicula;
    private double precio;
    private int sala;

    public Cine(int filas, int columnas, Pelicula pelicula, double precio, int sala) {
        asientos = new Asientos[filas][columnas];  
        this.pelicula = pelicula;
        this.precio = precio;
        this.sala = sala;
        crearAsientos();
    }

    public Asientos[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    
    private void crearAsientos(){
        
        int fila = asientos.length;              
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
             asientos[i][j]= new Asientos((char)('A'+j),fila);   
            }
            fila--;
        }
    }
    
    public boolean espaciosLibres(){     
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length;i++){                             
                if(!asientos[i][j].Ocupado()){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * @param fila
     * @param columna
     * @return
     */
    public boolean espaciosLibresporButaca(int fila, char columna){
        return getAsiento(fila, columna).Ocupado();
    }  
    
    public boolean DineroSuficiente(Espectador e){
        
      return e.getDinero_disponible()>precio;
      
    }
    
    public boolean PuedeverlaPelicula( Espectador e){
        
        return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdad_minima());
    }
     
    public void Sentar(int fila, char letra, Espectador e){
        
        getAsiento(fila, letra).setEspectador(e);
    }
    
    public Asientos getAsiento(int filas, char letra){
        return asientos[asientos.length-filas-1][letra-'A'];
    }
    
    public void mostrarAsientos(){
        System.out.println("---------------------------------------------");
         System.out.println("Información de la pelicula: ");
        System.out.println(pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("---------------------------------------------");
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.print("["+asientos[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
