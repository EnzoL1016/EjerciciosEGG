
package enums;

public enum Marca_Autos {
 WOLSWAGEN("Wolswagen"), FORD("Ford"), CHEVROLET("Chevrolet"), FIAT("Fiat"), RENAULT("Renault"), NISSAN("Nissan"), TOYOTA("Toyota"), PEUGEOT("Peugeot");
 private String marca;
 private Marca_Autos(String marca){
     this.marca=marca;
 }

    public String getMarca() {
        return marca;
    }
 
}
