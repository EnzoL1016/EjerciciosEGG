package clases;

import java.util.Scanner;

public class Juego {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego(int numjugadores) {
        if (!(numjugadores >= 1 && numjugadores <= 6)) {
            numjugadores = 6;
        }
        jugadores = new Jugador[numjugadores];
        System.out.println("Ingrese el nombre de los jugadores: ");
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Jugador " + (i + 1) + ":");
            String names = leer.next();
            jugadores[i] = new Jugador(names, i);
        }
        revolver = new Revolver();
    }

    public boolean findeljuego() {
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isMojado()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparo(revolver);
            if (!jugadores[i].isMojado()) {
                return;
            }
        }
    }
}
