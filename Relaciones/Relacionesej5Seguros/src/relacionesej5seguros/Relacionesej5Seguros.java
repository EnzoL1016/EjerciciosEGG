/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar
que te ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus
clientes coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del
sistema que quiere realizar la empresa.
a. Gestión Integral de clientes. En este módulo vamos a registrar la información
personal de cada cliente que posea pólizas en nuestra empresa. Nombre y apellido,
documento, mail, domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de
un vehículo, como los datos de un solo cliente. Los datos incluidos en ella son:
número de póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de
pago, monto total asegurado, incluye granizo, monto máximo granizo, tipo de
cobertura (total, contra terceros, etc.). Nota: prestar atención al principio de este
enunciado y pensar en las relaciones entre clases. Recuerden que pueden ser de
uno a uno, de uno a muchos, de muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada
póliza. Esas cuotas van a contener la siguiente información: número de cuota,
monto total de la cuota, si está o no pagada, fecha de vencimiento, forma de pago
(efectivo, transferencia, etc.).
 */
package relacionesej5seguros;


import clases.Cuotas;
import clases.Polizas;

import java.util.Scanner;

public class Relacionesej5Seguros {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        boolean x = false;
        Polizas pp = new Polizas();
        System.out.println("Ingrese el numero de clientes que desea registrar: ");
        int cl= leer.nextInt();
        Cuotas [] cc = new Cuotas[cl];
        for (int i = 0; i < cc.length; i++) {
          cc[i]=new Cuotas();
          cc[i].cuotas();
          System.out.println("Se ha registrado la poliza del cliente "+(i+1));
        }
        System.out.println("A continuacion se mostraran todas las polizas registradas: ");
        System.out.println("");
        for (int i = 0; i < cc.length; i++) {
            System.out.println("[ --------------------< CLIENTE  "+(i+1)+">--------------------- ]");
            System.out.println("");
            System.out.println(cc[i].toString());
            System.out.println("--------------------------------------------------------------");
        }
    }
    
}
