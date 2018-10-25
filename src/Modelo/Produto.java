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
    public Produto(int id, String nome, String descricao, String tipo, float preco, int d, int m, int a) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.preco = preco;
        this.dataValidade = new Data(d, m, a);
    }
    public Produto(int id, String nome, String tipo, float preco, int d, int m, int a) {
        this.id = id;
        this.nome = nome;
        this.descricao = "Sem descrição";
        this.tipo = tipo;
        this.preco = preco;
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
        return " - Produto id: " + id + "; nome: " + nome + "; descricao: " + descricao + "; valor: " + preco;
    }    
}
