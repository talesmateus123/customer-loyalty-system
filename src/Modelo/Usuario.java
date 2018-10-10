/*
NOME: TALES MATEUS DE OLIVEIRA
TURMA: 1224
 */
package Modelo;
import java.util.LinkedList;
public class Usuario {
    private final int id;
    private int idade;
    private String nome;
    private final Data dtNasc;
    LinkedList<Cliente> clientes;
    
    public Usuario(int id, int idade, String nome, int d, int m, int a) {
        this.clientes = new LinkedList();
        this.id = id;
        this.idade = idade;        
        this.nome = nome;
        this.dtNasc = new Data(d, m, a);
    }
    public void addCliente(int idade, String nome, int d, int m, int a){
        this.clientes.add(new Cliente(clientes.size()+1, idade, nome, d, m, a));
    }
    public void removeCliente(int id){
        for(int i=0; i<clientes.size(); i++){
                if (id == clientes.get(i).getId())
                    this.clientes.remove(clientes.get(i));
            }
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
    public int getId() {
        return id;
    }
    public int getIdade() {
        return idade;
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
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDtNasc(int d, int m, int a) {
        this.dtNasc.setData(d, m, a);
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void subCliente(Cliente cliente){
        clientes.remove(cliente);
    }    
    public String toString() {
        return "Usuário id: " + id + "\nNome: " + nome + "\nIdade: "  + idade +"\nData de nascimento: " + dtNasc.toString() + "\nClientes cadastrados: " + clientes.size() + '.';
    }
}
