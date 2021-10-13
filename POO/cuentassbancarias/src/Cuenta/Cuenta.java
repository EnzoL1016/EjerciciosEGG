
package Cuenta;


public class Cuenta {
    private int cuenta;
    private int dni;
    private double saldo;
        private double d; 
        private double f; 
        private double r;
        private double aumento;
        private double decremento;
        private double decremento1;
    public Cuenta() {
    }

    public Cuenta(int cuenta, int dni, double saldo, double d, double f, double r, double aumento, double decremento, double decremento1) {
        this.cuenta = cuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.d = d;
        this.f = f;
        this.r = r;
        this.aumento = aumento;
        this.decremento = decremento;
        this.decremento1 = decremento1;
    }

   
    

    public int getCuenta() {
        return cuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getD() {
        return d;
    }

    public double getF() {
        return f;
    }

    public double getR() {
        return r;
    }

    public double getAumento() {
       
        return aumento;
    }

    public double getDecremento() {
      
        return decremento;
    }

    public double getDecremento1() {
     
        return decremento1;
    }
    
    

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setF(double f) {
        this.f = f;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setAumento(double aumento) {
        this.aumento = (getD()+getSaldo());
    }

    public void setDecremento(double decremento) {
        this.decremento = (getSaldo()-getF());
    }

    public void setDecremento1(double decremento1) {
        this.decremento1 = (getSaldo()-getR());
    }

    public double setAumento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
