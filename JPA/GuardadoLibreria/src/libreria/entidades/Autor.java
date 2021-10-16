package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private boolean alta;

    public Autor() {
    }

    public Autor(String nombre, boolean alta) {
        this.nombre = nombre;
        this.alta = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public static String espacios(String cadena) {
        int cantEspacios = 40 - cadena.length();
        for (int i = 0; i < cantEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }

    @Override
    public String toString() {
        return "ID Autor:"+"\t"+espacios("Nombre: ")+"\n"+
                id+"\t\t"+espacios(nombre);
    }

}
