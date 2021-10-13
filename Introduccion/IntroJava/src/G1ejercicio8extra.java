
import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse.
 */
public class G1ejercicio8extra {

   
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x = 0;
        int z = 0;
        int y = 0;
        int n = 0;
         try{
        do {
            System.out.println("Ingrese un valor:");
            n = leer.nextInt();
            y = y + 1;
            if (n > 0) {
                if (n % 2 == 0) {
                    x = x + 1;
                } else {
                    z = z + 1;
                }
            }
        } while (n % 5 != 0);
        System.out.println("La cantidad de numeros ingresados es " + y);
        System.out.println("La cantidad de numeros pares ingresados es de " + x);
        System.out.println("La cantidad de numeros impares ingresados es de " + z);
    }catch(Exception valor){
             System.out.println("El valor ingresado no es válido.");
    }  
}
}
