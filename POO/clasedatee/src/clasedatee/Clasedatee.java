/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package clasedatee;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Clasedatee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un dia(2 digitos)");
        byte diaI = sc.nextByte();
        System.out.println("Ingrese un mes(2 digitos)");
        byte mesI = sc.nextByte();
        System.out.println("Ingrese un anio(4 digitos)");
        int anioI = sc.nextInt();

        // Para cargar fecha
        LocalDate fechaI = LocalDate.of(anioI, mesI, diaI);
        System.out.println("Su fecha ingresada: " + fechaI);

        //Para conocer cuanto tiempo paso 
        LocalDate fechaHoy = LocalDate.now();
        Period periodoT = Period.between(fechaI,fechaHoy);
        System.out.println("\n Tiempo trasncurrido desde su fecha ingresada a HOY:" + periodoT
                + "\n Años transcurridos(EDAD EJ:):" + periodoT.getYears()); //USO SI QUIERO SABER EDAD D ALGUIEN POR EJ.

        //Para sumar dias desde una fecha determinada(Le sumo ej cantidad de dias)
        //Existe tambein plusMonths , plusWeeks,plusMonths,plusYears.
        LocalDate fechaAumen = fechaI.plusDays(15);
        System.out.println("El dia correspondiente luego de 15 dias a la fecha que ingreso es: " + fechaAumen);

        //Para saber si es bisieso el año ingresado --> retorna booleano
        System.out.println("Año bisiesto:" + fechaI.isLeapYear());

        //Para saber en dias el periodo transcurrido(Debi primero utilizar EPOCH para cada fecha utilizo)
        long auxi1 = fechaI.toEpochDay();
        long auxi2 = fechaHoy.toEpochDay();
        long diferenciaDias = (auxi2 - auxi1);
        System.out.println("Dias totales trasncurridos desde fecha ingresada a hoy: " + diferenciaDias);

        //Para saber cuantos dias tiene el mes ingresado (retorna un numero), tambein esta para saber cuando dias
        //tiene ese año.
        System.out.println("El mes ingresado contiene: " + fechaI.lengthOfMonth() + " dias.");
        periodoT.toTotalMonths();       
    }
}