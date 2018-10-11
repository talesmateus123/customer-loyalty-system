/*
NOME: TALES MATEUS DE OLIVEIRA
TURMA: 1224
 */
package InterfaceGrafica;
import Controlador.Controle;
public class InterfacePrincipal extends javax.swing.JFrame {
    public InterfacePrincipal() {
        initComponents();
        controle.addUsuario(19, "Tales Mateus de Oliveira", 14, 06, 1999);
        controle.addCliente(controle.buscarUsuarioPorId(0), 23, "João Afonso dos Santos", 17, 11, 1963);
        
        System.out.println(controle.buscarUsuarioPorNome("Tales Mateus de Oliveira").toString());
        
        System.out.println(controle.buscarUsuarioPorNome("Tales Mateus de Oliveira").getCliente(0).toString());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }
    Controle controle = new Controle();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
