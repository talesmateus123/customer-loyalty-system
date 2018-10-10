/*
NOME: TALES MATEUS DE OLIVEIRA
TURMA: 1224
 */
package Modelo;
public class Cliente {
    private final int id;
    private int idade;
    private int pontos;
    private String nome;
    private final Data dtNasc;
    
    public Cliente(int id, int idade, String nome, int d, int m, int a) {
        this.id = id;
        this.idade = idade;
        this.pontos = 0;
        this.nome = nome;
        this.dtNasc = new Data(d, m, a);
    }
    public int getId() {
        return id;
    }
    public int getIdade() {
        return idade;
    }
    public int getPontos() {
        return pontos;
    }
    public String getNome() {
        return nome;
    }
    public Data getDtNasc() {
        return dtNasc;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void addPontos(int pontos) {
        this.pontos = this.pontos + pontos;
    }
    public void subPontos(int pontos) {
        this.pontos = this.pontos - pontos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDtNasc(int d, int m, int a) {
        this.dtNasc.setData(d, m, a);
    }
    public String toString() {
        return "Cliente id: " + id + "\nNome: " + nome + "\nIdade: "  + idade +"\nData de nascimento: " + dtNasc.toString() + "\nTotal pontos: " + pontos + '.';
    }
}
