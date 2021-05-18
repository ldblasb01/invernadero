package vista;

/**
 *
 * @author luis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    public Principal() {
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButtonGESEjemplares = new javax.swing.JButton();
        jButtonGESParcelas = new javax.swing.JButton();
        jButtonGESPlantas = new javax.swing.JButton();
        jButtonGESLocalizaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invernaderos Pepe Flores");
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(93, 228, 47));

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel1.setText("INVERNADEROS  PEPE  FLORES");

        jDesktopPane1.setForeground(new java.awt.Color(153, 255, 153));

        jButtonGESEjemplares.setBackground(new java.awt.Color(255, 255, 102));
        jButtonGESEjemplares.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButtonGESEjemplares.setText("EJEMPLARES");
        jButtonGESEjemplares.setToolTipText("EJEMPLARES");
        jButtonGESEjemplares.setAlignmentX(5.0F);
        jButtonGESEjemplares.setAlignmentY(5.0F);
        jButtonGESEjemplares.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 5, true));
        jButtonGESEjemplares.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGESEjemplares.setName(""); // NOI18N
        jButtonGESEjemplares.setPreferredSize(new java.awt.Dimension(157, 71));
        jButtonGESEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGESEjemplaresActionPerformed(evt);
            }
        });

        jButtonGESParcelas.setBackground(new java.awt.Color(255, 153, 153));
        jButtonGESParcelas.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButtonGESParcelas.setText("PARCELAS");
        jButtonGESParcelas.setToolTipText("PARCELAS");
        jButtonGESParcelas.setAlignmentX(5.0F);
        jButtonGESParcelas.setAlignmentY(5.0F);
        jButtonGESParcelas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 102), 5, true));
        jButtonGESParcelas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGESParcelas.setName(""); // NOI18N
        jButtonGESParcelas.setPreferredSize(new java.awt.Dimension(135, 71));
        jButtonGESParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGESParcelasActionPerformed(evt);
            }
        });

        jButtonGESPlantas.setBackground(new java.awt.Color(0, 255, 204));
        jButtonGESPlantas.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButtonGESPlantas.setText("PLANTAS");
        jButtonGESPlantas.setToolTipText("PLANTAS");
        jButtonGESPlantas.setAlignmentX(5.0F);
        jButtonGESPlantas.setAlignmentY(5.0F);
        jButtonGESPlantas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 5, true));
        jButtonGESPlantas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGESPlantas.setName(""); // NOI18N
        jButtonGESPlantas.setPreferredSize(new java.awt.Dimension(127, 71));
        jButtonGESPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGESPlantasActionPerformed(evt);
            }
        });

        jButtonGESLocalizaciones.setBackground(new java.awt.Color(153, 255, 153));
        jButtonGESLocalizaciones.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButtonGESLocalizaciones.setText("LOCALIZACIONES");
        jButtonGESLocalizaciones.setToolTipText("LOCALIZACIONES");
        jButtonGESLocalizaciones.setAlignmentX(5.0F);
        jButtonGESLocalizaciones.setAlignmentY(5.0F);
        jButtonGESLocalizaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 5, true));
        jButtonGESLocalizaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGESLocalizaciones.setName(""); // NOI18N
        jButtonGESLocalizaciones.setPreferredSize(new java.awt.Dimension(197, 71));
        jButtonGESLocalizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGESLocalizacionesActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButtonGESEjemplares, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonGESParcelas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonGESPlantas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonGESLocalizaciones, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGESPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(jButtonGESEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGESParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonGESLocalizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGESPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGESEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGESParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGESLocalizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Invernaderos Pepe Flores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGESPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGESPlantasActionPerformed
        FormGESPlantas gesplantas = new  FormGESPlantas();
        gesplantas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGESPlantasActionPerformed

    private void jButtonGESEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGESEjemplaresActionPerformed
        // TODO add your handling code here:
         FormGESEjemplares gesejemplares = new  FormGESEjemplares();
        gesejemplares.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGESEjemplaresActionPerformed

    private void jButtonGESParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGESParcelasActionPerformed
        // TODO add your handling code here:
        FormGESParcelas gesparcelas = new  FormGESParcelas();
        gesparcelas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGESParcelasActionPerformed

    private void jButtonGESLocalizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGESLocalizacionesActionPerformed
       FormGESLocalizaciones geslocalizaciones = new  FormGESLocalizaciones();
        geslocalizaciones.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGESLocalizacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGESEjemplares;
    private javax.swing.JButton jButtonGESLocalizaciones;
    private javax.swing.JButton jButtonGESParcelas;
    private javax.swing.JButton jButtonGESPlantas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
