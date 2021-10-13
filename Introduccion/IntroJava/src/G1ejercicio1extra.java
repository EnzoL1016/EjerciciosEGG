
import javax.swing.JOptionPane;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */
public class G1ejercicio1extra {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una cantidad de minutos", JOptionPane.INFORMATION_MESSAGE));
        @SuppressWarnings("UnusedAssignment")
        byte opcion = 0;
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "MENU PRINCIPAL \n"
                    + "1. Pasar a horas\n"
                    + "2. Pasar a dias\n"
                    + "3. Salir\n"
                    + "ELIJA SU OPCIÓN"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, n + " minutos equivalen a " + n / 60 + " horas.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, n + " minutos equivalen a " + (n * 0.000694) + " dias.");
                    break;
                case 3:
                    opcion = 3;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (opcion != 3);
    }

}
