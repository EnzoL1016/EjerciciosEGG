package libreria.servicios;


import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static javafx.application.Platform.exit;
import static libreria.entidades.Autor.espacios;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

public class PrestamoServicios {

 
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ServicioGeneral sg = new ServicioGeneral();
    LibroServicios ls = new LibroServicios();
    ClienteServicios cs = new ClienteServicios();

    public void registrarPrestamo() {

        Prestamo prestamo = new Prestamo();
        Libro libro = new Libro();
        Cliente cliente = new Cliente();
        System.out.println("A continuacion ingrese los datos necesarios para registrar el prestamo: ");       
        Date fechaPrestamo = new Date();
        System.out.println("Se tomara la fecha de hoy como la fecha del prestamo ("+fechaPrestamo.toString()+")");
        prestamo.setFechaPrestamo(fechaPrestamo);
        System.out.println("El libro debera devolverse en un plazo de 2 meses");
        Calendar ss = aniadirMeses(fechaPrestamo,2);
        Date fechaDevolucion = ss.getTime();
        prestamo.setFechaDevolucion(fechaDevolucion);
        System.out.println("Elije el libro que desea llevar: ");
        ls.listarLibross();
        int opcion = leer.nextInt();leer.nextLine();
        libro = ls.buscarLibroID(opcion);
        if (libro.getEjemplaresRestantes() <= 0) {
            System.out.println("Lo sentimos, no hay libros disponibles de este titulo");
            System.out.println("");
            System.out.println("¿Desea elegir otro? s/n");
            String rr = leer.next().toUpperCase();
            if (rr.equals("S")) {
                ls.listarLibross();
                opcion = leer.nextInt();leer.nextLine();
                libro = ls.buscarLibroID(opcion);
            }
            if(rr.equals("N")){
                System.out.println("Sentimos las molestias, vuelva pronto");
                exit();
            }
        }       
        prestamo.setLibro(libro);
        System.out.println("Puede checar la lista de clientes para ver si ya se encuentra registrado, en caso que no lo esté presione 0 para registrarse: ");
        cs.listarCliente();
        int opp = leer.nextInt();leer.nextLine();
        if(opp == 0){
        boolean x = false;
        do {
            System.out.print("Ingrese el numero de documento: ");
            long doc = leer.nextLong();
            String docc = String.valueOf(doc);
            if (docc.length() == 8) {
                cliente.setDocumento(doc);
                x = true;
            } else {
                System.out.println("El documento ingresado es incorrecto, vuelva a intentarlo");
            }
        } while (x = false);
        System.out.print("Ingrese el nombre: ");
        cliente.setNombre(leer.next());
        System.out.print("Ingrese el apellido: ");
        cliente.setApellido(leer.next());
        System.out.print("Ingrese el numero de telefono: ");
        cliente.setTelefono(leer.next());
        sg.ingresarEntidad(cliente);
        prestamo.setCliente(cliente);
        }else {
            cliente = cs.buscarClienteID(opp);
            prestamo.setCliente(cliente);          
        }
        sg.ingresarEntidad(prestamo);
        System.out.println("Prestamo ingresado correctamente!");
    }

    
public static Calendar aniadirMeses(Date fecha, int mesesParaAniadir) {
        try {
            Calendar c1 = Calendar.getInstance();
            c1.setTime(fecha);
            System.out.println("--> " + c1.getTime());
            c1.add(Calendar.MONTH, mesesParaAniadir);
            System.out.println("--> + " + c1.getTime());
            return c1;
        } catch (Exception e) {
            return null;
        }
    }
    public void modificarPrestamo() {

        System.out.println("Indique su prestamo para modificarlo: ");
        listarPrestamo();
        int opcion = leer.nextInt();
        Prestamo prestamo = buscarprestamoID(opcion);
        System.out.println("¿Quiere extender la fecha del prestamo 1 mes mas? s/n");
        String res = leer.next().toUpperCase();
        if (res.equals("S")) {
            Calendar ext = aniadirMeses(prestamo.getFechaDevolucion(),1);
            Date extension = ext.getTime();
            prestamo.setFechaDevolucion(extension);
            System.out.println("Bien, su prestamo ahora expira el " + prestamo.getFechaDevolucion().toString());
        }
        System.out.println("¿Quiere cambiar el libro? s/n");
        String ress = leer.next().toUpperCase();
        if (ress.equals("S")) {
            System.out.println("Elije el nuevo libro: ");
            ls.listarLibross();
            int op = leer.nextInt();
            Libro libro = ls.buscarLibroID(op);
            prestamo.setLibro(libro);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
        }
        sg.actualizarEntidad(prestamo);
    }

