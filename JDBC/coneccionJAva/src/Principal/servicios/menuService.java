package Principal.servicios;

import java.util.Scanner;

public class menuService {

    public void Menu() throws Exception {
        try {
            Scanner leer = new Scanner(System.in);
            productoService producto = new productoService();
            fabricanteService fabricante = new fabricanteService();
            int opcion = 0;
            boolean salir = true;
            while (salir) {
                System.out.println("--------------MENU--------------");
                System.out.println("1) Listar nombre de productos\n2) Listar nombre y precio de productos\n3) Listar productos cuyo precio esta entre $120 y $202\n4) Listar portatiles\n5) Nombre y precio del producto mas barato\n6) Ingresar producto\n7) Ingresar fabricante\n8) Editar producto\n9) Salir");
                opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion) {
                    case 1:
                        producto.listarNombreProductos();
                        break;
                    case 2:
                        producto.listarNombrePrecioProductos();
                        break;
                    case 3:
                        producto.listarRangoPrecios();
                        break;
                    case 4:
                        producto.listarPortatil();
                        break;
                    case 5:
                        producto.listarProductoBarato();
                        break;
                    case 6:
                        producto.cargarProducto();
                        break;
                    case 7:
                        fabricante.cargarFabricante();
                        break;
                    case 8:
                        producto.modificarProducto();
                        break;
                    case 9:
                        salir = false;
                        break;
                    default:
                        System.out.println("Elija una opción valida");
                        break;
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
