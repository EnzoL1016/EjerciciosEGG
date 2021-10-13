package elahorcado.newpackage;

import java.util.Scanner;

public class Ahorcado {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    final private int errores = 6;
    final private int NUMERO_CARACTERES = 26;
    private String pista, palabraAdivinar;

    public Ahorcado() {
    }

    public Ahorcado(String pista, String palabraAdivinar) {
        this.pista = pista;
        this.palabraAdivinar = palabraAdivinar;
    }

    public Scanner getLeer() {
        return leer;
    }

    public int getErrores() {
        return errores;
    }

    public int getNUMERO_CARACTERES() {
        return NUMERO_CARACTERES;
    }

    public String getPista() {
        return pista;
    }

    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public void comienzo() {
        boolean gameover = false;
        char abecedario[] = generaCaracteres();
        int f = getErrores();
        boolean caracteresInsertados[] = new boolean[NUMERO_CARACTERES];
        String palabraElegida;
        while (gameover == false) {
            palabraElegida = validar(
                    "Escribe una palabra con solo caracteres y sin espacios: ",
                    "Error, escribe palabra con solo caracteres y sin espacios y de longitud de mas de 1");

            pista = validar(
                    "Escribe una pista con solo caracteres y sin espacios: ",
                    "Error, escribe pista con solo caracteres y sin espacios");
            espacios(30);
            palabraAdivinar = rellenaGuiones(palabraElegida);
            while (!palabraCorrecta(palabraElegida, palabraAdivinar) && f > 0) {
                System.out.println("Pista: " + pista);
                mostrarPalabra(palabraAdivinar);
                mostrarRepetidos(abecedario, caracteresInsertados);
                String palabraUsuario = pedirString("Escribe una letra, si escribes una palabra sera como escribir la solucion:" ).toLowerCase();
                if (palabraUsuario.length() == 1) {
                    if (Character.isAlphabetic(palabraUsuario.charAt(0))) {
                        if (caracterIntroducido(caracteresInsertados, palabraUsuario.charAt(0))) {
                            System.out.println("Ya se usó este caracter, elige otro");
                        } else if (numRemplazos(palabraElegida, palabraUsuario.charAt(0)) > 0) {
                            palabraAdivinar = remplazar(palabraElegida, palabraAdivinar, palabraUsuario.charAt(0));
                        } else {
                            f--;
                            System.out.println("Error, te quedan " + f + " intentos");
                        }
                        actualizarInsertados(caracteresInsertados, palabraUsuario.charAt(0));
                    }
                } else if (!palabraCorrecta(palabraElegida, palabraUsuario)) {
                    f--;
                    System.out.println("Error, no es la palabra correcta");
                } else {
                    palabraAdivinar = palabraUsuario;
                    System.out.println("Acertaste!!!");
                    gameover = true;
                }
            }
           gameover = true;           
        }
    }

    public static char[] generaCaracteres() {
        char[] caracteres = new char[26];
        for (int i = 0, j = 97; i < caracteres.length; i++, j++) {
            caracteres[i] = (char) j;
        }
        return caracteres;
    }
    public static void mostrarPalabra(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " ");
        }
        System.out.println("");
    }

    public String validar(String mensaje, String mensajeError) {
        String palabra;
        boolean correcto;
        do {
            correcto = true;
            palabra = pedirString(mensaje).toLowerCase();

            if (comprobarAlfabeticos(palabra) || palabra.length() <= 1) {
                System.out.println(mensajeError);
                correcto = false;
            }
        } while (!correcto);
        return palabra;
    }

    public static boolean comprobarAlfabeticos(String cadena) {
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (!Character.isAlphabetic(caracter)) {
                return true;
            }
        }
        return false;
    }

    public String pedirString(String mensaje) {
        System.out.println(mensaje);
        return leer.next();
    }

    public static void espacios(int numSaltos) {

        for (int i = 0; i < numSaltos; i++) {
            System.out.println("");
        }
    }

    public static String rellenaGuiones(String cadena) {
        String palabra = "";
        for (int i = 0; i < cadena.length(); i++) {
            palabra += "_";
        }
        return palabra;
    }

    public static boolean palabraCorrecta(String palabraOriginal, String palabraUsuario) {
        return palabraOriginal.equals(palabraUsuario);
    }

    public static void mostrarRepetidos(char[] abecedario, boolean insertados[]) {
        System.out.print("Repetidas: ");
        for (int i = 0; i < insertados.length; i++) {
            //Si esta insertado, se muestra el caracter
            if (insertados[i]) {
                System.out.print(abecedario[i] + ",");
            }
        }
        System.out.println("");
    }

    public static boolean caracterIntroducido(boolean[] insertados, char caracter) {
        return insertados[caracter - 'a'];
    }

    public static void actualizarInsertados(boolean[] insertados, char caracter) {
        insertados[caracter - 'a'] = true;
    }

    public static int numRemplazos(String cadenaOriginal, char caracter) {
        int remplazos = 0;
        char caracterCadena;
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            caracterCadena = cadenaOriginal.charAt(i);
            if (caracterCadena == caracter) {
                remplazos++;
            }
        }
        return remplazos;
    }

    public static String remplazar(String cadenaOriginal, String cadenaRemplazar, char caracter) {
        String cadenaRemplazo = "";
        char caracterCadena;
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            caracterCadena = cadenaOriginal.charAt(i);
            if (caracterCadena == caracter) {
                cadenaRemplazo += caracter;
            } else {
                cadenaRemplazo += cadenaRemplazar.charAt(i);
            }
        }
        return cadenaRemplazo;
    }
}
