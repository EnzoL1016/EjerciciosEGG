
import java.util.Scanner;


/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class G1ejercicio1 {

    public static void main(String[] args) {
       
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
       boolean salir = false;
   
        System.out.println("Ingrese la cantidad de euros que desea:"); 
    int eur = leer.nextInt();
    
  do{
      String cad = "Elija a que moneda quiere convertir los Euros:\n1)-Dólares\n2)-Yenes\n3)-Libras\n4)-Salir";
        System.out.println(cad);
    int opcion = leer.nextInt();
       switch(opcion){
           case 1:
               System.out.println("Los Euros ingresados equivaldrian a "+(eur/1.28611)+ "$ (dólares)" );
         break;
           case 2:
               System.out.println("Los Euros ingresados equivaldrian a "+ (eur/129.852)+ "¥ (yenes)");
          break;
           case 3:
               System.out.println("Los Euros ingresados equivaldrian a "+ (eur/0.86)+ "£ (libras)");
             break;
           case 4:
             salir=true;          
       }
      
   }while(!salir);
    }

}
