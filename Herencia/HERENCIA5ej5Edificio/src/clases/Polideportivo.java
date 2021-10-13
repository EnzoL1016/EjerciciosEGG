package clases;

public class Polideportivo extends Edificio {

   

    public Polideportivo() {
    }

    public Polideportivo(String techo, double ancho, double alto, double largo) {
        super(ancho, alto, largo,techo);      
    }

    @SuppressWarnings("empty-statement")
    public Edificio crearPolideportivo() {
        System.out.println("Ingrese el largo del Polideportivo: ");
        setLargo(leer.nextDouble());
        System.out.println("Ingrese el ancho del Polideportivo: ");
        setAncho(leer.nextDouble());
        System.out.println("Ingrese la altura del polideportivo: ");
        setAlto(leer.nextDouble());
        int op = 0;
        do {
            System.out.println("El polideportivo será:" + "\n"
                    + "1) Techado" + "\n"
                    + "2) Abierto");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    techo = "Techado";
                    break;
                case 2:
                    techo = "Abierto";
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }                
        }while (op != 1 && op != 2);    
        return new Polideportivo(techo, getAncho(), getAlto(), getLargo());
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Techo: " + techo;
    }
    
}
