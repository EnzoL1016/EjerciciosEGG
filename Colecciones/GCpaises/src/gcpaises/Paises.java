
package gcpaises;

import java.util.Objects;


public class Paises implements Comparable<Paises>{
 private String paises;  

    public Paises() {
    }

    public Paises(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.paises);
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
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.paises, other.paises)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return paises;
    }

    @Override
    public int compareTo(Paises t) {
        return this.paises.compareTo(t.getPaises()); 
    } 
}
