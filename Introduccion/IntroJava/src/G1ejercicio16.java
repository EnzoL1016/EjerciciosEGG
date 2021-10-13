
import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. 
 */


public class G1ejercicio16 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cadenas de texto compatible con RS232:");
        int x=0; int z=0;String cadena;
        do{
          cadena = leer.next(); 
         int n = cadena.length();
          if((n == 5)&& (cadena.substring(0,1).equals("X")) && cadena.substring(4,5).equals("O")  )
              x=x+1;
          else
              z=z+1;
        }while(cadena.equals("&&&&&") == false );
        System.out.println("El numero de cadenas correctas ingresadas fue de " +x);
        System.out.println("El numero de cadenas incorrectas ingresadas fue de "+(z-1));
}
}