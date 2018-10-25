/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;

import java.util.LinkedList;

public class Venda {
    private int id;
    private Vendedor vendedor;
    private Cliente cliente;
    private LinkedList<Produto> produtos;
    private Data dataVenda;
    public Venda(int id, Vendedor usuario, Cliente cliente, int d, int m, int a){
        this.id = id;
        this.vendedor = usuario;
        this.cliente = cliente;
        this.produtos = new LinkedList<Produto>();
        this.dataVenda = new Data(d, m, a);
    }
    public int getId(){
        return id;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public LinkedList<Produto> getProdutos() {
        return produtos;
    }
    public Data getDataVenda() {
        return dataVenda;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
     public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void removerProduto(int id){
        for(int i=0; i<produtos.size(); i++){
            if(produtos.get(i).getId() == id)
                this.produtos.remove(produtos.get(id));
        }
    }
    public void removerProduto(Produto produto){
        if(produtos.contains(produto))
            this.produtos.remove(produto);
    }
    public void limparProdutos(){
        produtos.clear();
    }
    public Produto buscarProdutoPorId(int id){
        for(int i=0; i<produtos.size(); i++){
            if(produtos.get(i).getId() == id)
                return this.produtos.get(i);
        }
        return null;
    }
    public Produto buscarProdutoPorNome(String nome){
        for(int i=0; i<produtos.size(); i++){
            if(produtos.get(i).getNome().equals(nome))
                return this.produtos.get(i);
        }
        return null;
    }
    
    public void setDataVenda(int d, int m, int a) {
        this.dataVenda.setData(d, m, a);
    }
    public String toString() {
        String produtos = "";
        for(int i = 0; i < this.produtos.size(); i++)
            produtos = produtos + this.produtos.get(i).toString() +"\n";
        
        return "--------------------------------"+"Venda ID: " + id +"------------------------------------"+
                 "\nVendedor: " + vendedor.getNome() + "\nCliente: " + cliente.getNome() +  "\nData da venda: " + dataVenda.toString() 
                + "\nProdutos comprados:\n" + produtos
                + "-------------------------------------------------------------------------------";
    }    
}
