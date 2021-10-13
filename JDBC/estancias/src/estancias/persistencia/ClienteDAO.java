package estancias.persistencia;

import estancias.entidades.Casas;
import estancias.entidades.Clientes;
import estancias.entidades.Comentarios;
import estancias.servicios.ClienteService;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends DAO {

    public void GuardarCliente(Clientes cliente) throws Exception {

        try {
            if (cliente == null) {
                throw new Exception("Debe indicar un cliente");
            }
            String sql = "INSERT INTO clientes (id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email)"
                    + "VALUES (" + cliente.getId_cliente() + ", '" + cliente.getNombre() + "', '" + cliente.getCalle() + "', " + cliente.getNumero() + ", '" + cliente.getCodigo_postal() + "', '" + cliente.getCiudad() + "', '" + cliente.getPais() + "', '" + cliente.getEmail() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void ModificarCliente(Clientes cliente) throws Exception {

        try {
            if (cliente == null) {
                throw new Exception("Debe indicar un cliente a modificar");
            }
            String sql = "UPDATE clientes SET"
                    + "nombre = '" + cliente.getNombre() + "' WHERE id_cliente = " + cliente.getId_cliente() + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void EliminarCliente(Clientes cliente) throws Exception {

        try {
            String sql = "DELETE FROM clientes WHERE nombre = '" + cliente.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Object> ListarClientesConEstancia() throws Exception {
        ClienteService c = new ClienteService();
        try {
            String sql = "SELECT clientes.* , comentarios.comentario "
                    + "FROM clientes "
                    + "INNER JOIN estancias "
                    + "ON estancias.id_cliente = clientes.id_cliente "
                    + "INNER JOIN comentarios "
                    + "ON comentarios.id_casa = estancias.id_casa;";

            consultarBase(sql);
            Clientes cliente = null;
            Comentarios coment = null;
            List<Object> lista = new ArrayList();
            while (resultado.next()) {
                cliente = new Clientes();
                coment = new Comentarios();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                coment.setComentario(resultado.getString(9));
                lista.add(cliente);
                lista.add(coment);
            }

            desconectarBase();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
}
