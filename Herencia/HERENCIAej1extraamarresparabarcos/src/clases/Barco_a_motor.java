
package clases;

import java.time.LocalDate;


public class Barco_a_motor extends Barcos {
    
    
    private int potencia;

    public Barco_a_motor() {
    }

    public Barco_a_motor(int potencia, String matricula, double eslora, String año_de_fabricacion) {
        super(matricula, eslora, año_de_fabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public Barco_a_motor crearBarco(){
        setPotencia(Metodos.generarNumeroAleatorio(40, 120));
        setMatricula(Metodos.lista[Metodos.generarNumeroAleatorio(0, Metodos.lista.length-1)] + "-" + Metodos.zonas[Metodos.generarNumeroAleatorio(0, Metodos.zonas.length-1)] + "-" + Metodos.generarNumeroAleatorio(000, 999) + "-" + "21");
        setEslora(Metodos.generarNumeroAleatorio(20, 60));
        LocalDate i = LocalDate.now();
        LocalDate f = i.minusYears(Metodos.generarNumeroAleatorio(1, 8));
        setAño_de_fabricacion(f.toString());
        return new Barco_a_motor(getPotencia(),getMatricula(),getEslora(),getAño_de_fabricacion());
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Potencia: " + potencia+" cv";
    }
    
    
}
