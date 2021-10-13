package cadenafrase.newpackage;


import java.util.Scanner;

public class Cadena {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String frase;
    private int leng;

    public Cadena() {
    }

    public Cadena(String frase, int leng) {
        this.frase = frase;
        this.leng = leng;
    }

    public String getFrase() {
        return frase;
    }

    public int getLeng() {
        return leng;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLeng(int leng) {
        this.leng = frase.length();
    }

    public Cadena crearfrase() {
        System.out.println("Ingrese una frase:");
        setFrase(leer.next());
        boolean x = false;
        try {
        do {
            System.out.println("¿Que desea hacer?" + "\n" + "1) Contar vocales" + "\n" + "2) Invertir frase" + "\n" + "3) Evaluar cuantas veces se repite un caracter" + "\n" + "4) Comparar longitud con una nueva frase" + "\n" + "5) Unir a una nueva frase" + "\n" + "6) Reemplazar un caracter" + "\n" + "7) Evaluar si contiene un caracter ingresado" + "\n" + "8) Salir");
            int o = leer.nextInt();
            
                switch (o) {
                    case 1:
                        mostrarvocales();
                        continue;
                    case 2:
                        invertirfrase();
                        continue;
                    case 3:
                        vecesrepetido();
                        continue;
                    case 4:
                        compararlongitud();
                        continue;
                    case 5:
                        unirfrases();
                        continue;
                    case 6:
                        reemplazar();
                        continue;
                    case 7:
                        contiene();
                        continue;
                    case 8:
                        x = true;
                    default:
                        System.out.println("Esa opción no se encuentra disponible");
                }          
        } while (x != true);
         } catch (Exception oo) {
                System.out.println("Esa opción no se encuentra disponible");
            }
        return null;

    }

    public void mostrarvocales() {     
        int contador = 0;
        int nn=getFrase().length();
        setLeng(nn);
        System.out.println(getFrase()+" "+getLeng());
        for (int x = 0;x<getLeng(); x++) {        
            if ((getFrase().substring(0,getLeng()).charAt(x) == 'a') || (getFrase().substring(0,getLeng()).charAt(x) == 'e') || (getFrase().substring(0,getLeng()).charAt(x) == 'i') || (getFrase().substring(0,getLeng()).charAt(x) == 'o') || (getFrase().substring(0,getLeng()).charAt(x) == 'u')) {
                contador++;
            }
        }
            System.out.println("La frase contiene una cantidad de "+contador+" vocales");
    }

    public void invertirfrase() {
        String F;     
        F = getFrase();
        StringBuilder frase = new StringBuilder(F);
        F = frase.reverse().toString();
        System.out.println("La frase a la inversa quedaria de la siguiente manera:");
        System.out.println(F);
    }

    public void vecesrepetido() {
         int nn=getFrase().length();
        setLeng(nn);
        System.out.println(getFrase()+" "+getLeng());
        System.out.println("Ingrese una letra para evaluar cuantas veces se repite:");
        String x = leer.next();
        int cont = 0;        
        int p = getFrase().indexOf(x);
        while (p!=-1){
            cont++;
            p= getFrase().indexOf(x,p+1);
        }   
        System.out.println("La letra se repite un total de " + cont + " veces");
    }

    public void compararlongitud() {
        System.out.println("Ingrese una nueva frase para comparar con la original:");
        String nue = leer.next();
        int L1 = nue.length();
        int L = getLeng();
        if (L > L1) {
            System.out.println("La longitud de la frase original es mayor");
        } else {
            System.out.println("La longitud de la nueva frase es mayor");
        }
    }

    public void unirfrases() {
        System.out.println("Ingrese una frase nueva para unir a la original:");
        String s = leer.next();
        System.out.println("Las frases unidas quedan de la siguiente manera:");
        System.out.println(getFrase() + " " + s);
    }

    public void reemplazar() {
        System.out.println("Ingrese un caracter para reemplazarlo por todas las letras a de la frase:");
        String n = leer.next();
        String F = getFrase();
        String rep = F.replace("a", n);
        System.out.println(rep);
    }

    public void contiene() {
        int nn=getFrase().length();
        setLeng(nn);
        System.out.println("Ingrese una letra para evaluar si esta se encuentra dentro de la frase:");
        String x = leer.next();
        boolean a = false;  
        for (int i = 0; i < getLeng(); i++) {
            if (x.equals(getFrase().substring(0, getLeng()))) {
                a = true;          
            } 
            }
        if (a=true){
        System.out.println("La frase contiene la letra " + x);
        }else System.out.println("La frase no contiene la letra "+ x);
               
    }
}
