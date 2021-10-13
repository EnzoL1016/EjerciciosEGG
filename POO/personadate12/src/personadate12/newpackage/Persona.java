package personadate12.newpackage;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona {
private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String Persona;
    private int anio;
    private byte mes;
    private byte dia;
    private int edad;
    LocalDate fechaI;

    public Persona() {
    }

    public Persona(String Persona, int anio, byte mes, byte dia, int edad) {
        this.Persona = Persona;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.edad = edad;
    }

   
    

    public String getPersona() {
        return Persona;
    }

    public int getAnio() {
        return anio;
    }

    public byte getMes() {
        return mes;
    }

    public byte getDia() {
        return dia;
    }

    public LocalDate getFechaI() {
        return fechaI;
    }

    public int getEdad() {
        return edad;
    }

    public void setPersona(String Persona) {
        this.Persona = Persona;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public void setFechaI(LocalDate fechaI) {
        this.fechaI = fechaI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Persona ingresardatos(){
        System.out.println("Ingresa el nombre de la persona:");
        setPersona(leer.next());
        System.out.println("Ahora ingrese la fecha de nacimiento");
        System.out.println("Dia: ");
        setDia(leer.nextByte());
        System.out.println("Mes: ");
        setMes(leer.nextByte());
        System.out.println("Año: ");
        setAnio(leer.nextInt());
        LocalDate Fecha = LocalDate.of(getAnio(), getMes(), getDia());
        setFechaI(Fecha);
        calcularedad();
        return null;    
    }
    public void calcularedad(){
        System.out.println("Se calculará la edad de la persona...");
       
        LocalDate fechaHoy = LocalDate.now();
        Period periodoT = Period.between(getFechaI(),fechaHoy);
        System.out.println("La edad de la persona es de "+periodoT.getYears()+" años");
        setEdad(periodoT.getYears());
         System.out.println("");
        menorque();
    }
    public void menorque(){
        System.out.println("Se evaluará el parametro de edad: ");
        boolean x=false;
        final int edad = 18;
        if(getEdad()<edad){
            x=true;
        }
        System.out.println("Parametro de edad: "+x);
         System.out.println("");
        mostrarpersona();
    }
    public void mostrarpersona(){
        System.out.println("Datos ingresados de la persona: ");
        System.out.println("Nombre: "+getPersona()+"\n"+"Edad: "+getEdad());
    }
}
