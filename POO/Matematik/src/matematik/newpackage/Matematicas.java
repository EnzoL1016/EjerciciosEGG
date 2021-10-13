
package matematik.newpackage;


public class Matematicas {
    private double n1;
    private double n2;

    public Matematicas() {
    }

    
    public Matematicas(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
    public Matematicas Rellenarvalores(){
        System.out.println("Se le asignaran valores aleatorios a ambos numeros:");
        setN1(Math.random()*100);
        setN2(Math.random()*100);
        setN1(Math.round(getN1()*100.0)/100.0);
        setN2(Math.round(getN2()*100.0)/100.0);
        devolvermayor();
        return null;
    }
    
    public void devolvermayor(){
        System.out.println("Se evaluará cual de los numeros es mayor...");
        if(getN1()>getN2()){
            System.out.println("El mayor entre los dos numeros es el Numero 1: "+"\n"+getN1());
        }else if (getN2()>getN1()){
            System.out.println("El mayor entre los dos numeros es el Numero 2: "+"\n"+getN2());
        }
        calcularpotencia();
    }
    public void calcularpotencia(){
        System.out.println("Se calculará la potencia del numero mayor elevado al menor...");
        if(getN1()>getN2()){
            System.out.println("El Numero 1 elevado al Numero 2 da el siguiente resultado: "+"\n"+Math.pow(getN1(),getN2()));
        }else if (getN2()>getN1()){
            System.out.println("El Numero 2 elevado al Numero 1 da el siguiente resultado: "+"\n"+Math.pow(getN2(),getN1()));
        }
        calcularraiz();
    }
    public void calcularraiz(){
      Math.abs(getN1());
      Math.abs(getN2());
        if(getN1()<getN2()){
           System.out.println("La raiz cuadrada del menor valor (Numero 1)es : "+"\n"+Math.sqrt(getN1())); 
        }else if(getN2()<getN1()){
           System.out.println("La raiz cuadrada del menor valor (Numero 2)es : "+"\n"+Math.sqrt(getN2()));   
        }
    }
}
