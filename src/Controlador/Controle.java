/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Controlador;
import Modelo.Administrador;
import java.util.LinkedList;
import Modelo.Cliente;
import Modelo.Usuario;
import Modelo.Venda;
import Modelo.Produto;
public class Controle {
        private Administrador admin;
        private LinkedList<Usuario> usuarios;
        private LinkedList<Cliente> clientes;
        private LinkedList<Venda> vendas;
        private LinkedList<Produto> produtos;
        private LinkedList<Produto> catalago;
        public Controle(){
            admin = new Administrador("admin", "admin", 19, "Tales Mateus de Oliveira", 14, 06, 1999);
            this.usuarios = new LinkedList();
            this.vendas = new LinkedList();
            this.produtos = new LinkedList();
        }
        public void novoUsuario(Usuario usuario){
            usuarios.add(usuario);
            usuarios.getLast().setId(usuarios.indexOf(usuarios.getLast()));
        }
        public boolean removerUsuario(int id){
            for(int i=0; i<usuarios.size(); i++){
                if (id == usuarios.get(i).getId()){
                    usuarios.remove(usuarios.get(i));
                    return true;
                }
            }
            return false;
        }
        public Usuario buscarUsuario(String login){
            for(int i=0; i<usuarios.size(); i++){
                if (login.equals(usuarios.get(i).getLogin()))
                    return usuarios.get(i);
            }
            return null;
        }
        public LinkedList getUsuarios(){
            return this.usuarios;
        }
        public Usuario getUsuario(int id){
            if (this.usuarios.get(id).equals(null))
                return null;
            return this.usuarios.get(id);
        }
        public void novoCliente(Usuario usuario, Cliente cliente){
            usuario.addCliente(cliente);
            clientes.add(cliente);
        }
        public boolean excluirCliente(Usuario usuario, int id){
            clientes.remove(id);
            return usuario.removerCliente(id);
        }
        public Cliente buscarClientePorId(Usuario usuario, int id){
            return usuario.buscarClientePorId(id);
        }
        public void novaVenda(Usuario usuario, Cliente cliente, Produto produto, int d, int m, int a){
            vendas.add(new Venda(usuario, cliente, produto, d, m, a));
            vendas.getLast().setId(vendas.indexOf(vendas.getLast()));
        }
        public boolean excluirVenda(int id){
            if(vendas.get(id) == null)
                return false;
            vendas.remove(id);
            return true;
        }
        public Venda buscarVendaPorId(int id){
             for(int i=0; i<vendas.size(); i++){
                if (id == vendas.get(i).getId())
                    return this.vendas.get(i);
            }
            return null;
        }
        
        
        public void addCatalago(Produto produto) {
            this.catalago.add(produto);
        }
        public boolean removeCatalago(int id) {
            for(int i=0; i<catalago.size(); i++){
                    if (id == catalago.get(i).getId()){
                        this.catalago.remove(catalago.get(i));
                        return true;
                    }
            }
            return false;
        }    
}
