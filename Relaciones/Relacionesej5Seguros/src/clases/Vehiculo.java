
package clases;

import enums.Color;
import enums.Marca_Autos;
import enums.Tipo_de_Vehiculo;
import java.util.Scanner;



public class Vehiculo {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private String marca;
    private String modelo;
    private int año;
    private String numero_motor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    
    public Vehiculo(String marca, String modelo, int año, String numero_motor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numero_motor = numero_motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNumero_motor() {
        return numero_motor;
    }

    public void setNumero_motor(String numero_motor) {
        this.numero_motor = numero_motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public Vehiculo crearVehiculo(){
      setMarca(Marca_Autos.values()[Metodos.generarNumeroAleatorio(0, Marca_Autos.values().length-1)].getMarca());
      System.out.println("El vehiculo es marca "+getMarca()+"\n"+" ¿Que modelo es?");
      setModelo(leer.next());      
      setAño(Metodos.generarNumeroAleatorio(2005, 2021));      
      String n = String.valueOf(Metodos.generarNumeroAleatorio(10000000, 99999999));
      String n2= String.valueOf(Metodos.generarNumeroAleatorio(100000000, 999999999));
      setNumero_motor((n+n2));
      String m1 = String.valueOf(Metodos.generarNumeroAleatorio(10000000, 99999999));
      String m2= String.valueOf(Metodos.generarNumeroAleatorio(100000000, 999999999));
      setChasis((m1+m2));
      setColor(Color.values()[Metodos.generarNumeroAleatorio(0, Color.values().length-1)].getColor());
      setTipo(Tipo_de_Vehiculo.values()[Metodos.generarNumeroAleatorio(0, Tipo_de_Vehiculo.values().length-1)].getTipoauto() );
      return new Vehiculo(getMarca(),getModelo(),getAño(),getNumero_motor(),getChasis(),getColor(),getTipo());
    }          

    @Override
    public String toString() {
        return "Marca: "+marca+"\n"+
               "Modelo: "+modelo+"\n"+
                "Año: "+año+"\n"+
                "Numero de Motor: "+numero_motor+"\n"+
                "Numero de Chasis: "+chasis+"\n"+
                "Color: "+color+"\n"+
                "Tipo: "+tipo;
    }
    
    
}
