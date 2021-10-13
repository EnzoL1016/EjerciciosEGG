package Principal.servicios;

import Principal.entidades.Fabricante;
import Principal.persistencia.fabricanteDAO;
import java.util.Collection;
import java.util.Scanner;

public class fabricanteService {

    private fabricanteDAO dao;

    public fabricanteService() {
        this.dao = new fabricanteDAO();
    }

    public void crearFabricante(Integer codigo, String nombre) throws Exception {

        try {
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            Fabricante fabricante = new Fabricante();
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Integer codigoActual, Integer codigoNuevo, String nombre) throws Exception {

        try {
            if (codigoActual == null) {
                throw new Exception("Debe indicar el codigo");
            }
            if (codigoNuevo == null) {
                throw new Exception("Debe indicar el codigo nuevo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            Fabricante fabricante = buscarFabricantePorNombre(nombre);

            if (fabricante.getCodigo().equals(codigoNuevo)) {
                throw new Exception("El codigo indicado no es el registrado en el sistema para el nombre indicado");
            }
            fabricante.setCodigo(codigoNuevo);
            dao.modificarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {

        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            Fabricante fabricante = dao.buscarFabricantePorNombre(nombre);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {

        try {

            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }
            Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {
            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirFabricantes() throws Exception {

        try {
            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            if (fabricantes.isEmpty()) {
                throw new Exception("No hay Fabricantes para imprimir");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void cargarFabricante() throws Exception {
        fabricanteDAO dao = new fabricanteDAO();

        Scanner leer = new Scanner(System.in);
        Fabricante nuevoFabricante = new Fabricante();
        System.out.println("Ingrese el nombre del Fabricante:");
        nuevoFabricante.setNombre(leer.nextLine());
        dao.guardarFabricante(nuevoFabricante);
        System.out.println("Fabricante Cargado con éxito");

    }
}
