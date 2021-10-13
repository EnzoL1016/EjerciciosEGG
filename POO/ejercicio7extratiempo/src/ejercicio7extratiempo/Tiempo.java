
package ejercicio7extratiempo;

import java.util.InputMismatchException;
import java.util.Scanner;
import static javafx.application.Platform.exit;


public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Tiempo() {
    }

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
   
    public void imprimirhoracompleta(){
        System.out.println("Ingrese las horas: ");
        setHora(leer.nextInt());
        System.out.println("Ingrese los minutos: ");
        setMinuto(leer.nextInt());
        System.out.println("Ingrese los segundos: ");
        setSegundo(leer.nextInt());
     
        if(getMinuto()<=60 && getMinuto()>=0 && getSegundo()<=60 && getMinuto()>=0&& getHora()<=24&&getHora()>=0){
        
                    for (int l = 0; l < 24; l++) {
                        for (int m = 0; m < 60; m++) {
                            for (int n = 0; n < 60; n++) {
                                System.out.println( l+":"+m+":"+n);
                                delay();
                                if(l==getHora()&&m==getMinuto()&&n==getSegundo()){
                                    System.out.println("Finalizado en el tiempo establecido.");
                                    return;
                                }
                            }
                        }
                    }  
        }else System.out.println("Tiempo ingresado no valido");
    }
     private static void delay(){
        try{
          Thread.sleep(1000);
          
    }catch(InterruptedException e){}
    }
  
}
