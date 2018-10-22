/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
public class Pessoa {
    protected int id;
    protected String nome;
    protected Data dtNasc;
    protected String login;
    protected String senha;
    public Pessoa(String login, String senha, String nome, int d, int m, int a) {
        this.nome = nome;
        this.dtNasc = new Data(d, m, a);
        this.login = login;
        this.senha = senha;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Data getDataNascimento() {
        return dtNasc;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(int d, int m, int a) {
        this.dtNasc.setData(d, m, a);
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
