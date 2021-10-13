
import java.util.Scanner;

/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse.
 */


public class G1ejercicio15 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x=0;int n;
        System.out.println("Ingrese 20 numeros, si uno de ellos es cero, no podrá ingresar más: ");
         int suma=0;
        do{
           n = leer.nextInt();
             x = x+1;
             if(n>0){
                 suma=suma+n;}
        }while(x<20 && n!=0);
        if(n == 0)
            System.out.println("Se capturó el numero 0");
        System.out.println("La suma de los numeros ingresados es " +suma );
    }    
}
