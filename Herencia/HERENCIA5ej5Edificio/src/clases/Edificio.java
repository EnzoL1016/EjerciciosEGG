
package clases;

import java.util.Scanner;


public class Edificio implements Calculos {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double ancho;
    protected double alto;
    protected double largo;
    protected int personas_por_oficina;
    protected int numero_de_pisos;
    protected int oficinastotales;
    protected String techo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo, int personas_por_oficina, int numero_de_pisos, int oficinastotales, String techo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
       
        this.personas_por_oficina = personas_por_oficina;
        this.numero_de_pisos = numero_de_pisos;
        this.oficinastotales = oficinastotales;
        this.techo = techo;
    }

    public Edificio(double ancho, double alto, double largo, int personas_por_oficina, int numero_de_pisos, int oficinastotales) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;    
        this.personas_por_oficina = personas_por_oficina;
        this.numero_de_pisos = numero_de_pisos;
        this.oficinastotales = oficinastotales;
    }
  

    public Edificio(double ancho, double alto, double largo, String techo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.techo = techo;
    }
    

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
   

    public int getPersonas_por_oficina() {
        return personas_por_oficina;
    }

    public void setPersonas_por_oficina(int personas_por_oficina) {
        this.personas_por_oficina = personas_por_oficina;
    }

    public int getNumero_de_pisos() {
        return numero_de_pisos;
    }

    public void setNumero_de_pisos(int numero_de_pisos) {
        this.numero_de_pisos = numero_de_pisos;
    }

    public int getOficinastotales() {
        return oficinastotales;
    }

    public void setOficinastotales(int oficinastotales) {
        this.oficinastotales = oficinastotales;
    }

    public String getTecho() {
        return techo;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }
    
    
    @Override
    public double calcularSuperficie(double ancho, double largo) {
        
        return ancho*largo;
    }

    @Override
    public double calcularVolumen(double largo, double ancho, double alto) {
        return largo*ancho*alto;
    }
   
    public String techo(){
        Polideportivo s = new Polideportivo();
        return s.getTecho(); 
   }
    @Override
    public String toString() {
        return "Ancho: " + ancho +"\n"+
                "Alto: " + alto +"\n"+
                "Largo: " + largo;
    }
    
    
    
}
