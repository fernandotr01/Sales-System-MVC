package Vista;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    public VPrincipal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("SISTEMA DE VENTAS - MOBTECH");
        this.setSize(new Dimension(1400, 850));
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icons8_administrative_tools_50px_1.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevaventa = new javax.swing.JButton();
        btnClientesmain = new javax.swing.JButton();
        btnProveedormain = new javax.swing.JButton();
        btnMarcasmain = new javax.swing.JButton();
        btnProductosmain = new javax.swing.JButton();
        btnUsuariosmain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpanelContenedor = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 45, 62));
        jLabel1.setText("BIENVENIDO AL SISTEMA DE VENTAS DE MOBTECH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevaventa.setBackground(new java.awt.Color(33, 45, 62));
        btnNuevaventa.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnNuevaventa.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaventa.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_shopify_50px_1.png")); // NOI18N
        btnNuevaventa.setText(" NUEVA VENTA");
        btnNuevaventa.setBorder(null);
        btnNuevaventa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnClientesmain.setBackground(new java.awt.Color(33, 45, 62));
        btnClientesmain.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnClientesmain.setForeground(new java.awt.Color(255, 255, 255));
        btnClientesmain.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_management_50px_1.png")); // NOI18N
        btnClientesmain.setText("  CLIENTES");
        btnClientesmain.setToolTipText("");
        btnClientesmain.setActionCommand("CLIENTES");
        btnClientesmain.setBorder(null);
        btnClientesmain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientesmain.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnProveedormain.setBackground(new java.awt.Color(33, 45, 62));
        btnProveedormain.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnProveedormain.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedormain.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_trolley_50px.png")); // NOI18N
        btnProveedormain.setText("  PROVEEDOR");
        btnProveedormain.setBorder(null);
        btnProveedormain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProveedormain.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnMarcasmain.setBackground(new java.awt.Color(33, 45, 62));
        btnMarcasmain.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnMarcasmain.setForeground(new java.awt.Color(255, 255, 255));
        btnMarcasmain.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_xiaomi_50px.png")); // NOI18N
        btnMarcasmain.setText("  MARCAS");
        btnMarcasmain.setBorder(null);
        btnMarcasmain.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnProductosmain.setBackground(new java.awt.Color(33, 45, 62));
        btnProductosmain.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnProductosmain.setForeground(new java.awt.Color(255, 255, 255));
        btnProductosmain.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_iphone_50px_1.png")); // NOI18N
        btnProductosmain.setText(" PRODUCTOS");
        btnProductosmain.setBorder(null);
        btnProductosmain.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnUsuariosmain.setBackground(new java.awt.Color(33, 45, 62));
        btnUsuariosmain.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnUsuariosmain.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuariosmain.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_user_shield_50px.png")); // NOI18N
        btnUsuariosmain.setText("ADM. USUARIOS");
        btnUsuariosmain.setBorder(null);
        btnUsuariosmain.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("GESTION DEL SISTEMA");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alons\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\Imagenes\\icons8_administrative_tools_50px_1.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuariosmain, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnProductosmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMarcasmain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClientesmain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProveedormain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevaventa, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(118, 118, 118))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(btnNuevaventa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnClientesmain, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnProveedormain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnMarcasmain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnProductosmain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnUsuariosmain, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jpanelContenedor.setBackground(new java.awt.Color(33, 45, 62));

        javax.swing.GroupLayout jpanelContenedorLayout = new javax.swing.GroupLayout(jpanelContenedor);
        jpanelContenedor.setLayout(jpanelContenedorLayout);
        jpanelContenedorLayout.setHorizontalGroup(
            jpanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        jpanelContenedorLayout.setVerticalGroup(
            jpanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelContenedor))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelContenedor)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//
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
//            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClientesmain;
    public javax.swing.JButton btnMarcasmain;
    public javax.swing.JButton btnNuevaventa;
    public javax.swing.JButton btnProductosmain;
    public javax.swing.JButton btnProveedormain;
    public javax.swing.JButton btnUsuariosmain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JDesktopPane jpanelContenedor;
    // End of variables declaration//GEN-END:variables
}
