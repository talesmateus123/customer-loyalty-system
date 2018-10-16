/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
import java.util.LinkedList;
public class Usuario extends Pessoa {
    private LinkedList<Cliente> clientes;
    private LinkedList<Produto> estoque;
    public Usuario(String login, String senha, int idade, String nome, int d, int m, int a) {
        super(login, senha, idade, nome, d, m, a);
        this.clientes = new LinkedList();
        this.estoque = new LinkedList();
    }
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
        this.clientes.getLast().setId(this.clientes.indexOf(this.clientes.getLast()));
    }
    public boolean removerCliente(int id){
        for(int i=0; i<clientes.size(); i++){
                if (id == clientes.get(i).getId()){
                    this.clientes.remove(clientes.get(i));
                    return true;
                }
        }
        return false;
    }
    public Cliente buscarClientePorId(int id){
            for(int i=0; i<clientes.size(); i++){
                if (id == clientes.get(i).getId())
                    return this.clientes.get(i);
            }
            return null;
        }
    public Cliente buscarClientePorNome(String nome){
        for(int i=0; i<clientes.size(); i++){
            if (nome.equals(clientes.get(i).getNome()))
                return this.clientes.get(i);
        }
        return null;
    }
    public LinkedList getProdutosEmEstoque(){
        return this.estoque;
    }
    public LinkedList getClientes(){
        return this.clientes;
    }
    public Cliente getCliente(int id){
        return this.clientes.get(id);
    }
    public void adicionarAoEstoque(Produto produto){
        this.estoque.add(produto);
    }
    public String toString() {
        return "Usuário id: " + this.id + "\nNome: " + this.nome + "\nIdade: "  + this.idade +"\nData de nascimento: " + this.dtNasc.toString() + "\nClientes cadastrados: " + this.clientes.size() + '.';
    }
}
