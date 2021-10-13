
package clases;

import enums.Forma_de_pago;


public class Cuotas {
   
    private Polizas poliza;
    private int numero_de_cuota;
    private double monto_total_cuota;
    private boolean esta_pagada;
    private String fecha_vencimiento;
    private String forma_de_pago;

    public Cuotas() {
    }

    
    public Cuotas(Polizas poliza, int numero_de_cuota, double monto_total_cuota, boolean esta_pagada, String fecha_vencimiento, String forma_de_pago) {
        this.poliza = poliza;
        this.numero_de_cuota = numero_de_cuota;
        this.monto_total_cuota = monto_total_cuota;
        this.esta_pagada = esta_pagada;
        this.fecha_vencimiento = fecha_vencimiento;
        this.forma_de_pago = forma_de_pago;
    }

    
    public Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Polizas poliza) {
        this.poliza = poliza;
    }

    public int getNumero_de_cuota() {
        return numero_de_cuota;
    }

    public void setNumero_de_cuota(int numero_de_cuota) {
        this.numero_de_cuota = numero_de_cuota;
    }

    public double getMonto_total_cuota() {
        return monto_total_cuota;
    }

    public void setMonto_total_cuota(double monto_total_cuota) {
        this.monto_total_cuota = monto_total_cuota;
    }

    public boolean isEsta_pagada() {
        return esta_pagada;
    }

    public void setEsta_pagada(boolean esta_pagada) {
        this.esta_pagada = esta_pagada;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public Cuotas cuotas(){
        Polizas p = new Polizas();
        setPoliza(p.crearpoliza());
        setNumero_de_cuota(1);
        setMonto_total_cuota(p.getMonto_de_pago()/p.getCantidad_de_cuotas());
        setEsta_pagada(pagarcuota());
        setFecha_vencimiento(p.getFecha_fin());
        setForma_de_pago(p.getForma_de_pago());
        return new Cuotas(getPoliza(),getNumero_de_cuota(),getMonto_total_cuota(),isEsta_pagada(),getFecha_vencimiento(),getForma_de_pago());
    }
    
    public boolean pagarcuota(){
        int s = Metodos.generarNumeroAleatorio(1, 2);
        if(s==1){
            return true;
            
        }else 
        return false;
    }

    @Override
    public String toString() {
        return "Poliza:"+"\n"+poliza+"\n"+
                "-------------------------------------------------------"+"\n"+
                "Numero de Cuota: "+numero_de_cuota+"\n"+
                "Monto total de la Cuota: "+monto_total_cuota+"\n"+
                "Está Pagada: "+esta_pagada+"\n"+
                "Fecha de Vencimiento: "+fecha_vencimiento+"\n"+
                "Forma de Pago: "+forma_de_pago;
    }
       
}
