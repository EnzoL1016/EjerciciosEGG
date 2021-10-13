
package enums;


import java.util.Random;


public enum Color {
 NEGRO("Negro"), BLANCO("Blanco"), GRIS("Gris"), ROJO("Rojo"), BORDO("Bordo"), CELESTE("Celeste"), AZUL("Azul"), VERDE("Verde"),AMARILLO("Amarillo"), NARANJA("Naranja");
 private String color;
 private Color(String color){
   this.color=color;
 }
  public String getColor() {
    return color;
   } 
}

