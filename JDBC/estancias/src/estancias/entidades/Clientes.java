package estancias.entidades;

public class Clientes extends Comentarios {

    private Integer id_cliente;
    private String nombre;
    private String calle;
    private Integer numero;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private String email;

    public Clientes() {
    }

    public Clientes(Integer id_cliente, String nombre, String calle, Integer numero, String codigo_postal, String ciudad, String pais, String email, String comentario) {
        super(comentario);
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }
     
   

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        
        return id_cliente +"\t\t"+espacios(nombre)+ espacios(calle)+ numero +espacios(codigo_postal) +espacios(ciudad)+ espacios(pais)+ espacios(email);
    }

}
