
package clases;

import enums.Domicilios;


public class Cliente {
    
    
    private String nombre;
    private String apellido;
    private long documento;
    private String gmail;
    private String domicilio;
    private String telefono;
    private Vehiculo auto;

    public Cliente() {
    }

    
    public Cliente(String nombre, String apellido, long documento, String gmail, String domicilio, String telefono, Vehiculo auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.gmail = gmail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.auto = auto;
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

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }
    
    
    public Cliente crearcliente(){
        setNombre(Metodos.nombres[Metodos.generarNumeroAleatorio(0, Metodos.nombres.length-1)]);
        setApellido(Metodos.apellidos[Metodos.generarNumeroAleatorio(0, Metodos.apellidos.length-1)]);
        setDocumento(Metodos.generarNumeroAleatorio(30000000, 50000000));
        setGmail("correo"+getNombre()+getApellido()+"@gmail.com");
        setDomicilio("Ciudad de Mendoza,"+Domicilios.values()[Metodos.generarNumeroAleatorio(0, Domicilios.values().length-1)].getDomicili()+", Manzana "+Metodos.letras[Metodos.generarNumeroAleatorio(0, Metodos.letras.length)]+", Casa "+Metodos.generarNumeroAleatorio(1, 99));
        setTelefono("+54 2622-"+String.valueOf(Metodos.generarNumeroAleatorio(1000000, 9999999)));
        Vehiculo n = new Vehiculo();
        setAuto(n.crearVehiculo());
        return new Cliente(getNombre(),getApellido(),getDocumento(),getGmail(),getDomicilio(),getTelefono(),getAuto());
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\n"+
               "Apellido: "+apellido+"\n"+
                "Documento: "+documento+"\n"+
                "Gmail: "+gmail+"\n"+
                "Domicilio: "+domicilio+"\n"+
                "Telefono: "+telefono+"\n"+
                "-------------------------------------------------------"+"\n"+
                "Vehiculo: "+"\n"+
                auto;
    }
    
}
