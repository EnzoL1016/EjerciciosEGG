
package clasess;


public class Espectador {
    
    private String nombre;
    private int edad;
    private double dinero_disponible;
   
    
    public Espectador(String nombre, int edad, double dinero_disponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero_disponible = dinero_disponible;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero_disponible() {
        return dinero_disponible;
    }

    public void setDinero_disponible(double dinero_disponible) {
        this.dinero_disponible = dinero_disponible;
    }
    public void pagar(double precio) {
        dinero_disponible -= precio;
    }
    public boolean tieneEdad(int edadMinima) {
        return edad >= edadMinima;
    }
    
     public boolean tieneDinero(double precioEntrada) {
        return dinero_disponible >= precioEntrada;
    }
    @Override
    public String toString() {
        return "Nombre: " +nombre + "\nEdad: " + edad + "\nDinero disponible: " + dinero_disponible;
    }
    
     
}
