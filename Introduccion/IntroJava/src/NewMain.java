
import javax.swing.JOptionPane;
public class NewMain {

    public static void main(String[] args) {
        int num1, num2, suma, resta, mult;
        double div;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "Insertar", JOptionPane.INFORMATION_MESSAGE));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número", "Insertar", JOptionPane.INFORMATION_MESSAGE));
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        @SuppressWarnings("UnusedAssignment")
        byte opcion = 0;
        try{
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "MENU PRINCIPAL \n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "ELIJA SU OPCIÓN"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + mult);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El resultado de la división es: " + div);
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (opcion != 5);
        System.exit(0);
    }catch(Exception valores){
        JOptionPane.showMessageDialog(null,"El valor que intenta ingresar no es válido");
    }
}
}    

