
package pkg4extranif.newpackage;


import java.util.Scanner;

public class Niff {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private int dni;
   private String [] pos = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public Niff() {
    }

    public Niff(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public String[] getPos() {
        return pos;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setPos(String[] pos) {
        this.pos = pos;
    }
   
    public void ingresardni(){
        System.out.println("Ingrese su numero de DNI:");
        setDni(leer.nextInt());
        int vv = 0;
        if(getDni()<=99999999 && getDni()>=10000000){
            System.out.println("Se calculará el numero de serie de el DNI ingresado...");
            int v = getDni();
            vv= v%23;
            System.out.println("La letra correspondiente a tu DNI es la "+getPos()[vv]);            
        }else{ System.out.println("El DNI ingresado es incorrecto");
    }
       mostrardni(vv);
    }
    public void mostrardni(int vv){
        System.out.println("El DNI ingresado es: ");
        System.out.println(getDni()+"-"+getPos()[vv]);
    }
}
