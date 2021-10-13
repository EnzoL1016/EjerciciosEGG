
package estancias.entidades;


public class Estancias {
   
    private Integer id_estancia;
    private Integer id_cliente;
    private Integer id_casa;
    private String nombre_huesped;
    private Integer fecha_desde;
    private Integer fecha_hasta;

    public Estancias() {
    }

    
    public Estancias(Integer id_estancia, Integer id_cliente, Integer id_casa, String nombre_huesped, Integer fecha_desde, Integer fecha_hasta) {
        this.id_estancia = id_estancia;
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public Integer getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(Integer id_estancia) {
        this.id_estancia = id_estancia;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_casa() {
        return id_casa;
    }

    public void setId_casa(Integer id_casa) {
        this.id_casa = id_casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Integer getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Integer fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Integer getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Integer fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }
    
    
    
}
