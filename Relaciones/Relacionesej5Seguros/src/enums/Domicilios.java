
package enums;


public enum Domicilios {
    BARRIOT("Barrio Martin Fierro"),BARRIOF("Barrio Los Almendros"),BARRIOG("Barrio Saavedra"),BARRIOP("Barrio Precidencia"),CENTRO("Centro"),AVENIDA("Avenida Belgrano");
    private String domicili;
    private Domicilios(String domicilios){
        this.domicili=domicilios;
    }
    public String getDomicili(){
        return domicili;
    }
    
}