    public void devolverLibro() {

        System.out.println("Indique el prestamo a su nombre: ");
        listarPrestamo();
        int op = leer.nextInt();
        String sql = "Select a FROM Prestamo a WHERE a.id = "+op;
        Prestamo prestamo = (Prestamo) sg.listarEntidad(sql);        
        System.out.println("¿Quiere devolver el libro? s/n");
        String res = leer.next().toUpperCase();
        if (res.equals("S")) {
            Libro libro = prestamo.getLibro();
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
            System.out.println("Muchas gracias!");
            prestamo.setLibro(null);
            prestamo.setCliente(null);
            sg.eliminarEntidad(prestamo);
        }
        if (res.equals("N")) {
            System.out.println("Bien, su prestamo expira el " + prestamo.getFechaDevolucion().toString());
        }
    }

    public void eliminarPrestamo() {
        System.out.println("Ingrese el prestamo que desea eliminar: ");
        listarPrestamo();
        int id = leer.nextInt();
        String sql = "Select a FROM Prestamo a WHERE a.id = " + id;
        Prestamo prestamo = (Prestamo) sg.listarEntidad(sql);
        if (prestamo == null) {
            System.out.println("No hay prestamos para dar de baja");
        } else {
            sg.actualizarEntidad(prestamo);
        }
    }

    public void listarPrestamo() {
        String sql = "Select a FROM Prestamo a";
        List<Prestamo> list = sg.listarEntidades(sql);
        if (list.isEmpty()) {
            System.out.println("No hay prestamos para mostrar");
        } else {
            for (Prestamo a : list) {
                System.out.println(a.getId() + ")Prestamo a nombre de: " + a.getCliente().getNombre() + " " + a.getCliente().getApellido());
            }
        }
    }
    
     public void listarPrestamos() {
        String sql = "Select a FROM Prestamo a";
        List<Prestamo> list = sg.listarEntidades(sql);
        if (list.isEmpty()) {
            System.out.println("No hay prestamos para mostrar");
        } else {
            System.out.println("Nombre:"+"\t\t"+espacios("Apellido:")+espacios("Fecha Prestamo:")+espacios("Fecha Devolucion:")+espacios("Libro:"));
            for (Prestamo a : list) {
                System.out.println(a.getCliente().getNombre()+"\t\t"+espacios(a.getCliente().getApellido())+espacios(a.getFechaPrestamo().toString())+espacios(a.getFechaDevolucion().toString())+espacios(a.getLibro().getTitulo()));
            }
        }
    }

    public Prestamo buscarprestamoID(int id) {
        String sql = "Select a FROM Prestamo a WHERE a.id = " + id;
        Prestamo prestamo = (Prestamo) sg.listarEntidad(sql);
        return prestamo;
    }
    
    public void buscarprestamoCliente(){   
        System.out.println("Seleccione el cliente del cual desea obtener su prestamo: ");
        listarClienteconPrestamos();
        int ele = leer.nextInt();
        Prestamo prestamo = buscarprestamoID(ele);
        System.out.println(prestamo.getId()+") Nombre y Apellido: "+prestamo.getCliente().getNombre()+" "+prestamo.getCliente().getApellido()+"\n"
                +"Fecha Prestamo: "+prestamo.getFechaPrestamo().toString()+"\n"
                +"Fecha Devolución: "+prestamo.getFechaDevolucion().toString()+"\n"
                +"Libro: "+prestamo.getLibro().getTitulo());
    }
    
    public void listarClienteconPrestamos(){
        String sql = "SELECT a.Cliente FROM Prestamo a";
        List <Prestamo> list = sg.listarEntidades(sql);
        if(list.isEmpty()){
            System.out.println("No hay prestamos para mostrar");
        }else{
            for (Prestamo p : list) {
                System.out.println(p.getId()+") Nombre y Apellido: "+p.getCliente().getNombre()+" "+p.getCliente().getApellido());
            }                  
        }
        
    }
}
