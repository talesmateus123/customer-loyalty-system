/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package InterfaceGrafica;
import Modelo.Usuario;
public class FormNovoUsuario extends javax.swing.JDialog {
    public FormNovoUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.setTitle("Cadastrar usuário");
        setVisible(true);        
    }
    public Usuario getUsuario(){
        return this.usuario;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelUsuario = new javax.swing.JPanel();
        jLbNome = new javax.swing.JLabel();
        jLbIdade = new javax.swing.JLabel();
        jLbDtNasc = new javax.swing.JLabel();
        jLbLogin = new javax.swing.JLabel();
        jLbSenha = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jTxtFNome = new javax.swing.JTextField();
        jTxtFIdade = new javax.swing.JTextField();
        jTxtFDia = new javax.swing.JTextField();
        jTxtFMes = new javax.swing.JTextField();
        jTxtFAno = new javax.swing.JTextField();
        jTxtFLogin = new javax.swing.JTextField();
        jTxtFSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        painelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLbNome.setText("Nome:");

        jLbIdade.setText("Idade");

        jLbDtNasc.setText("Data de nascimento");

        jLbLogin.setText("Login");

        jLbSenha.setText("Senha");

        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jTxtFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFNomeActionPerformed(evt);
            }
        });

        jTxtFIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFIdadeActionPerformed(evt);
            }
        });

        jTxtFDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFDiaActionPerformed(evt);
            }
        });

        jTxtFMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFMesActionPerformed(evt);
            }
        });

        jTxtFAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFAnoActionPerformed(evt);
            }
        });

        jTxtFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFLoginActionPerformed(evt);
            }
        });

        jTxtFSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelUsuarioLayout = new javax.swing.GroupLayout(painelUsuario);
        painelUsuario.setLayout(painelUsuarioLayout);
        painelUsuarioLayout.setHorizontalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLbDtNasc)
                    .addComponent(jLbIdade)
                    .addComponent(jLbNome)
                    .addComponent(jLbLogin))
                .addGap(18, 18, 18)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelUsuarioLayout.createSequentialGroup()
                        .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelUsuarioLayout.createSequentialGroup()
                                .addComponent(jTxtFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelUsuarioLayout.createSequentialGroup()
                                .addComponent(jTxtFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLbSenha)))
                        .addGap(18, 18, 18)
                        .addComponent(jTxtFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jBtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnConfirmar)
                .addGap(116, 116, 116))
        );
        painelUsuarioLayout.setVerticalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNome)
                    .addComponent(jTxtFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbIdade)
                    .addComponent(jTxtFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDtNasc)
                    .addComponent(jTxtFDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbLogin)
                    .addComponent(jLbSenha)
                    .addComponent(jTxtFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(painelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFNomeActionPerformed
        
    }//GEN-LAST:event_jTxtFNomeActionPerformed

    private void jTxtFIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFIdadeActionPerformed
        
    }//GEN-LAST:event_jTxtFIdadeActionPerformed

    private void jTxtFDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFDiaActionPerformed
        
    }//GEN-LAST:event_jTxtFDiaActionPerformed

    private void jTxtFMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFMesActionPerformed
        
    }//GEN-LAST:event_jTxtFMesActionPerformed

    private void jTxtFAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFAnoActionPerformed
        
    }//GEN-LAST:event_jTxtFAnoActionPerformed

    private void jTxtFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFLoginActionPerformed
        
    }//GEN-LAST:event_jTxtFLoginActionPerformed

    private void jTxtFSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFSenhaActionPerformed
        
    }//GEN-LAST:event_jTxtFSenhaActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        if( jTxtFSenha.getText() != null && jTxtFLogin.getText() != null && jTxtFAno.getText() != null && jTxtFDia.getText() != null && jTxtFIdade.getText() != null && jTxtFMes.getText() != null && jTxtFNome.getText() != null )
            this.usuario = new Usuario(jTxtFLogin.getText(), jTxtFSenha.getText(), Integer.parseInt(jTxtFIdade.getText()), jTxtFNome.getText(), Integer.parseInt(jTxtFDia.getText()), Integer.parseInt(jTxtFMes.getText()), Integer.parseInt(jTxtFAno.getText()));
    }//GEN-LAST:event_jBtnConfirmarActionPerformed
    private Usuario usuario;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JLabel jLbDtNasc;
    private javax.swing.JLabel jLbIdade;
    private javax.swing.JLabel jLbLogin;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbSenha;
    private javax.swing.JTextField jTxtFAno;
    private javax.swing.JTextField jTxtFDia;
    private javax.swing.JTextField jTxtFIdade;
    private javax.swing.JTextField jTxtFLogin;
    private javax.swing.JTextField jTxtFMes;
    private javax.swing.JTextField jTxtFNome;
    private javax.swing.JTextField jTxtFSenha;
    private javax.swing.JPanel painelUsuario;
    // End of variables declaration//GEN-END:variables
}
