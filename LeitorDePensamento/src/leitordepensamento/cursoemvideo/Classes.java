package leitordepensamento.cursoemvideo;

import java.awt.Font;

public class Classes extends javax.swing.JFrame {

    /**
     * Creates new form Classes
     */
    public Classes() { //método construtor 
        initComponents();
        txtResult.setText("advinhe um número de 1 à 5!");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPalpite = new javax.swing.JButton();
        lblValor = new javax.swing.JSpinner();
        txtResult = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leitordepensamento/cursoemvideo/genio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 139, 169));

        jLabel2.setText("Selecione um valor: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 167, 30));

        btnPalpite.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnPalpite.setForeground(new java.awt.Color(121, 125, 209));
        btnPalpite.setText("Enviar Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 178, -1));

        lblValor.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 90, -1));
        getContentPane().add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 190, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leitordepensamento/cursoemvideo/balaofim.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        int palpite = Integer.parseInt(lblValor.getValue().toString());
        double n = 1+ Math.random()*(6-1);
        int valor = (int) n;
        
        String resposta = (palpite==valor)?"você acertou":("<html>você errou, eu pensei em: "+valor+"</html>");
        txtResult.setFont(new Font("Arial Black",Font.PLAIN,14));
        
        txtResult.setText(resposta);
        
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner lblValor;
    private javax.swing.JLabel txtResult;
    // End of variables declaration//GEN-END:variables
}
