/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
public class Cliente extends Pessoa{
    private int pontos;
    public Cliente(String login, String senha, String nome, int d, int m, int a) {
        super(login, senha, nome, d, m, a);
        this.pontos = 0;
    }
    public int getPontos() {
        return pontos;
    }
    public void addPontos(int pontos) {
        this.pontos = this.pontos + pontos;
    }
    public void subPontos(int pontos) {
        this.pontos = this.pontos - pontos;
    }
    public String toString() {
        return "Cliente id: " + this.id + "\nNome: " + this.nome + "\nData de nascimento: " + this.dtNasc.toString() + "\nTotal pontos: " + this.pontos + '.';
    }
}
