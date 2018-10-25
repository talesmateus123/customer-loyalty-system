package Banco_de_dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String USUARIO = "talesmateus-server";
    private static final String SENHA = "21142307";
    private static final String DATABASE = "sistema_de_vendas";
    private static final String DRIVE_CONEXAO = "com.mysql.jdbc.Driver";
    private static final String STR_CONEXAO = "jdbc:mysql://localhost:3306/";
    
    public static Connection conectar() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        try{
            Class.forName(DRIVE_CONEXAO);
            conn = DriverManager.getConnection(STR_CONEXAO + DATABASE, USUARIO, SENHA);
            return conn;
        }
        catch(ClassNotFoundException e){
            throw new ClassNotFoundException("Driver MySQL não foi encontrado: " +e.getMessage());
        }
        catch(SQLException e){
            throw new SQLException("Erro ao conectar com a base de dados: "+e.getMessage());
        }
    }
}
