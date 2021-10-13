
package clases;


public class Televisor extends Electrodomestico {
    protected int resolucion;
    protected boolean sintonizador_TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador_TDT, double precio, String color, char consumo_energetico, int peso) {
        super(precio, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
    
    public void crearTelevisor(){
        System.out.println("Ingrese la resolucion del Televisor (en pulgadas):");
        resolucion= leer.nextInt();
        System.out.println("¿Tiene sintonizador TDT? (S/N)");
        String op = leer.next();
        if(op.equalsIgnoreCase("s")){
        sintonizador_TDT=true;    
        }else{
            sintonizador_TDT=false;
        }
        crearElectrodomesticos();
        precioFinal(sintonizador_TDT);
        setPrecio(getPrecio()+precioFinal(sintonizador_TDT));
        Electrodomestico tele = new Televisor(resolucion,sintonizador_TDT,getPrecio(),getColor(),getConsumo_energetico(),getPeso());
        
  }
    public double precioFinal(boolean sintonizador_TDT){
        double ss=0; double dd=0;double ff=0;
        if(sintonizador_TDT==true){
            ss=500;
        }
        if(resolucion>=40){
           dd= getPrecio();
           dd=dd*0.30;
           ff=getPrecio()+dd;
        }
        return ss+ff;
    }

    @Override
    public String toString() {
        return  super.toString()+"\n"+
                "Resolución:" + resolucion +" pulgadas"+"\n"+
                "Sintonizador TDT:" + sintonizador_TDT;
    }
    
            
}
