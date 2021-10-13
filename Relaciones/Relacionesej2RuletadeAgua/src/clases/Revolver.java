package clases;

public class Revolver {

    private int posicion_actual;
    private int posicion_agua;

    public Revolver() {
        posicion_actual = Metodos.generarespacioaleatorio(1, 6);
        posicion_agua = Metodos.generarespacioaleatorio(1, 6);
    }

    public boolean mojar() {
        boolean mojado = false;
        if (posicion_actual==posicion_agua){
            mojado = true;
        }
        siguientechorro();
        return mojado;
    }
    public void siguientechorro(){
        if(posicion_actual==6){
            posicion_actual=1;
        }else{
            posicion_actual++;
        }
    }

    @Override
    public String toString() {
        return "Posicion Actual: " + posicion_actual +"\n"+"Posicion del agua: " + posicion_agua;
    }
    
}
