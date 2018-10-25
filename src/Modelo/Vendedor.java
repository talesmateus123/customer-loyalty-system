/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
import java.util.LinkedList;
public class Vendedor extends Pessoa {
    private LinkedList<Cliente> clientes;
    private LinkedList<Produto> estoque;
    private LinkedList<Venda> vendas;
    public Vendedor(int id, String login, String senha, String nome, int d, int m, int a) {
        super(id, login, senha, nome, d, m, a);
        this.clientes = new LinkedList();
        this.estoque = new LinkedList();
        this.vendas = new LinkedList();
    }
     public LinkedList<Cliente>getClientes(){
        return this.clientes;
    }
    public Cliente getCliente(int id){
        for (int i = 0; i < this.clientes.size(); i++){
            if(clientes.get(i).getId() == id)
                return this.clientes.get(i);
        }
        return null;
    }
    public LinkedList<Produto> getProdutosEmEstoque(){
        return this.estoque;
    }
    public Produto getProdutoEmEstoque(int id){
        for (int i = 0; i < this.estoque.size(); i++){
            if(estoque.get(i).getId() == id)
                return this.estoque.get(i);
        }
        return null;
    }
    public LinkedList<Venda> getProdutosVendidos(){
        return this.vendas;
    }
    public Venda getProdutoVendido(int id){
        for (int i = 0; i < this.vendas.size(); i++){
            if(vendas.get(i).getId() == id)
                return this.vendas.get(i);
        }
        return null;
    }
    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void removerCliente(int id){
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getId() == id)
                this.clientes.remove(clientes.get(id));
        }
    }
    public void removerCliente(Cliente cliente){
        if(clientes.contains(cliente))
            this.clientes.remove(cliente);
    }
    public void limparClientes(){
        clientes.clear();
    }
    public Cliente buscarClientePorId(int id){
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getId() == id)
                return this.clientes.get(i);
        }
        return null;
    }
    public Cliente buscarClientePorNome(String nome){
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getNome().equals(nome))
                return this.clientes.get(i);
        }
        return null;
    }
   
    public void adicionarAoEstoque(Produto produto){
        this.estoque.add(produto);
    }
    public void removerDoEstoque(int id){
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getId() == id)
                this.clientes.remove(clientes.get(id));
        }
    }
    public void removerDoEstoque(Produto produto){
        if(estoque.contains(produto))
            this.estoque.remove(produto);
    }
    public void limparEstoque(){
        estoque.clear();
    }
    public Produto buscarEstoquePorId(int id){
        for(int i=0; i<estoque.size(); i++){
            if(estoque.get(i).getId() == id)
                return this.estoque.get(i);
        }
        return null;
    }
    public Produto buscarEstoquePorNome(String nome){
        for(int i=0; i<estoque.size(); i++){
            if(estoque.get(i).getNome().equals(nome))
                return this.estoque.get(i);
        }
        return null;
    }
    
    public void adicionarVenda(Venda venda){
        this.vendas.add(venda);
    }
    public void removerVenda(int id){
        for(int i=0; i<vendas.size(); i++){
            if(vendas.get(i).getId() == id)
                this.vendas.remove(vendas.get(id));
        }
    }
    public void removerVenda(Venda venda){
        if(vendas.contains(venda))
            this.vendas.remove(venda);
    }
    public void limparVendas(){
        vendas.clear();
    }
    public Venda buscarVendaPorId(int id){
        for(int i=0; i<vendas.size(); i++){
            if(vendas.get(i).getId() == id)
                return this.vendas.get(i);
        }
        return null;
    }
    public String toStringClientes() {
        String clientes = "";
        if(this.clientes.isEmpty())
            clientes = "O vendedor não possui clientes cadastrados";
        else{
        for(int i = 0; i < this.clientes.size(); i++)
            clientes = clientes + this.clientes.get(i).toString() +"\n";
        } 
        return "\nClientes cadastrados:\n"+clientes
                + "-------------------------------------------------------------------------------\n";
    }
    public String toStringVendas() {
        String vendas = "";
        if(this.vendas.isEmpty())
            vendas = "O vendedor não tem clientes cadastrados";
        else{
        for(int i = 0; i < this.vendas.size(); i++)
            vendas = vendas + this.vendas.get(i).toString() +"\n";
        } 
        return "\nVendas realizadas:\n:"+vendas
                + "-------------------------------------------------------------------------------\n";
    }
    public String toStringEstoque() {
        String estoque = "";
        if(this.estoque.isEmpty())
            estoque = "O vendedor não possui intens em estoque";
        else{
        for(int i = 0; i < this.estoque.size(); i++)
            estoque = estoque + this.estoque.get(i).toString() +"\n";
        } 
        return "\nItens em estoque:"+estoque
                + "-------------------------------------------------------------------------------\n";
    }
    public String toString() {
        return "Usuário id: " + this.id + "; nome: " + this.nome + "; data de nascimento: " + this.dtNasc.toString() + "; clientes cadastrados: " + this.clientes.size() ;
                
    }
}
