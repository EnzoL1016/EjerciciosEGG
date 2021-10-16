package libreria.servicios;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuService {

    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = true;
        int opcion = 0;
        LibroServicios libro = new LibroServicios();
        AutorServicios autor = new AutorServicios();
        EditorialServicios editorial = new EditorialServicios();
        ClienteServicios cliente = new ClienteServicios();
        PrestamoServicios prestamo = new PrestamoServicios();
        while (salir) {
            System.out.println(">---------MENU PRINCIPAL---------<");
            System.out.println("");
            System.out.println(" 1) Menu Libro\n 2) Menu Autor\n 3) Menu Editorial\n 4) Menu Busquedas\n 5) Menu Cliente\n 6) Menu Prestamo\n 7) Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    boolean salirLibro = true;
                    while (salirLibro) {
                        try {
                            System.out.println(">-----MENU LIBRO-----<");
                            System.out.println("");
                            System.out.println("1) Ingresar Libro\n2) Editar Libro\n3) Eliminar Libro\n4) Listar Libros\n5) Regresar al Menu Principal");
                            int opcionMenuLibro = leer.nextInt();
                            leer.nextLine();
                            switch (opcionMenuLibro) {
                                case 1:
                                    libro.IngresarLibro();
                                    break;
                                case 2:
                                    libro.modificarLibro();
                                    break;
                                case 3:
                                    libro.eliminarLibro();
                                    break;
                                case 4:
                                    libro.listarLibros();
                                    break;
                                case 5:
                                    salirLibro = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opción valida");
                                    break;
                            }
                        } catch (Exception ex) {
                            Logger.getLogger(MenuService.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    break;
                case 2:
                    boolean salirAutor = true;
                    while (salirAutor) {
                        try {
                            System.out.println(">-----MENU AUTOR-----<");
                            System.out.println("");
                            System.out.println("1) Ingresar Autor\n2) Editar Autor\n3) Eliminar Autor\n4) Listar Autores\n5) Regresar al Menu Principal");
                            int opcionMenuAutor = leer.nextInt();
                            leer.nextLine();
                            switch (opcionMenuAutor) {
                                case 1:
                                    autor.ingresarAutor();
                                    break;
                                case 2:
                                    autor.modificarAutor();
                                    break;
                                case 3:
                                    autor.eliminarAutor();
                                    break;
                                case 4:
                                    autor.listarAutor();
                                    break;
                                case 5:
                                    salirAutor = false;
                                    break;
                                default:
                                    System.out.println("Ingrese una opción valida");
                                    break;
                            }
                        } catch (Exception ex) {
                            Logger.getLogger(MenuService.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    break;
                case 3:
                    boolean salirEditorial = true;
                    while (salirEditorial) {
                        System.out.println(">-----MENU EDITORIAL-----<");
                        System.out.println("");
                        System.out.println("1) Ingresar Editorial\n2) Editar Editorial\n3) Eliminar Editorial\n4) Listar Editoriales\n5) Regresar al Menu Principal");
                        int opcionMenuEditorial = leer.nextInt();
                        leer.nextLine();

                        switch (opcionMenuEditorial) {
                            case 1:
                                editorial.ingresarEditorial();
                                break;
                            case 2:
                                editorial.modificarEditorial();
                                break;
                            case 3:
                                editorial.eliminarEditorial();
                                break;
                            case 4:
                                editorial.listarEditorial();
                                break;
                            case 5:
                                salirEditorial = false;
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;
                        }
                    }

                    break;
                case 4:
                    boolean salirMenu = true;
                    while (salirMenu) {
                        System.out.println(">-----MENU BUSQUEDAS-----<");
                        System.out.println("");
                        System.out.println("1) Búsqueda de Autor por nombre\n2) Búsquda de Libro por ISBN\n3) Búsqueda de Libro por Título\n4) Búsqueda de Libro/s por Autor\n5) Búsqueda de Libro/s por Editorial\n6) Regresar al Menu Principal");
                        int opcionBusqueda = leer.nextInt();
                        leer.nextLine();
                        switch (opcionBusqueda) {
                            case 1:
                                autor.buscarAutorNombre();
                                break;
                            case 2:
                                libro.buscarLibroISBN();
                                break;
                            case 3:
                                libro.buscarLibroTitulo();
                                break;
                            case 4:
                                libro.buscarLibroPorAutor();
                                break;
                            case 5:
                                libro.buscarLibroEditorial();
                                break;
                            case 6:
                                salirMenu = false;
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;
                        }
                    }
                    break;
                case 5:
                    boolean salirCliente = true;
                    while (salirCliente) {
                        System.out.println(">----MENU CLIENTE----<");
                        System.out.println("");
                        System.out.println("1) Ingresar un Cliente\n2) Eliminar un Cliente\n3) Modificar un cliente\n4) Listar Clientes\n5) Volver al Menu Principal");
                        int op = leer.nextInt();
                        leer.nextLine();
                        switch (op) {
                            case 1:
                                cliente.ingresarCliente();
                                break;
                            case 2:
                                cliente.eliminarCliente();
                                break;
                            case 3:
                                cliente.modificarCliente();
                                break;
                            case 4:
                                cliente.listarCliente();
                                break;
                            case 5:
                                salirCliente = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    }
                    break;
                case 6:
                    boolean salirPrestamo = true;
                    while(salirPrestamo){
                        System.out.println(">-----MENU PRESTAMOS-----<");
                        System.out.println("");
                        System.out.println("1) Pedir un prestamo\n2) Devolver libro\n3) Buscar prestamos por cliente\n4) Listar prestamos\n5) Volver al menu principal");
                        int el = leer.nextInt();leer.nextLine();
                        switch(el){
                            case 1:
                                prestamo.registrarPrestamo();
                                break;
                            case 2:
                                prestamo.devolverLibro();
                                break;
                            case 3:
                                prestamo.buscarprestamoCliente();
                                break;
                            case 4:
                                prestamo.listarPrestamos();
                                break;
                            case 5:
                                salirPrestamo = false;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    }
                    break;
                case 7:
                    salir = false;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        }
    }
}
