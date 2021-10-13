package clases;

import java.util.Scanner;

public class Electrodomestico {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double precio;
    protected String color;
    protected char consumo_energetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Televisor t) {
    }

    public Electrodomestico(Lavadora v) {
    }

    public Electrodomestico(double precio, String color, char consumo_energetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }
//
    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    public void comprobarConsumoEnergetico(char letra) {
        if (!(letra >= 0) && !(letra <= 5)) {
            letra = 5;
        }
    }

    public void comprobarcolores(String color) {
        
        if (color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Blanco")||color.equalsIgnoreCase("Gris")||color.equalsIgnoreCase("Azul") ) {
            setColor(color);
            color = getColor();
        }else{
           setColor("Blanco");
        }
    }

    public void crearElectrodomesticos() {
        System.out.println("Ingrese el color: ");
        String color = leer.next();
        comprobarcolores(color);
        System.out.println("Ingrese el consumo energetico:");
        char letra = leer.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        consumo_energetico = letra;
        System.out.println("Ingrese el peso: ");
        peso = leer.nextInt();
        precio = 1000 + precioFinal(peso, letra);       
    }

    public double precioFinal(int peso,char letra) {
        int rr = 0;int ss =0;
        if (peso >= 1 && peso <= 19) {
            rr = 100;

        }
        if (peso >= 20 && peso <= 49) {
            rr = 500;
        }
        if (peso >= 50 && peso <= 79) {
            rr = 800;
        }
        if (peso >= 80) {
            rr = 1000;
        }
        if (letra == 5) {
            ss = 100;

        }
        if (letra == 4) {
            ss = 300;
        }
        if (letra==3) {
            ss = 500;
        }
        if (letra==2) {
            ss = 600;
        }if(letra==1){
            ss=800;
        }if(letra==0){
            ss=1000;
        }
        return rr+ss;
    }

    @Override
    public String toString() {
        return "Precio: "+ getPrecio() +"$"+"\n"+
                "Color: "+ getColor() +"\n"+
                "Consumo Energetico: "+ consumo_energetico + "\n"+
                "Peso: "+ peso+"Kg";
    }    
}
