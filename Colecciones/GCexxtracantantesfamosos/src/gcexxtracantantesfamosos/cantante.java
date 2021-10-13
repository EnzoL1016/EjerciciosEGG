
package gcexxtracantantesfamosos;

import java.util.Objects;

public class cantante {
   private String nombre;
   private String discomasvendido;

    public cantante() {
    }

    public cantante(String nombre, String discomasvendido) {
        this.nombre = nombre;
        this.discomasvendido = discomasvendido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscomasvendido() {
        return discomasvendido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscomasvendido(String discomasvendido) {
        this.discomasvendido = discomasvendido;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\n"+"Disco mas famoso: "+discomasvendido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.discomasvendido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cantante other = (cantante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.discomasvendido, other.discomasvendido)) {
            return false;
        }
        return true;
    }
   
}
