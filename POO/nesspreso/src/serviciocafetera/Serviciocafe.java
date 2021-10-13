
package serviciocafetera;
import java.util.Scanner;
import nesspreso.newpackage.Cafetera;


public class Serviciocafe {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera n = new Cafetera(); boolean ff;
    public Serviciocafe elegircafetera(){
        do{
            System.out.println("¿Que quieres hacer?"+"\n"+"1) Llenar cafetera"+"\n"+"2) Servir taza"+"\n"+"3) Vaciar cafetera"+"\n"+"4) Agregar café"+"\n"+"5) Salir del menú");  
        int x = leer.nextInt();
        switch(x){
            case 1:
                llenarcafetera();
                continue;
            case 2:
                servirtaza();
                continue;
            case 3:
                vaciarcafetera();
                continue;
            case 4:
                agregarcafe();
                continue;
            case 5:
                ff=true;                      
        }
        }while(ff!=true);
        return null;       
    }
    public void llenarcafetera(){
        System.out.println("Llenando cafetera...");
        n.setCactual(n.getCmaxima());
        System.out.println("La cafetera ahora está llena");
    }
    public void servirtaza(){
        System.out.println("Indique que capacidad tiene la taza (mililitros):");
        int mm = leer.nextInt();
        if(n.getCmaxima()>=mm){
            System.out.println("Se llenó la taza.");
        }else if(n.getCmaxima()<mm){
            System.out.println("No alcanzó para llenar la taza,se alcanzó a llenar hasta los "+(mm-(mm-n.getCactual()))+" mililitros");    
        }
         n.setCactual(n.getCactual()-mm);
    }
    public void vaciarcafetera(){
        System.out.println("Vaciando cafetera...");
        n.setCactual(0);
        System.out.println("Se vació la cafetera");
    }
    public void agregarcafe(){
        System.out.println("¿Cuando café desea agregar? (mililitros)");
        int cap = leer.nextInt();
        if((cap+n.getCactual())>n.getCmaxima()){
            System.out.println("La cantidad que desea agregar es mayor a la capacidad de la cafetera");
        }else{ n.setCactual(n.getCactual()+cap); System.out.println("Se agregó la cantidad de café deseada");
    }
    }
}
