
package ejercicio9extrafecha;

import java.time.LocalDate;
import java.util.Scanner;


public class Fecha {
    boolean diaCorrecto, mesCorrecto, añoCorrecto;
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private int dia = 1;
    private int mes = 1;
    private int año = 1900;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void mostrardatos(){
        añoCorrecto = año > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        System.out.println("Ingrese una fecha: ");
        System.out.println("Año:");
        año = leer.nextInt();
        setAño(año);
        System.out.println("Mes:");
        mes = leer.nextInt();
        setMes(mes);
        System.out.println("Dia: ");
        dia = leer.nextInt();
        setDia(dia);
      fechaCorrecta();
      actualizar( diaCorrecto, mesCorrecto, añoCorrecto);
      diadelmes();
      diaSiguiente();
      diaanterior();    
    }
    public boolean fechaCorrecta() {
        
        
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                    System.out.println("El año ingresado es biciesto.");
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
    private boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }
    private void actualizar(boolean diaCorrecto, boolean mesCorrecto, boolean añoCorrecto){
        if(añoCorrecto==true && mesCorrecto==true && diaCorrecto==true){
         if(año<1900 || año>2021){
          
            System.out.println("Se actualizó la fecha por defecto a "+getDia()+"-"+getMes()+"-"+getAño());           
        }   
        }      
    }
    public void diadelmes(){
        String [] mesess ={"Enero","Febrero","Marzo","Abril","Mayo","junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        switch(mes){
           case 2:               
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                    System.out.println("El mes de "+mesess[1]+" tiene 29 dias.");
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                    System.out.println("El mes de "+mesess[1]+" tiene 28 dias.");
                }
                break;
            case 4:
                System.out.println("El mes de "+mesess[3]+" tiene 30 dias.");
                 break;
            case 6:
                System.out.println("El mes de "+mesess[5]+" tiene 30 dias.");
                 break;
            case 9:
                System.out.println("El mes de "+mesess[8]+" tiene 30 dias.");
                 break;
            case 11:             
                System.out.println("El mes de "+mesess[10]+" tiene 30 dias.");
                 break;               
            default:               
                switch(mes){
                    case 1:
                        System.out.println("El mes de "+mesess[0]+" tiene 31 dias.");
                         break;
                    case 3:
                        System.out.println("El mes de "+mesess[2]+" tiene 31 dias.");
                         break;
                    case 5:
                        System.out.println("El mes de "+mesess[4]+" tiene 31 dias.");
                         break;
                    case 7:
                        System.out.println("El mes de "+mesess[6]+" tiene 31 dias.");
                         break;
                    case 8:
                        System.out.println("El mes de "+mesess[7]+" tiene 31 dias.");
                         break;
                    case 10:
                        System.out.println("El mes de "+mesess[9]+" tiene 31 dias.");
                        break;
                    case 12:
                        System.out.println("El mes de "+mesess[11]+" tiene 31 dias.");
                }
        }
    }   
      public void diaSiguiente() {
          LocalDate lll = LocalDate.of(getAño(),getMes(),getDia());
          LocalDate fechaAumen = lll.plusDays(1);
          System.out.println("El dia siguiente a la fecha ingresada es "+fechaAumen);
     }
      public void diaanterior() {      
        LocalDate lll = LocalDate.of(getAño(),getMes(),getDia());
          LocalDate fechaAumen = lll.minusDays(1);
         System.out.println("El dia anterior a la fecha ingresada es "+fechaAumen);
     }
}
