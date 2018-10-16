/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
public class Administrador extends Pessoa {
    public Administrador(String login, String senha, int idade, String nome, int d, int m, int a) {
        super(login, senha, idade, nome, d, m, a);
        this.login = login;  
        this.senha = senha;  
    }    
    public String toString() {
        return "Administrador id: " + id + "\nNome: " + nome + "\nIdade: "  + idade +"\nData de nascimento: " + dtNasc.toString() +  '.';
    }
}
