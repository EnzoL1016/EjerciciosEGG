/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias;



import estancias.persistencia.ClienteDAO;
import estancias.persistencia.DAO;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DANI
 */
public class tabla extends javax.swing.JFrame {

    /**
     * Creates new form tabla
     */
    public tabla() throws Exception {
        initComponents();      
    }

    void mostrar() throws Exception{
        DAO dao = null;
        DefaultTableModel modelo =  new DefaultTableModel(); 
        ClienteDAO a=new ClienteDAO();
          
        ResultSet rs = dao.getTabla("SELECT clientes.* , casas.id_casa, casas.calle, casas.numero, casas.tipo_vivienda, casas.precio_habitacion "
                    + "FROM clientes "
                    + "INNER JOIN estancias "
                    + "ON estancias.id_cliente = clientes.id_cliente "
                    + "INNER JOIN casas "
                    + "ON casas.id_casa = estancias.id_casa;");
        modelo.setColumnIdentifiers(new Object[]{"ID Cliente","Nombre","Calle","Numero","Codigo Postal","Ciudad", "Pais","Email","ID Casa","Calle","Numero","Tipo Vivienda","Precio Habitacion"});
        try {
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("ID Cliente"),rs.getString("Nombre"),rs.getString("Calle"),rs.getString("Numero"),rs.getString("Codigo Postal"),rs.getString("Ciudad"),rs.getString("Pais"),rs.getString("Email"),rs.getString("ID Casa"),rs.getString("Calle"),rs.getString("Numero"),rs.getString("Tipo Vivienda"),rs.getString("Precio Habitacion")});
            }             
        } catch (Exception e) {
            throw e;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new tabla().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(tabla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
