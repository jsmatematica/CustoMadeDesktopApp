/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BD.Conexion;
import customade2.Entidades.*;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author jsmat
 */
public class PanelInicial extends javax.swing.JFrame {

    /**
     * Creates new form PanelInicial
     */
    public PanelInicial() {
        initComponents();
//        jLabel4.setText("<html><a href='www.google.com'>google</a></html>");
       Refresh();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaPedidos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetalles = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDiseños = new javax.swing.JTable();
        jBotonDiseños = new javax.swing.JButton();

        jComboBox1.setModel(new DefaultComboBoxModel(EstadoPedido.values()));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Fecha Pedido", "Nombre Completo Cliente", "CI Cliente", "Telefono Cliente", "Email Cliente", "Dirección Cliente", "Estado del Pedido", "Precio Total", "Obejto", "Detalle Pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaPedidos.setColumnSelectionAllowed(true);
        jTablaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaPedidos);
        jTablaPedidos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTablaPedidos.getColumnModel().getColumnCount() > 0) {
            jTablaPedidos.getColumnModel().getColumn(9).setMinWidth(0);
            jTablaPedidos.getColumnModel().getColumn(9).setPreferredWidth(0);
            jTablaPedidos.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        jButton1.setText("Actualizar Estado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Precio Unitario", "Objeto"
            }
        ));
        jScrollPane2.setViewportView(jTableDetalles);

        jButton2.setText("Ver Detalles de pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableDiseños.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Diseño", "Precio Unitario", "Imagen"
            }
        ));
        jScrollPane3.setViewportView(jTableDiseños);

        jBotonDiseños.setText("Ver Diseños");
        jBotonDiseños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonDiseñosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBotonDiseños)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonDiseños)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaPedidosMouseClicked
       
    }//GEN-LAST:event_jTablaPedidosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pedido p = (Pedido) jTablaPedidos.getValueAt(jTablaPedidos.getSelectedRow(),9);
        p.setEstado((EstadoPedido) jTablaPedidos.getValueAt(jTablaPedidos.getSelectedRow(),7));
        if (p.getEstado() == EstadoPedido.FINALIZADO) {
            List<DetalleDePedido> detalles = p.getDetalleDePedidos();
            for (Iterator<DetalleDePedido> iterator = detalles.iterator(); iterator.hasNext();) {
                DetalleDePedido next = iterator.next();
                Articulo a = next.getDisneioDelDetalle().getArticulo();
                a.setStock(a.getStock()-next.getCantidad());
                Conexion.getInstance().merge(a);
            }
        }
        Conexion.getInstance().merge(p);
        Refresh();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Pedido p = (Pedido) jTablaPedidos.getValueAt(jTablaPedidos.getSelectedRow(),9);
            List<DetalleDePedido> detalles = p.getDetalleDePedidos();
             DefaultTableModel md2 = (DefaultTableModel) jTableDetalles.getModel();
            for (Iterator<DetalleDePedido> iterator = detalles.iterator(); iterator.hasNext();) {
                DetalleDePedido next = iterator.next();
                Object[] fila = new Object[3];
                fila[0] = next.getCantidad();
                fila[1] = next.getPrecioUnitario();
                fila[2] = next;
                md2.addRow(fila);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBotonDiseñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonDiseñosActionPerformed
        DetalleDePedido p = (DetalleDePedido) jTableDetalles.getValueAt(jTableDetalles.getSelectedRow(),2);
             DefaultTableModel md2 = (DefaultTableModel) jTableDiseños.getModel();
             md2.setRowCount(0);
             Object[] fila = new Object[3];
             fila[0] = p.getDisneioDelDetalle().getNombre();
             fila[1] = p.getDisneioDelDetalle().getPrecioUnitario();
             fila[2] = p.getDisneioDelDetalle();
                md2.addRow(fila);
       
                // TODO add your handling code here:
    }//GEN-LAST:event_jBotonDiseñosActionPerformed

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
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelInicial().setVisible(true);
                
            }
        });
    }
    private void Refresh(){
         TableColumn testColumn = jTablaPedidos.getColumnModel().getColumn(7);
        testColumn.setCellEditor(new DefaultCellEditor(jComboBox1));
        
        Iterator<Pedido> it = Conexion.getInstance().select("FROM Pedido", Pedido.class).iterator();
        DefaultTableModel mdl = (DefaultTableModel) jTablaPedidos.getModel();
        mdl.setRowCount(0);
        while (it.hasNext()) {
            Pedido next = it.next();
            Object[] fila = new Object[11];
            fila[0] = next.getId();
            fila[1] = next.getFecha();
            fila[2] = next.getNombreCompletoCliente();
            fila[3] = next.getTelefonoCliente();
            fila[4] = next.getCiCliente();
            fila[5] = next.getEmailCliente();
            fila[6] = next.getDireccionCLiente();
            fila[7] = next.getEstado();
            fila[8] = next.getPrecioTotal();
            fila[9] = next;
            fila[10] = next.getDetalleDePedidos();
            mdl.addRow(fila);
            
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonDiseños;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablaPedidos;
    private javax.swing.JTable jTableDetalles;
    private javax.swing.JTable jTableDiseños;
    // End of variables declaration//GEN-END:variables
}
