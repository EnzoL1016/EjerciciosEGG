
package herenciaej1animales;

import clases.Animales;
import clases.Caballo;
import clases.Gato;
import clases.Perro;


public class HERENCIAej1Animales {

   
    public static void main(String[] args) {
     Animales perro = new Perro("Otto","Costillar ahumado",4,"Chihuahua");
     perro.alimentarse();
     Perro perro2 = new Perro("Chiquito","Caviar finamente seleccionado",5,"Beagle");
     perro2.alimentarse();
     Animales gato = new Gato("Mishifu","Salmon iberico",3,"Rayado");
     gato.alimentarse();
     Animales caballo = new Caballo("Tiro al blanco","Hierbas importadas",7,"Pura Sangre");
     caballo.alimentarse();
     
    }
    
}
