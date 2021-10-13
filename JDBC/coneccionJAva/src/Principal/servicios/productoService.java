package Principal.servicios;

import Principal.entidades.Producto;
import Principal.persistencia.productoDAO;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class productoService {

    private productoDAO dao;

    public productoService() {
        this.dao = new productoDAO();
    }

    public void crearProducto(Integer codigo, String nombre, Double precio, Integer CodigoFabricante) throws Exception {

        try {
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (precio == null) {
                throw new Exception("Debe indicar el precio");
            }
            if (CodigoFabricante == null) {
                throw new Exception("Debe indicar el codigo del fabricante");
            }
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(CodigoFabricante);
            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void listarNombrePrecioProductos() throws Exception {
        productoDAO dao = new productoDAO();
        try {
            List<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println(espacios("Nombre Producto:") + espacios("Precio:"));
                for (Producto aux : productos) {
                    System.out.println(espacios(aux.getNombre()) + "$ " + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public void listarNombreProductos() throws Exception {
        productoDAO dao = new productoDAO();
        try {
            List<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Nombre Producto: ");
                for (Producto aux : productos) {
                    System.out.println(aux.getNombre());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public void listarCodigoNombreProductos() throws Exception {
        productoDAO dao = new productoDAO();
        try {
            List<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Código:\t\t" + espacios("Nombre:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo() + "\t\t" + aux.getNombre());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            
        }
    }

    public void imprimirProductos() throws Exception {

        try {
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarRangoPrecios() throws Exception {
        productoDAO dao = new productoDAO();
        try {
            List<Producto> productos = dao.listarRangoPrecios();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Codigo:\t\t" + espacios("Nombre Producto:") + espacios("Precio:") + espacios("Codigo Fabricante:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo() + "\t\t" + espacios(aux.getNombre()) + "$ " + espacios(String.valueOf(aux.getPrecio())) + espacios(String.valueOf(aux.getCodigoFabricante())));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public void listarPortatil() throws Exception {
        productoDAO dao = new productoDAO();
        try {
            List<Producto> productos = dao.listarPortatil();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Codigo:\t\t" + espacios("Nombre Producto:") + espacios("Precio:") + espacios("Codigo Fabricante:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo() + "\t\t" + espacios(aux.getNombre()) + "$ " + espacios(String.valueOf(aux.getPrecio())) + espacios(String.valueOf(aux.getCodigoFabricante())));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public void listarProductoBarato() throws Exception {
        productoDAO dao = new productoDAO();
        try {
            List<Producto> productos = dao.listarProductoBarato();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Codigo:\t\t" + espacios("Nombre Producto:") + espacios("Precio:") + espacios("Codigo Fabricante:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo() + "\t\t" + espacios(aux.getNombre()) + "$ " + espacios(String.valueOf(aux.getPrecio())) + espacios(String.valueOf(aux.getCodigoFabricante())));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public void cargarProducto() throws Exception {
        productoDAO dao = new productoDAO();
        fabricanteService fabricante = new fabricanteService();
        Scanner leer = new Scanner(System.in);
        Producto nuevoProducto = new Producto();
        System.out.println("Ingrese el nombre del producto:");
        nuevoProducto.setNombre(leer.nextLine());
        System.out.println("Ingrese el precio del producto:");
        nuevoProducto.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el código del fabricante: ");
        fabricante.listarFabricantes();
        nuevoProducto.setCodigoFabricante(leer.nextInt());
        leer.nextLine();
        dao.guardarProducto(nuevoProducto);
        System.out.println("Producto Cargado con éxito!!!");
    }

    public void modificarProducto() throws Exception {
        productoDAO dao = new productoDAO();
        fabricanteService fabricante = new fabricanteService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el codigo del producto a modificar:");
        listarCodigoNombreProductos();
        Producto nuevoProducto = dao.buscarProductoPorId(sc.nextInt());
        sc.nextLine();
        System.out.println("Desea modificar el nombre? y/n");
        String opcion = sc.nextLine().toUpperCase();
        if (opcion.equals("Y")) {
            System.out.println("Ingrese el nuevo nombre:");
            nuevoProducto.setNombre(sc.nextLine());
        }
        System.out.println("Desea modificar el precio? y/n");
        opcion = sc.nextLine().toUpperCase();
        if (opcion.equals("Y")) {
            System.out.println("Ingrese el nuevo precio:");
            nuevoProducto.setPrecio(sc.nextDouble());
        }
        System.out.println("Desea modificar el codigo del fabricante? y/n");
        opcion = sc.nextLine().toUpperCase();
        if (opcion.equals("Y")) {
            System.out.println("Elija el codigo del fabricante:");
            fabricante.listarFabricantes();
            nuevoProducto.setCodigoFabricante(sc.nextInt());
            sc.nextLine();
        }
        dao.modificarProducto(nuevoProducto);

    }

    public static String espacios(String cadena) {
        int cantEspacios = 40 - cadena.length();
        for (int i = 0; i < cantEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }
}
