package clases;

import enums.Forma_de_pago;
import enums.Tipo_de_cobertura;
import java.time.LocalDate;

public class Polizas {

    private Cliente cliente;
    private String fecha_inicio;
    private String fecha_fin;
    private int cantidad_de_cuotas;
    private String forma_de_pago;
    private double monto_de_pago;
    private boolean incluye_granizo;
    private double monto_maximo_granizo;
    private String tipo_de_cobertura;

    public Polizas() {
    }

    
    public Polizas(Cliente cliente, String fecha_inicio, String fecha_fin, int cantidad_de_cuotas, String forma_de_pago, double monto_de_pago, boolean incluye_granizo, double monto_maximo_granizo, String tipo_de_cobertura) {
        this.cliente = cliente;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.cantidad_de_cuotas = cantidad_de_cuotas;
        this.forma_de_pago = forma_de_pago;
        this.monto_de_pago = monto_de_pago;
        this.incluye_granizo = incluye_granizo;
        this.monto_maximo_granizo = monto_maximo_granizo;
        this.tipo_de_cobertura = tipo_de_cobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getCantidad_de_cuotas() {
        return cantidad_de_cuotas;
    }

    public void setCantidad_de_cuotas(int cantidad_de_cuotas) {
        this.cantidad_de_cuotas = cantidad_de_cuotas;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public double getMonto_de_pago() {
        return monto_de_pago;
    }

    public void setMonto_de_pago(double monto_de_pago) {
        this.monto_de_pago = monto_de_pago;
    }

    public boolean isIncluye_granizo() {
        return incluye_granizo;
    }

    public void setIncluye_granizo(boolean incluye_granizo) {
        this.incluye_granizo = incluye_granizo;
    }

    public double getMonto_maximo_granizo() {
        return monto_maximo_granizo;
    }

    public void setMonto_maximo_granizo(double monto_maximo_granizo) {
        this.monto_maximo_granizo = monto_maximo_granizo;
    }

    public String getTipo_de_cobertura() {
        return tipo_de_cobertura;
    }

    public void setTipo_de_cobertura(String tipo_de_cobertura) {
        this.tipo_de_cobertura = tipo_de_cobertura;
    }

    public Polizas crearpoliza() {
        Cliente nue = new Cliente();
        setCliente(nue.crearcliente());
        LocalDate i = LocalDate.now();
        LocalDate f = i.plusDays(365);
        setFecha_inicio(i.toString());
        setFecha_fin(f.toString());
        setCantidad_de_cuotas(Metodos.generarNumeroAleatorio(1, 12));
        setForma_de_pago(Forma_de_pago.values()[Metodos.generarNumeroAleatorio(0, Forma_de_pago.values().length-1)].getTipo_de_pago());
        setMonto_de_pago(Metodos.generarNumeroAleatorio(1200, 5000));
        setIncluye_granizo(incluyegranizo());
        setMonto_maximo_granizo(Metodos.generarNumeroAleatorio(2000, 4000));
        setTipo_de_cobertura(Tipo_de_cobertura.values()[Metodos.generarNumeroAleatorio(0, Tipo_de_cobertura.values().length-1)].getCover());
        return new Polizas(getCliente(),getFecha_inicio(),getFecha_fin(),getCantidad_de_cuotas(),getForma_de_pago(),getMonto_de_pago(),isIncluye_granizo(),getMonto_maximo_granizo(),getTipo_de_cobertura());
    }
    public boolean incluyegranizo(){
        int n = Metodos.generarNumeroAleatorio(1, 2);
        if(n==1){
            incluye_granizo=true;
            return incluye_granizo;
        }else incluye_granizo=false;
        return incluye_granizo;
    }

    @Override
    public String toString() {
        return "Cliente:" +"\n"+ cliente + "\n"+
               "-------------------------------------------------------"+"\n"+
               "Fecha Inicio: " + fecha_inicio +"\n"+
               "Fecha Fin: " + fecha_fin +"\n"+
               "Cantidad de Cuotas: " + cantidad_de_cuotas +"\n"+
               "Forma de Pago: " + forma_de_pago +"\n"+
               "Monto de Pago: " + monto_de_pago +"\n"+
               "Incluye Granizo: " + incluye_granizo +"\n"+
               "Monto Maximo Granizo: " + monto_maximo_granizo +"\n"+
               "Tipo de Cobertura: " + tipo_de_cobertura+"\n"+
               "-------------------------------------------------------";
    }
    
    

}
