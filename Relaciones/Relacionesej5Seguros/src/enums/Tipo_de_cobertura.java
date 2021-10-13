
package enums;


public enum Tipo_de_cobertura {
    TOTAL("Total"), CONTRAIN("Contra Incendios"), CONTRARO("Contra Robos"), CONTRATER("Contra Terceros");
    private String cover;
    private Tipo_de_cobertura(String cover){
        this.cover=cover;
    }

    public String getCover() {
        return cover;
    }
    
}
