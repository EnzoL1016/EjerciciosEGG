
package gctienda;

import java.util.Objects;


public class productos {
    private String prod;
    private Integer precio;

    public productos() {
    }

    public productos(String prod, Integer precio) {
        this.prod = prod;
        this.precio = precio;
    }

    public String getProd() {
        return prod;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.prod);
        hash = 79 * hash + Objects.hashCode(this.precio);
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
        final productos other = (productos) obj;
        if (!Objects.equals(this.prod, other.prod)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "productos{" + "prod=" + prod + ", precio=" + precio + '}';
    }
    
}
