
import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */


public class G1ejercicio20extra {

  
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int x=0;int z=1;double promedio;int y=0;int j=0;
    while(x!=10){
        System.out.println("Ingrese las notas del alumno "+z);
        System.out.println("Primer trabajo práctivo evaluativo:");
        int ptp = leer.nextInt();
        if(ptp<0||ptp>10){
            System.out.println("Esa nota no es válida.");
            break;
        }
        System.out.println("Segundo trabajo práctico evaluativo:");
        int stp = leer.nextInt();
        if(stp<0||stp>10){
            System.out.println("Esa nota no es válida.");
            break;
        }
        System.out.println("Primer integrador:");
        int pint = leer.nextInt();
        if(pint<0||pint>10){
            System.out.println("Esa nota no es válida.");
            break;
        }
        System.out.println("Segundo integrador:");
        int sint = leer.nextInt();
        if(sint<0||sint>10){
            System.out.println("Esa nota no es válida.");
            break;
        }
        promedio=((ptp*.10)+(stp*.15)+(pint*.25)+(sint*.50));
        System.out.println("Promedio final: "+promedio);
        x++;z++;
        if (promedio>7){
            y++;
        }else j++;
    }
        System.out.println("La cantidad de alumnos aprobados es de "+y);
        System.out.println("La cantidad de alumnos desaprobados es de "+j);
    }    
}
