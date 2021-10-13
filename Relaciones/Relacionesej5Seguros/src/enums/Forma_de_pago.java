
package enums;


public enum Forma_de_pago {
    TRANSFERENCIA("Transferencia"), TARJETAD("Tarjeta de débito"), TARJETAC("Tarjeta de crédito"), EFECTIVO("Efectivo");
    private String tipo_de_pago;
    private Forma_de_pago(String tipo_de_pago){
        this.tipo_de_pago= tipo_de_pago;
    }

    public String getTipo_de_pago() {
        return tipo_de_pago;
    }
    
}
