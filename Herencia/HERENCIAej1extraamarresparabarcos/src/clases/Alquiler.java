package clases;

import java.time.LocalDate;
import java.util.Scanner;

public class Alquiler {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private long documento;
    private String fecha_de_alquiler;
    private String fecha_de_devolucion;
    private String posicion_del_amarre;
    private Barcos barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long documento, String fecha_de_alquiler, String fecha_de_devolucion, String posicion_del_amarre, Barcos barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fecha_de_alquiler = fecha_de_alquiler;
        this.fecha_de_devolucion = fecha_de_devolucion;
        this.posicion_del_amarre = posicion_del_amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getFecha_de_alquiler() {
        return fecha_de_alquiler;
    }

    public void setFecha_de_alquiler(String fecha_de_alquiler) {
        this.fecha_de_alquiler = fecha_de_alquiler;
    }

    public String getFecha_de_devolucion() {
        return fecha_de_devolucion;
    }

    public void setFecha_de_devolucion(String fecha_de_devolucion) {
        this.fecha_de_devolucion = fecha_de_devolucion;
    }

    public String getPosicion_del_amarre() {
        return posicion_del_amarre;
    }

    public void setPosicion_del_amarre(String posicion_del_amarre) {
        this.posicion_del_amarre = posicion_del_amarre;
    }

    public Barcos getBarco() {
        return barco;
    }

    public void setBarco(Barcos barco) {
        this.barco = barco;
    }

    private Velero v = new Velero();
    private Yate_de_lujo y = new Yate_de_lujo();
    private Barco_a_motor b = new Barco_a_motor();

    public void alquilarUnBarco() {

        System.out.println("Asi que desea alquilar un barco!" + "\n"
                + "Primero debemos tomarle sus datos...");
        System.out.println("");
        System.out.println("Ingrese su nombre: ");
        setNombre(leer.next());
        System.out.println("Ingrese su numero de documento: ");
        setDocumento(leer.nextLong());
        LocalDate i = LocalDate.now();
        setFecha_de_alquiler(i.toString());
        System.out.println("Ingrese el numero de dias que desea alquilar el amarre:");
        int dd = leer.nextInt();
        LocalDate f = i.plusDays(dd);
        setFecha_de_devolucion(f.toString());
        setPosicion_del_amarre(Metodos.posicion_amarre[Metodos.generarNumeroAleatorio(0, Metodos.posicion_amarre.length - 1)]);
        System.out.println("Ahora elija el tipo de barco que desea alquilar: " + "\n"
                + "1) Velero" + "\n"
                + "2) Barco a Motor" + "\n"
                + "3) Yate de Lujo");
        int op = leer.nextInt();

        switch (op) {
            case 1:
                v.crearVelero();
                System.out.println("El precio del alquiler será de: " + ((dd * (v.getEslora() * 10)) + (100 * v.getNumero_de_mastiles())) + "$");
                Alquiler veleroa = new Alquiler(getNombre(), getDocumento(), getFecha_de_alquiler(), getFecha_de_devolucion(), getPosicion_del_amarre(), getBarco());
                System.out.println("A continuación se mostraran los datos del alquiler...");
                System.out.println("____________________________________________________________");
                System.out.println("");
                System.out.println(veleroa.toString());
                System.out.println(v.toString());
                System.out.println("____________________________________________________________");
                break;
            case 2:
                b.crearBarco();
                System.out.println("El precio del alquiler será de: " + ((dd * (b.getEslora() * 10)) + b.getPotencia()) + "$");
                Alquiler barcob = new Alquiler(getNombre(), getDocumento(), getFecha_de_alquiler(), getFecha_de_devolucion(), getPosicion_del_amarre(), getBarco());
                System.out.println("A continuación se mostraran los datos del alquiler...");
                System.out.println("____________________________________________________________");
                System.out.println("");
                System.out.println(barcob.toString());
                System.out.println(b.toString());
                System.out.println("____________________________________________________________");
                break;
            case 3:
                y.crearYate();
                System.out.println("El precio del alquiler será de: " + ((dd * (y.getEslora() * 10)) + y.getPotencia()) + "$");
                Alquiler yatec = new Alquiler(getNombre(), getDocumento(), getFecha_de_alquiler(), getFecha_de_devolucion(), getPosicion_del_amarre(), getBarco());
                System.out.println("A continuación se mostraran los datos del alquiler...");
                System.out.println("____________________________________________________________");
                System.out.println("");
                System.out.println(yatec.toString());
                System.out.println(y.toString());
                System.out.println("____________________________________________________________");
                break;
            default:
                System.out.println("Opcion incorrecta");
                System.out.println("1) Velero" + "\n" + "2) Barco a Motor" + "\n" + "3) Yate de Lujo");
                op = leer.nextInt();
        }
    }

    @Override
    public String toString() {
        return "Alquiler: " + "\n"
                + "Nombre: " + nombre + "\n"
                + "Documento: " + documento + "\n"
                + "Fecha de alquiler: " + fecha_de_alquiler + "\n"
                + "Fecha de devolución: " + fecha_de_devolucion + "\n"
                + "Posición del amarre: " + posicion_del_amarre + "\n"
                + "Barco: ";
    }
}
