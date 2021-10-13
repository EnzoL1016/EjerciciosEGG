
package nesspreso.newpackage;


public class Cafetera {
  private int cmaxima=1000;
  private int cactual;

    public Cafetera() {
    }

    public Cafetera(int cmaxima, int cactual) {
        this.cmaxima = cmaxima;
        this.cactual = 0;
    }

    public int getCmaxima() {
        return cmaxima;
    }

    public int getCactual() {
        return cactual;
    }

    public void setCmaxima(int cmaxima) {
        this.cmaxima = cmaxima;
    }

    public void setCactual(int cactual) {
        this.cactual = cactual;
    }
  
}
