/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author alons
 */
public class VMarcas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VMarcas
     */
    public VMarcas() {
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
        txtCodigomarca = new javax.swing.JTextField();
        txtNombremarca = new javax.swing.JTextField();
        txtDescripcionmarca = new javax.swing.JTextField();
        btnRegistrarmarca = new javax.swing.JButton();
        btnConsultarmarca = new javax.swing.JButton();
        btnActualizarmarca = new javax.swing.JButton();
        btnEliminarmarca = new javax.swing.JButton();
        txtIdmarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatosmarca = new javax.swing.JTable();
        jlblRegistrosmarca = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 45, 62));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Marcas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtCodigomarca.setBackground(new java.awt.Color(33, 45, 62));
        txtCodigomarca.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCodigomarca.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCodigomarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        txtNombremarca.setBackground(new java.awt.Color(33, 45, 62));
        txtNombremarca.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombremarca.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombremarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, 30));

        txtDescripcionmarca.setBackground(new java.awt.Color(33, 45, 62));
        txtDescripcionmarca.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtDescripcionmarca.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDescripcionmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 160, 30));

        btnRegistrarmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarmarca.setText("REGISTRAR");
        jPanel1.add(btnRegistrarmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 30));

        btnConsultarmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultarmarca.setText("CONSULTAR");
        btnConsultarmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarmarcaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 120, 30));

        btnActualizarmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizarmarca.setText("ACTUALIZAR");
        jPanel1.add(btnActualizarmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 30));

        btnEliminarmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminarmarca.setText("ELIMINAR");
        jPanel1.add(btnEliminarmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 120, 30));

        txtIdmarca.setEditable(false);
        txtIdmarca.setBackground(new java.awt.Color(33, 45, 62));
        txtIdmarca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtIdmarca.setForeground(new java.awt.Color(255, 255, 255));
        txtIdmarca.setBorder(null);
        jPanel1.add(txtIdmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_apple_logo_50px_4.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_android_50px.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 50, 70));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 160, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 450));

        jtblDatosmarca.setBackground(new java.awt.Color(73, 181, 172));
        jtblDatosmarca.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtblDatosmarca.setForeground(new java.awt.Color(255, 255, 255));
        jtblDatosmarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblDatosmarca);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 130, 600, 450));

        jlblRegistrosmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblRegistrosmarca.setForeground(new java.awt.Color(255, 255, 255));
        jlblRegistrosmarca.setText("NUMERO DE MARCAS REGISTRADAS:");
        getContentPane().add(jlblRegistrosmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 490, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 650, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_people_50px.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarmarcaActionPerformed

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
//            java.util.logging.Logger.getLogger(VMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VMarcas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarmarca;
    public javax.swing.JButton btnConsultarmarca;
    public javax.swing.JButton btnEliminarmarca;
    public javax.swing.JButton btnRegistrarmarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel jlblRegistrosmarca;
    public javax.swing.JTable jtblDatosmarca;
    public javax.swing.JTextField txtCodigomarca;
    public javax.swing.JTextField txtDescripcionmarca;
    public javax.swing.JTextField txtIdmarca;
    public javax.swing.JTextField txtNombremarca;
    // End of variables declaration//GEN-END:variables
}