package cursoemvideo;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class TelaRelogio extends javax.swing.JFrame {

    public TelaRelogio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMensage = new javax.swing.JLabel();
        btnHora = new javax.swing.JButton();
        lblIdioma = new javax.swing.JLabel();
        lblResolucao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cursoemvideo/java.png"))); // NOI18N

        lblMensage.setBackground(new java.awt.Color(139, 173, 207));
        lblMensage.setFont(new java.awt.Font("Rasa SemiBold", 1, 36)); // NOI18N
        lblMensage.setText("Data e Horas atuais ");

        btnHora.setFont(new java.awt.Font("TlwgTypewriter", 3, 24)); // NOI18N
        btnHora.setForeground(new java.awt.Color(116, 134, 175));
        btnHora.setText("Clique aqui");
        btnHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraActionPerformed(evt);
            }
        });

        lblIdioma.setBackground(new java.awt.Color(139, 173, 207));
        lblIdioma.setFont(new java.awt.Font("Rasa SemiBold", 1, 36)); // NOI18N
        lblIdioma.setText(" Idioma do sitema ");

        lblResolucao.setBackground(new java.awt.Color(139, 173, 207));
        lblResolucao.setFont(new java.awt.Font("Rasa SemiBold", 1, 36)); // NOI18N
        lblResolucao.setText("Resolução da tela ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnHora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResolucao)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblMensage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMensage)
                .addGap(31, 31, 31)
                .addComponent(lblIdioma)
                .addGap(33, 33, 33)
                .addComponent(lblResolucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHora)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraActionPerformed
        Date relogio = new Date();
        lblMensage.setText(relogio.toString());
        Locale idioma = Locale.getDefault();
        lblIdioma.setText(idioma.toString());
        Dimension tamanhotela = Toolkit.getDefaultToolkit().getScreenSize();
        String tamanho = "Altura: " + String.valueOf(tamanhotela.height) + " Largura: " + String.valueOf(tamanhotela.width);
        lblResolucao.setText(tamanho);
    }//GEN-LAST:event_btnHoraActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelogio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblMensage;
    private javax.swing.JLabel lblResolucao;
    // End of variables declaration//GEN-END:variables
}
