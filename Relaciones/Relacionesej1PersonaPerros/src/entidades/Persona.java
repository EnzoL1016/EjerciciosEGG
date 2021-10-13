
package entidades;

import java.util.ArrayList;

public class Persona {
   private String nombre;
   private String apellido;
   private Integer edad;
   private long documento;
   private ArrayList <Perro> perro;
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(ArrayList<Perro> perro) {
        this.perro = perro;
    }

   
    public void mostrarpersona(){
       System.out.println(toString());      
     }
   
    @Override
    public  String toString() {
        return "Nombre: " + nombre +"\n"+ "Apellido: " + apellido +"\n"+ "Edad: " + edad +" años"+"\n"+ "Documento: " + documento;
    }

  
}
