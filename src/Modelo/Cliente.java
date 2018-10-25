/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
import java.util.LinkedList;
public class Cliente extends Pessoa{
    private int pontos;
    private LinkedList<Produto> compras;
    public Cliente(int id, String login, String senha, String nome, int d, int m, int a) {
        super(id, login, senha, nome, d, m, a);
        this.pontos = 0;
        this.compras = new LinkedList<Produto>();
    }
    public int getPontos() {
        return pontos;
    }
    public LinkedList<Produto> getCompras() {
        return compras;
    }
    public void adicionarPontos(int pontos) {
        this.pontos = this.pontos + pontos;
    }
    public void subtrairPontos(int pontos) {
        this.pontos = this.pontos - pontos;
    }
    public void zerarPontos(){
        this.pontos = 0;
    }
    public void adicionarCompra(Produto produto){
        this.compras.add(produto);
        adicionarPontos(10);
    }
    public void removerCompra(int id){
        for(int i=0; i<compras.size(); i++){
            if(compras.get(i).getId() == id)
                this.compras.remove(compras.get(id));
        }
        subtrairPontos(10);
    }
    public void removerCompra(Produto produto){
        if(compras.contains(produto))
            this.compras.remove(produto);
        subtrairPontos(10);
    }
    public void limparCompras(){
        this.compras.clear();
    }
    public Produto buscarCompraPorId(int id){
        for(int i=0; i<compras.size(); i++){
            if(compras.get(i).getId() == id)
                return this.compras.get(i);
        }
        return null;
    }
    public Produto buscarCompraPorNome(String nome){
        for(int i=0; i<compras.size(); i++){
            if(compras.get(i).getNome().equals(nome))
                return this.compras.get(i);
        }
        return null;
    }
    public String toStringCompras() {
        String compras = "";
        if(this.compras.isEmpty())
            compras = "O cliente ainda não realizou compras";
        else{
        for(int i = 0; i < this.compras.size(); i++)
            compras = compras + this.compras.get(i).toString() +"\n";
        } 
        return "\nProdutos comprados:\n"+compras
                + "-------------------------------------------------------------------------------\n";
    }
    public String toString() {
        return "Cliente id: " + this.id + "\nNome: " + this.nome + "\nData de nascimento: " + this.dtNasc.toString() + "\nTotal pontos: " + this.pontos;
    }
}
