package ejercicio8ectrapass;

import java.util.Scanner;

public class Pass {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String pass;
    private String nombre = "Enzo";
    private int dni = 43732208;

    public Pass() {
    }

    public Pass(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = "Enzo";
        this.dni = 43732208;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void crearpass() {
        boolean x = false;
        do {
            System.out.println("A continuacion ingrese una contraseña para su cuenta (10 caracteres): ");
            String clav = leer.next();
            if (clav.length() == 10) {
                System.out.println("La contraseña es correcta.");
                x = true;
                setPass(clav);
                analizarpass();
            } else {
                System.out.println("La contraseña no cumple con los requisitos.");
            }
        } while (!x);
        System.out.println("Ha ingresado correctamente la contraseña, ahora tiene acceso al menu de opciones: ");
        menuopciones();
    }

    public void analizarpass() {
        int zz=0 ;
        int posicion = getPass().indexOf("a");
        while(posicion!=-1){
            zz++;
            posicion = getPass().indexOf("a",posicion+1);
        }
        if(zz>=2 && getPass().contains("z") == true ){
            System.out.println("La contraseña es de nivel ALTO.");
        }else if(getPass().contains("z") == true){
            System.out.println("La contraseña es de nivel MEDIO.");
        }else if (getPass().contains("z") == false){
            System.out.println("La contraseña es de nivel BAJO.");
        } 
    }

    public void menuopciones() {
      
        boolean m = false;
        do{
            System.out.println("¿Que desea hacer?" + "\n" + "1) Ingresar la contraseña" + "\n" + "2) Comprobar nivel de la contraseña" + "\n" + "3) Modificar Contraseña" + "\n" + "4) Modificar Nombre" + "\n" + "5) Modificar DNI" + "\n" + "6) Salir");
              int o = leer.nextInt();
        switch (o) {
            case 1:
                ingresarclave();
                continue;
            case 2:
                analizarpass();
                continue;
            case 3:          
           modificarclave();
           continue;
            case 4:            
               modificarnombre();
               continue;
            case 5:              
               modificardni();
              continue;
            case 6:
                m=true;
                       
        }
        }while(!m);
    }

    public boolean ingresarclave() {
        System.out.println("Ingrese la contraseña actual: ");
        String clave = leer.next();
        if (clave.equals(getPass())) {
            System.out.println("La contraseña es correcta.");
            return true;
        } else {
            System.out.println("La contraseña es incorrecta.");
        }
        return false;
    }

    public void modificarclave() {
        boolean z = false;
        do {
            if (ingresarclave() == true) {
                System.out.println("Ingrese la nueva contraseña: ");
                String nuev = leer.next();
                if (nuev.length() == 10) {
                    System.out.println("La contraseña es correcta.");
                    z = true;
                    setPass(nuev);
                } else {
                    System.out.println("La contraseña no cumple con los requisitos.");
                }
            } else {
                System.out.println("La contraseña es incorrecta.");
            }
        } while (!z);
    }

    public void modificarnombre() {
        if (ingresarclave() == true) {
            System.out.println("El nombre de su cuenta es: "+getNombre());
            System.out.println("Ingrese el nuevo nombre de la cuenta: ");
            String name = leer.next();
            setNombre(name);
            System.out.println("El nombre de su cuenta se ha cambiado a "+getNombre());           
        } else {
            System.out.println("La contraseña es incorrecta.");
        }     
    }

    public void modificardni() {
        System.out.println("Su dni actual es: "+getDni() );
        if (ingresarclave() == true) {
            System.out.println("Ingrese el nuevo DNI de la cuenta: ");
            int dn = leer.nextInt();
            if(dn>=10000000 && dn<=99999999){
            setDni(dn);
            System.out.println("Se ha cambiado el DNI de la cuenta a "+getDni());
            }else System.out.println("El DNI ingresado es incorrecto.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }
    }
}
