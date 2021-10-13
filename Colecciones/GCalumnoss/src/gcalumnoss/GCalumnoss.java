/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
 */
package gcalumnoss;

import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;



public class GCalumnoss {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        Alumnos s = new Alumnos(); int x=0;
        ArrayList <Alumnos> n = new ArrayList();
        crearalumnos(n,s);
        System.out.println("Ingrese el nombre del alumno que desea buscar: ");
        String nn = leer.next();
        for (int i = 0; i < n.size(); i++) {            
             if(n.get(i).getNombre().equals(nn)){
                 x++;
            notafinal(i,n);
           }      
        }
        System.out.println("El nombre ingresado no se encuentra en la lista.");
    }  
    public static void crearalumnos(ArrayList <Alumnos> n, Alumnos s){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");

        boolean x = false; 
        System.out.println("A continuación se ingresaran los datos de los alumnos: ");
        do{
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            System.out.println("Ingrese la primer nota: ");
            Integer n1 = leer.nextInt();
            s.setN1(n1);
            s.Listanotas.add(n1);
            System.out.println("Ingrese la segunda nota: ");
            Integer n2 = leer.nextInt();
            s.setN2(n2);
            s.Listanotas.add(n2);
            System.out.println("Ingrese la tercer nota: ");
            Integer n3 = leer.nextInt();
            s.setN3(n3);
            s.Listanotas.add(n3);
            System.out.println("");
            s.setNotafinal(s.getNotafinal());
            n.add(new Alumnos(s.Listanotas,nombre,s.getNotafinal()));          
            System.out.println("¿Desea ingresar otro alumno?");
            String rr = leer.next();           
            String zz=toUpperCase(rr);
            n.get(0).getNombre();
           switch(zz){
               case "N":
                   x=true;
                   break;
               case "S":
                   x=false;
                   break;
               default:
                   System.out.println("Opción no disponible.");
                   System.out.println("¿Desea ingresar otro alumno?");
                   rr = leer.next();                   
           }
        }while(!x);
    }
    public static void notafinal(int i,ArrayList <Alumnos> n){
        System.out.println("El alumno "+n.get(i).getNombre()+" tiene una nota final de: ");
        System.out.println((n.get(i).getNotafinal()));
        System.exit(0);
    }
}
