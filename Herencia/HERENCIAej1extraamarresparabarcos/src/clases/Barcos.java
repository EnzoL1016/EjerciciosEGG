
package clases;

import java.util.Scanner;


public class Barcos {
  
    protected String matricula;
    protected double eslora;
    protected String año_de_fabricacion;
    protected Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Barcos() {
    }

    public Barcos(String matricula, double eslora, String año_de_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año_de_fabricacion = año_de_fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getAño_de_fabricacion() {
        return año_de_fabricacion;
    }

    public void setAño_de_fabricacion(String año_de_fabricacion) {
        this.año_de_fabricacion = año_de_fabricacion;
    }

    @Override
    public String toString() {
        return "Matricula: "+getMatricula()+"\n"+
                "Eslora: "+ eslora+" metros"+"\n"+
                "Año de fabricación: "+ año_de_fabricacion;
    }   
}
