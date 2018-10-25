package DAO;
import Modelo.*;
import Banco_de_dados.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class VendedorDAO {
      private static final String INSERT = "INSERT INTO Vendedor(login, senha, nome, dtNasc)"+"VALUES(?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE Vendedor SET NOME=?, TELEFONE=?, EMAIL=? WHERE ID=?";
    private static final String DELETE = "DELETE FROM Vendedor WHERE ID=?";
    private static final String LIST = "SELECT * FROM Vendedor ";
    private static final String LISTBYID = "SELECT * FROM Vendedor WHERE ID=?";
    
    public static void main(String[] args){
        //inserir(new Vendedor("ireliaCarriesWU", "1234", "Main Irelia Pro Player",19, 5, 1972));
        
    }
    public static void inserir(Vendedor vendedor) {
        if (vendedor != null) {
            Connection conn = null;
            try {
                conn = ConexaoMySQL.conectar();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(INSERT); 
                
                pstm.setString(1, vendedor.getLogin());
                pstm.setString(2, vendedor.getSenha());
                pstm.setString(3, vendedor.getNome());
                pstm.setString(4, vendedor.getDataNascimento().toString());

                pstm.execute();
                
                JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso");
                //Conexao.fechaConexao(conn, pstm);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir vendedor no banco de"+ "dados " + e.getMessage());
            }
        } 
        else 
            JOptionPane.showMessageDialog(null, "Erro ao inserir vendedor no banco de dados!.\nO vendedor enviado por parâmetro está vazio." );  
    }
    
    
    
    public void remover(int id) {
        if (Integer.toString(id) != null) {
            Connection conn = null;
            try {
                conn = ConexaoMySQL.conectar();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(DELETE); 
                
                pstm.setInt(1, id);

                pstm.execute();
                
                JOptionPane.showMessageDialog(null, "Vendedor removido com sucesso");
                //Conexao.fechaConexao(conn, pstm);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao remover vendedor no banco de"+ "dados " + e.getMessage());
            }
        } 
        else 
            JOptionPane.showMessageDialog(null, "Erro ao remover vendedor no banco de dados!.\nO vendedor enviado por parâmetro está vazio." );     
    }
    
}
