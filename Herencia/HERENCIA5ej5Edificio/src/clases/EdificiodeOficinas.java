
package clases;

import java.util.ArrayList;


public class EdificiodeOficinas extends Edificio{

   
    private ArrayList <Integer> numero_oficinas= new ArrayList();
    public EdificiodeOficinas() {
    }

    public EdificiodeOficinas(double ancho, double alto, double largo, int personas_por_oficina, int numero_de_pisos, int oficinastotales) {
        super(ancho, alto, largo, personas_por_oficina, numero_de_pisos, oficinastotales);
    }
   
    public EdificiodeOficinas(ArrayList<Integer> numero_oficinas, double ancho, double alto, double largo, int personas_por_oficina, int numero_de_pisos, int oficinastotales) {
        super(ancho, alto, largo, personas_por_oficina, numero_de_pisos, oficinastotales);
        this.numero_oficinas = numero_oficinas;
    }

    
    public ArrayList<Integer> getNumero_oficinas() {
        return numero_oficinas;
    }

    public void setNumero_oficinas(ArrayList<Integer> numero_oficinas) {
        this.numero_oficinas = numero_oficinas;
    }

    
    public Edificio crearEdificioOficinas(){
        System.out.println("Ingrese el largo del Edificio: ");
        setLargo(leer.nextDouble());
        System.out.println("Ingrese el ancho del Edificio: ");
        setAncho(leer.nextDouble());
        System.out.println("Ingrese la altura por piso: ");
        double alt = leer.nextDouble();              
        System.out.println("Ingrese el numero de pisos que tiene el Edificio: ");
        setNumero_de_pisos(leer.nextInt());
        setAlto(alt*numero_de_pisos);
        System.out.println("Ingrese la cantidad de oficinas por piso: ");
        setOficinastotales(leer.nextInt());
        System.out.println("Ingrese la cantidad de gente que entra en cada oficina:");
        personas_por_oficina= leer.nextInt();
        return new EdificiodeOficinas(getAncho(),getAlto(),getLargo(),getPersonas_por_oficina(),getNumero_de_pisos(),getOficinastotales());
    }
    
    public void cantidadPersonas(){
        System.out.println("_________________________________________________________________________");
        System.out.println("");
        System.out.println("El numero de personas que entran en un piso es de: "+(getOficinastotales()*getPersonas_por_oficina()));
        System.out.println("El numero total de personas en el edificio es de: "+((getOficinastotales()*getNumero_de_pisos())*getPersonas_por_oficina()));
        System.out.println("_________________________________________________________________________");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}

