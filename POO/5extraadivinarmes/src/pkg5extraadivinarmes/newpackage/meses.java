package pkg5extraadivinarmes.newpackage;

import java.util.Scanner;

public class meses {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public meses() {
    }

    public Scanner getLeer() {
        return leer;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

   

    public void adivinarmes() {
        boolean x = false;
        int f = (int) (Math.random() * 10);
        String messecreto = getMeses()[f];
        System.out.println(f);
        System.out.println("Elije un mes y si es el mes secreto se mostrará un mensaje...");
        do{
        String mes = leer.next();
        if (mes.equals(messecreto)) {
            System.out.println("Has adivinado el mes secreto!!");
            x = true;
        } else {
            System.out.println("No has adivinado el mes secreto, vuelve a intentarlo");
        }
    } while(x!=true);
    }
}
