/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author alons
 */
public class VProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form VProductos
     */
    public VProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoproducto = new javax.swing.JTextField();
        txtCaracteristicaproducto = new javax.swing.JTextField();
        txtStockprducto = new javax.swing.JTextField();
        jcbxProveedor = new javax.swing.JComboBox<>();
        txtPrecioproducto = new javax.swing.JTextField();
        jcbxMarcas = new javax.swing.JComboBox<>();
        btnRegistrarproducto = new javax.swing.JButton();
        btnConsultaproducto = new javax.swing.JButton();
        btnActualizarproducto = new javax.swing.JButton();
        btnEliminarproducto = new javax.swing.JButton();
        txtIdproducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatosproducto = new javax.swing.JTable();
        jlblRegistrosproducto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 45, 62));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 2, -1, 39));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Caracteristica");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        txtCodigoproducto.setBackground(new java.awt.Color(33, 45, 62));
        txtCodigoproducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCodigoproducto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCodigoproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 160, 30));

        txtCaracteristicaproducto.setBackground(new java.awt.Color(33, 45, 62));
        txtCaracteristicaproducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCaracteristicaproducto.setForeground(new java.awt.Color(255, 255, 255));
        txtCaracteristicaproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaracteristicaproductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCaracteristicaproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 160, 30));

        txtStockprducto.setBackground(new java.awt.Color(33, 45, 62));
        txtStockprducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtStockprducto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtStockprducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 160, 30));

        jPanel1.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 160, 30));

        txtPrecioproducto.setBackground(new java.awt.Color(33, 45, 62));
        txtPrecioproducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPrecioproducto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPrecioproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 160, 30));

        jPanel1.add(jcbxMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 30));

        btnRegistrarproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarproducto.setText("REGISTRAR");
        btnRegistrarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarproductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 111, 30));

        btnConsultaproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultaproducto.setText("CONSULTAR");
        btnConsultaproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaproductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 117, 31));

        btnActualizarproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizarproducto.setText("ACTUALIZAR");
        jPanel1.add(btnActualizarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 31));

        btnEliminarproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminarproducto.setText("ELIMINAR");
        btnEliminarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarproductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 117, 31));

        txtIdproducto.setEditable(false);
        txtIdproducto.setBackground(new java.awt.Color(33, 45, 62));
        txtIdproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdproducto.setForeground(new java.awt.Color(255, 255, 255));
        txtIdproducto.setBorder(null);
        jPanel1.add(txtIdproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 40, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 170, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 170, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 170, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 170, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_click_&_collect_50px.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 42, 360, 600));

        jtblDatosproducto.setBackground(new java.awt.Color(73, 181, 172));
        jtblDatosproducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtblDatosproducto.setForeground(new java.awt.Color(255, 255, 255));
        jtblDatosproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jtblDatosproducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 600, 510));

        jlblRegistrosproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblRegistrosproducto.setForeground(new java.awt.Color(255, 255, 255));
        jlblRegistrosproducto.setText("EL NUMERO DE PRODUCTOS REGISTRADOS ES:");
        getContentPane().add(jlblRegistrosproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 548, 29));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 530, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_people_50px.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCaracteristicaproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaracteristicaproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaracteristicaproductoActionPerformed

    private void btnRegistrarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarproductoActionPerformed

    private void btnConsultaproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaproductoActionPerformed

    private void btnEliminarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarproductoActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VProductos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarproducto;
    public javax.swing.JButton btnConsultaproducto;
    public javax.swing.JButton btnEliminarproducto;
    public javax.swing.JButton btnRegistrarproducto;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JComboBox<String> jcbxMarcas;
    public javax.swing.JComboBox<String> jcbxProveedor;
    public javax.swing.JLabel jlblRegistrosproducto;
    public javax.swing.JTable jtblDatosproducto;
    public javax.swing.JTextField txtCaracteristicaproducto;
    public javax.swing.JTextField txtCodigoproducto;
    public javax.swing.JTextField txtIdproducto;
    public javax.swing.JTextField txtPrecioproducto;
    public javax.swing.JTextField txtStockprducto;
    // End of variables declaration//GEN-END:variables

    public void txtPrecioproducto(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}