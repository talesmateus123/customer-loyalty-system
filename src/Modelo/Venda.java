/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
public class Venda {
    private int id;
    private Vendedor vendedor;
    private Cliente cliente;
    private Produto produto;
    private Data dataVenda;
    public Venda(Vendedor usuario, Cliente cliente, Produto produto, int d, int m, int a){
        this.vendedor = usuario;
        this.cliente = cliente;
        this.produto = produto;
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
    public Produto getProduto() {
        return produto;
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
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setDataVenda(int d, int m, int a) {
        this.dataVenda.setData(d, m, a);
    }
    public String toString() {
        return "Venda id: " + id + "\nVendedor: " + vendedor.getNome() + "Cliente: " + cliente.getNome() + "Produto: " + produto.getNome() + "Data da venda: " + dataVenda.toString() + '}';
    }
    
}
