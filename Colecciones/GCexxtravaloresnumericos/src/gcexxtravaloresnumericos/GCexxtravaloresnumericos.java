/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package gcexxtravaloresnumericos;

import java.util.ArrayList;
import java.util.Scanner;



public class GCexxtravaloresnumericos {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner  (System.in).useDelimiter("\n");
        ArrayList <Integer> valores = new ArrayList(); boolean x = false; int cont =0; long suma=0;
        System.out.println("A continuación ingresara valores, si ingresa el -99 se mostrara por pantalla el numero de valores que ingresaste, su suma y su promedio...");
        do{
         System.out.println("Ingrese un valor: ");
         Integer ss = leer.nextInt(); 
         if(ss != -99){
             valores.add(ss);
             cont++;
              long sumas = valores.stream()
            .mapToLong(Integer::longValue)
            .sum();
              suma=sumas;
         }else x=true;
        }while(!x);
        System.out.println("Se ha detenido la cuenta!!");
        System.out.println("----------------------------------");
        System.out.println("El numero de valores ingresados es de "+cont+"\n"+"La suma de todos los valores ingresados es de "+suma+"\n"+"El promedio de los numeros ingresados es de "+(suma/cont));
    }   
}
