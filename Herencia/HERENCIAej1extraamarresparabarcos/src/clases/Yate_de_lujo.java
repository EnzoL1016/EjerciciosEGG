package clases;

import java.time.LocalDate;

public class Yate_de_lujo extends Barcos {

    private int potencia;

    public Yate_de_lujo() {
    }

    public Yate_de_lujo(int potencia, String matricula, double eslora, String año_de_fabricacion) {
        super(matricula, eslora, año_de_fabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Yate_de_lujo crearYate() {
        setPotencia(Metodos.generarNumeroAleatorio(3000, 10000));
        setMatricula(Metodos.lista[Metodos.generarNumeroAleatorio(0, Metodos.lista.length-1)] + "-" + Metodos.zonas[Metodos.generarNumeroAleatorio(0, Metodos.zonas.length-1)] + "-" + Metodos.generarNumeroAleatorio(000, 999) + "-" + "21");
        System.out.println(getMatricula());
        setEslora(Metodos.generarNumeroAleatorio(100, 300));
        LocalDate i = LocalDate.now();
        LocalDate f = i.minusYears(Metodos.generarNumeroAleatorio(1, 8));
        setAño_de_fabricacion(f.toString());
        return new Yate_de_lujo(getPotencia(), getMatricula(), getEslora(), getAño_de_fabricacion());
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Potencia: " + potencia+" cv";
    }

}
