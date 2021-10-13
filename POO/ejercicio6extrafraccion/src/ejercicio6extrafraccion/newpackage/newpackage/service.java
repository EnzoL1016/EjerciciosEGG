
package ejercicio6extrafraccion.newpackage.newpackage;

import ejercicio6extrafraccion.newpackage.fraccion;
import java.util.Scanner;


public class service {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public service() {
    }    
    private fraccion n = new fraccion();
    public  void comienzo(){       
        boolean salir=false;
        System.out.println("A continuacion ingrese 2 fracciones:");
        System.out.println("Numerador 1:");
        int num = leer.nextInt();
        n.setNum1(num);
        System.out.println("Denominador 1:");
        int den = leer.nextInt();
        n.setDen1(den);
        System.out.println("Numerador 2: ");
        int n2 = leer.nextInt();
        n.setNum2(n2);
        System.out.println("Denominador 2: ");
        int d2 = leer.nextInt();
        n.setDen2(d2);
        if(n.getDen1()==0||n.getDen2()==0){
            System.out.println("El denominador debe ser distinto de 0");
        }else {
        do{
            System.out.println("Elige que operacion desea realizar: "+"\n"+"1) Sumar Fracciones"+"\n"+"2) Restar Fracciones"+"\n"+"3) Multiplicar Fracciones"+"\n"+"4) Dividir Fracciones"+"\n"+"5) Salir");
            int o = leer.nextInt();
            switch(o){
                case 1:
                    sumarfraccion();
                    continue;
                case 2:
                    restarfracciones();
                    continue;
                case 3:
                    multiplicarfracciones();
                    continue;
                case 4:
                    dividirfracciones();
                    continue;
                case 5:
                    salir=true;                   
            }
        }while(!salir);
    }
    }
    public void sumarfraccion(){
         System.out.println("Fracciones a sumar: "+n.getNum1()+"/"+n.getDen1()+"  y  "+n.getNum2()+"/"+n.getDen2());
        System.out.println("La SUMA de las fracciones ingresadas es: "+((n.getNum1()*n.getDen2())+(n.getDen1()*n.getNum2()))+"/"+(n.getDen1()*n.getDen2()));
        double sim = ((n.getNum1()*n.getDen2())+(n.getDen1()*n.getNum2()))/(n.getDen1()*n.getDen2());
        System.out.println("Y simplificada quedaría: "+sim);
    }
    public void restarfracciones(){
        System.out.println("Fracciones a restar: "+n.getNum1()+"/"+n.getDen1()+"  y  "+n.getNum2()+"/"+n.getDen2());
      System.out.println("La RESTA de las fracciones ingresadas es: "+((n.getNum1()*n.getDen2())-(n.getDen1()*n.getNum2()))+"/"+(n.getDen1()*n.getDen2()));  
      double sim = ((n.getNum1()*n.getDen2())-(n.getDen1()*n.getNum2()))/(n.getDen1()*n.getDen2());
      System.out.println("Y simplificada quedaría: "+sim);
    }
    public void multiplicarfracciones(){
        System.out.println("Fracciones a multiplicar: "+n.getNum1()+"/"+n.getDen1()+"  y  "+n.getNum2()+"/"+n.getDen2());
        System.out.println("La MULTIPLICACION de las fracciones ingresadas es: "+(n.getNum1()*n.getNum2())+"/"+(n.getDen1()*n.getDen2()));
        double simp = (n.getNum1()*n.getNum2())/(n.getDen1()*n.getDen2());
        System.out.println("Y simplificada quedaría: "+simp);
    }
    public void dividirfracciones(){
        System.out.println("Fracciones a dividir: "+n.getNum1()+"/"+n.getDen1()+"  y  "+n.getNum2()+"/"+n.getDen2());
        System.out.println("La DIVISION de las fracciones ingresadas es: "+(n.getNum1()*n.getDen2())+"/"+(n.getDen1()*n.getNum2()));
        double simp = (n.getNum1()*n.getDen2())/(n.getDen1()*n.getNum2());
        System.out.println("Y simplificada quedaría: "+simp);
    }
}
