/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package InterfaceGrafica;
import Controlador.Controle;
import Modelo.Admin;
import Modelo.Cliente;
import Modelo.Vendedor;
public class FormLogin extends javax.swing.JDialog {
    public FormLogin(java.awt.Frame parent, boolean modal, Controle controle) {
        super(parent, modal);
        initComponents();    
        this.controle = controle;
        this.setVisible(true);    
    }
    public Vendedor getVendedor(){
        return this.vendedor;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public Admin getAdmin(){
        return this.admin;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelUsuario = new javax.swing.JPanel();
        jLbLogin = new javax.swing.JLabel();
        jLbSenha = new javax.swing.JLabel();
        jBtnLogin = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jTxtFLogin = new javax.swing.JTextField();
        jTxtFSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setModal(true);
        setResizable(false);

        painelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLbLogin.setText("Login");

        jLbSenha.setText("Senha");

        jBtnLogin.setText("Login");
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
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
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelUsuarioLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jBtnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbLogin)
                            .addComponent(jLbSenha))
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUsuarioLayout.createSequentialGroup()
                        .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtFLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jTxtFSenha))
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUsuarioLayout.createSequentialGroup()
                        .addComponent(jBtnLogin)
                        .addGap(116, 116, 116))))
        );
        painelUsuarioLayout.setVerticalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbLogin))
                .addGap(58, 58, 58)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLogin)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(painelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFSenhaActionPerformed
        
    }//GEN-LAST:event_jTxtFSenhaActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        if( jTxtFSenha.getText() != null && jTxtFLogin.getText() != null){
            if(controle.getVendedor(jTxtFLogin.getText()) != null){
                for(int i=0; i<controle.getVendedores().size(); i++){
                    if (jTxtFSenha.getText().equals(controle.getVendedor(jTxtFLogin.getText()).getLogin())){
                        this.vendedor = controle.getVendedor(jTxtFLogin.getText());
                        interfacePrincipalUsuario = new InterfacePrincipalUsuario(controle, this.vendedor);
                        dispose();
                    }
                }
            }
        }
    }//GEN-LAST:event_jBtnLoginActionPerformed

    private void jTxtFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFLoginActionPerformed

    }//GEN-LAST:event_jTxtFLoginActionPerformed
    
    private Controle controle;
    private Vendedor vendedor;
    private Cliente cliente;
    private Admin admin;
    private InterfacePrincipalUsuario interfacePrincipalUsuario;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JLabel jLbLogin;
    private javax.swing.JLabel jLbSenha;
    private javax.swing.JTextField jTxtFLogin;
    private javax.swing.JTextField jTxtFSenha;
    private javax.swing.JPanel painelUsuario;
    // End of variables declaration//GEN-END:variables
}
