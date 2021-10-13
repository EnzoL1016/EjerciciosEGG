package cuentas;

import Cuenta.Cuenta;
import java.util.Scanner;

public class services {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta n = new Cuenta();

    public services datos() {

        System.out.println("Ingrese los datos de su cuenta:");
        System.out.println("Numero de cuenta: ");
        int cuenta = leer.nextInt();
        int x;
        boolean ss;

        do {
            System.out.println("Numero de D.N.I: ");
            String dni = leer.next();
            x = dni.length();
            if (dni.length() == 8) {
                
                System.out.println("Ingrese dinero a la cuenta:");
                boolean aux = false;
                n.setSaldo(leer.nextDouble());
                do {
                    System.out.println("Que desea hacer?" + "\n" + "1)-Ingresar dinero" + "\n" + "2)-Retirar dinero" + "\n" + "3)-Extracción rápida" + "\n" + "4)-Consultar saldo" + "\n" + "5)-Consultar datos" + "\n" + "6)-salir");
                    int p = leer.nextInt();
                    switch (p) {
                        case 1:
                            ingresarsaldo();
                            continue;
                        case 2:
                            retirarsaldo();
                            continue;
                        case 3:
                            extraccionrapida();
                            continue;
                        case 4:
                            consultarsaldo();
                            continue;
                        case 5:
                            consultardatos(dni, cuenta);
                            break;
                        case 6:
                            aux = true;
                            break;
                        default:
                            System.out.println("Esa opcion es invalida.");

                    }
                } while (aux != true);
            } else {
                System.out.println("El D.N.I ingresado no existe.");
                ss = false;
            }                                 
            ss= true;
        } while (ss != true);
        return null;
    }

    public void ingresarsaldo() {

        System.out.println("Que cantidad de dinero desea ingresar a la cuenta?");
        double d;
        double aux;
        n.setD(leer.nextDouble());
        n.setAumento(n.getD() + n.getSaldo());
        n.setSaldo(n.getAumento());
        System.out.println("El saldo de su cuenta es de $" + n.getAumento());
    }

    public void retirarsaldo() {

        System.out.println("Que cantidad de dinero desea retirar?");
        n.setF(leer.nextDouble());
        n.setDecremento(n.getF() - n.getSaldo());
        if (n.getF() > n.getSaldo()) {
            System.out.println("El retiro se realizó con éxito.");
            System.out.println("El saldo de su cuenta es de $0");
        } else {
            System.out.println("El retiro se realizó con éxito.");
            System.out.println("EL saldo de su cuenta es de $" + n.getDecremento());
        }
        n.setSaldo(n.getDecremento());
    }

    public void extraccionrapida() {

        System.out.println("Ingrese la cantidad de dinero que desea extraer:");
        double r;
        n.setR(leer.nextDouble());

        if ((n.getSaldo() * .20) < n.getR()) {
            System.out.println("Solo puedes retirar un 20% de tu sueldo.");

        } else {
            System.out.println("La extracción se realizó con éxito.");
            n.setDecremento1(n.getSaldo() - n.getR());
            System.out.println("El saldo actual es de $" + n.getDecremento1());
        }

        n.setSaldo(n.getDecremento1());
    }

    public void consultarsaldo() {
        System.out.println("El saldo de tu cuenta es de: " + n.getSaldo());
    }

    public void consultardatos(String dni, int cuenta) {
        System.out.println("Numero de cuenta: " + cuenta + "\n" + "Numero de D.N.I: " + dni + "\n" + "Saldo actual: " + n.getSaldo());
    }

}
