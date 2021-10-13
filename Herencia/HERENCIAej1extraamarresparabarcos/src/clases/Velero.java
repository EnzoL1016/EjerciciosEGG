
package clases;

import java.time.LocalDate;


public class Velero extends Barcos {
    
    private int numero_de_mastiles;

    public Velero() {
    }

    public Velero(int numero_de_mastiles, String matricula, double eslora, String año_de_fabricacion) {
        super(matricula, eslora, año_de_fabricacion);
        this.numero_de_mastiles = numero_de_mastiles;
    }

    public int getNumero_de_mastiles() {
        return numero_de_mastiles;
    }

    public void setNumero_de_mastiles(int numero_de_mastiles) {
        this.numero_de_mastiles = numero_de_mastiles;
    }
    
    public Velero crearVelero(){
        System.out.println("Ingrese el numero de mastiles: "); 
        setNumero_de_mastiles(leer.nextInt());
        setMatricula(Metodos.lista[Metodos.generarNumeroAleatorio(0, Metodos.lista.length-1)] + "-" + Metodos.zonas[Metodos.generarNumeroAleatorio(0, Metodos.zonas.length-1)] + "-" + Metodos.generarNumeroAleatorio(000, 999) + "-" + "21");
        setEslora(Metodos.generarNumeroAleatorio(6, 15));
        LocalDate i = LocalDate.now();
        LocalDate f = i.minusYears(Metodos.generarNumeroAleatorio(1, 8));
        setAño_de_fabricacion(f.toString());
        return new Velero(getNumero_de_mastiles(),getMatricula(),getEslora(),getAño_de_fabricacion());
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Numero de mastiles: "+numero_de_mastiles;
    }
    
    
}
