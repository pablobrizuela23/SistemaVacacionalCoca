/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavacacionalcoca;

/**
 *
 * @author Usuario
 */
public class Licencia extends javax.swing.JFrame {

    /**
     * Creates new form Licencia
     */
    PantallaBienvenida pbienvenida = new PantallaBienvenida();
    String nom = "";
    public Licencia() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        nom = pbienvenida.nombreUsuario;//acceso al atributo nombre de la ventana bienvenida
        jChAcepto.setText("Yo "+nom+" Acepto");
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCondiciones = new javax.swing.JTextArea();
        jChAcepto = new javax.swing.JCheckBox();
        jBContinuar = new javax.swing.JButton();
        jBNoAcepto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Licencia de uso");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("TERMINOS Y CONDICIONES");

        jTCondiciones.setEditable(false);
        jTCondiciones.setColumns(20);
        jTCondiciones.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTCondiciones.setRows(5);
        jTCondiciones.setText("Si alguno de tus contenidos (1) incumple estos términos, o bien las políticas \no los términos adicionales específicos de los servicios; (2) infringe la \nlegislación aplicable; o (3) podría dañar a nuestros usuarios, a terceros , nos reservamos \nel derecho de retirar parte o la totalidad de dicho contenido de acuerdo con la legislación\naplicable. Algunos ejemplos son: el contenido que facilita el tráfico de personas o el acoso,\nel contenido de carácter terrorista, y el contenido que infringe los \nderechos de propiedad intelectual. probando merge!!!");
        jScrollPane1.setViewportView(jTCondiciones);

        jChAcepto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jChAceptoStateChanged(evt);
            }
        });
        jChAcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChAceptoActionPerformed(evt);
            }
        });

        jBContinuar.setText("Continuar");
        jBContinuar.setEnabled(false);
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jBNoAcepto.setText("No acepto");
        jBNoAcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNoAceptoActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemavacacionalcoca/coca-cola.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jChAcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(393, 393, 393))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBContinuar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBNoAcepto)
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jChAcepto)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBContinuar)
                                    .addComponent(jBNoAcepto)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jChAceptoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jChAceptoStateChanged
        // TODO add your handling code here:
        if (jChAcepto.isSelected()) {
            jBContinuar.setEnabled(true);
            jBNoAcepto.setEnabled(false);
        }else{
            jBContinuar.setEnabled(false);
            jBNoAcepto.setEnabled(true);
        }
    }//GEN-LAST:event_jChAceptoStateChanged

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        // TODO add your handling code here:
        PantallaPrincipal pPrincipal = new PantallaPrincipal();
        pPrincipal.setVisible(true);//hace visible la ventana principal
        this.dispose();// cierra la ventana actual
    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jBNoAceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNoAceptoActionPerformed
        // TODO add your handling code here:
        PantallaBienvenida pb = new PantallaBienvenida();
        pb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBNoAceptoActionPerformed

    private void jChAceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChAceptoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jChAceptoActionPerformed

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
            java.util.logging.Logger.getLogger(Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Licencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBNoAcepto;
    private javax.swing.JCheckBox jChAcepto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTCondiciones;
    // End of variables declaration//GEN-END:variables
}
