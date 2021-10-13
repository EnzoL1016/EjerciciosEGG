
import java.util.Scanner;

/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */


public class G1ejercicio16extra {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero:");
        int n= leer.nextInt(); boolean z=false;
        primoss(n,z);       
    }
    public static void primoss(int n,boolean z){ 
      int x=0;
      for(int i=1; i<=n;i++){
          if(n%i==0){
              x++;
          }
      }
      if(x==2){
          z=true;
          System.out.println("El numero ingresado es primo.");
      }else if(x!=2){ 
      z=false;
       System.out.println("El numero ingresado no es primo.");
      }    
    }
}
