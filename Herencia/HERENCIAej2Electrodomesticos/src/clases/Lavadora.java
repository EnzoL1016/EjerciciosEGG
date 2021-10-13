
package clases;


public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumo_energetico, int peso) {
        super(precio, color, consumo_energetico, peso);
        this.carga = carga;
    }


    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
      System.out.println("Ingrese la carga del lavarropa:");
      carga = leer.nextInt();
      crearElectrodomesticos();
      precioFinal(carga);
      setPrecio(getPrecio()+ precioFinal(carga)+1000); 
      Electrodomestico lavadora = new Lavadora(carga,getPrecio(),getColor(),getConsumo_energetico(),getPeso());
    }
    public double precioFinal(int carga){
        if(carga>30){
            return 500;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
               "Carga: "+ carga;
    }   
}
