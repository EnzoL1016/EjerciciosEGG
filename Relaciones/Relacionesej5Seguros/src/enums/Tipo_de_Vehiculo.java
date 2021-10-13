
package enums;


public enum Tipo_de_Vehiculo {
  
    SEDAN("Sedan"), CAMIONETA("Camioneta"), COUPE("Coupé"), URBANO("Urbano"), COMPACTO("Compacto"),UTILITARIO("Utilitario");
    private String tipoauto;
    private Tipo_de_Vehiculo(String tipoauto){
        this.tipoauto= tipoauto;
    }

    public String getTipoauto() {
        return tipoauto;
    }
    
}
