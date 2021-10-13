package arregloss.newpackage;

import java.util.Arrays;

public class Arreglos {

    private double[] ve1 = new double[50];
    private double[] ve2 = new double[20];

    public Arreglos() {
    }

    public double[] getVe1() {
        return ve1;
    }

    public double[] getVe2() {
        return ve2;
    }

    public void setVe1(double[] ve1) {
        this.ve1 = ve1;
    }

    public void setVe2(double[] ve2) {
        this.ve2 = ve2;
    }

    public void rellenarvectores() {
        System.out.println("Se rellenará el arreglo 1 con numeros aleatorios: ");
        for (int i = 0; i < 50; i++) {
            getVe1()[i] = Math.random() * 100;
            getVe1()[i] = Math.round(getVe1()[i] * 100.0) / 100.0;
        }
        mostrarvector();
    }

    public void mostrarvector() {
        double menor;
        System.out.println("Queda de la siguiente manera: ");
        Arrays.toString(getVe1());
        System.out.println(Arrays.toString(getVe1()));
        System.out.println("");
        System.out.println("Ahora se lo mostrará ordenado: ");
        Arrays.sort(getVe1());
        System.out.println(Arrays.toString(getVe1()));
        asignarvaloraB();
    }

    public void asignarvaloraB() {
        System.out.println("Se rellenara el segundo arreglo con los primeros 10 valores del primero mas 0.5 en el resto de valores:");
        setVe2(Arrays.copyOf(getVe1(), 20));
        Arrays.fill(getVe2(), 10, 20, 0.5);
        System.out.println(Arrays.toString(getVe2()));
    }
}
