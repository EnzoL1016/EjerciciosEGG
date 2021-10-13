
package Principal.entidades;


public class Producto {
   
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer CodigoFabricante;
   
    

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, Double precio, Integer CodigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.CodigoFabricante = CodigoFabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodigoFabricante() {
        return CodigoFabricante;
    }

    public void setCodigoFabricante(Integer CodigoFabricante) {
        this.CodigoFabricante = CodigoFabricante;
    }

    
       
}
