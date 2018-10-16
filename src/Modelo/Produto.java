/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
public class Produto {
    private int id;
    private float preco;
    private Data dataValidade;
    private String nome;
    private String descricao;
    private String tipo;
    public Produto(float preco, String nome, String descricao, String tipo, int d, int m, int a) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataValidade = new Data(d, m, a);
    }
    public int getId() {
        return id;
    }
    public float getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public Data getDataValidade() {
        return dataValidade;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
    public void setDataValidade(int d, int m, int a) {
        this.dataValidade.setData(d, m, a);
    }
    public String toString() {
        return "Produto id: " + id + "\nNome: " + nome + "\nDescricao: " + descricao + "\nValor: " + preco + '.';
    }    
}
