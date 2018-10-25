/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
public class Admin extends Pessoa {
    public Admin(int id, String login, String senha, String nome, int d, int m, int a) {
        super(id, login, senha, nome, d, m, a);
        this.login = login;  
        this.senha = senha;  
    }    
    public String toString() {
        return "Administrador id: " + id + "\nNome: " + nome +"\nData de nascimento: " + dtNasc.toString() +  '.';
    }
}
