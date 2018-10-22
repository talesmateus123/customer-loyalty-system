/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Controlador;
import Modelo.Admin;
import java.util.LinkedList;
import Modelo.Cliente;
import Modelo.Vendedor;
import Modelo.Venda;
import Modelo.Produto;
public class Controle {
        private Admin admin;
        private LinkedList<Vendedor> vendedores;
        private LinkedList<Cliente> clientes;
        private LinkedList<Venda> vendas;
        private LinkedList<Produto> catalago;
        public Controle(){
            admin = new Admin("talesmateus123", "21142307", "Tales Mateus de Oliveira Ferreira", 14, 06, 1999);
            vendedores = new LinkedList();
            vendas = new LinkedList();
        }
       // VENDEDORES
        public void novoVendedor(Vendedor vendedor){
            vendedores.add(vendedor);
            vendedores.getLast().setId(vendedores.indexOf(vendedores.getLast()));
        }        
        public  Vendedor getVendedor(int id){
            return vendedores.get(id);
        }
        public Vendedor getVendedor(String login){
            for(int i=0; i<vendedores.size(); i++){
                if (login.equals(vendedores.get(i).getLogin()))
                    return vendedores.get(i);
            }
            return null;
        }
        public LinkedList<Vendedor> getVendedores(){
            return vendedores;
        }
        public boolean removerVendedor(int id){
            for(int i=0; i<vendedores.size(); i++){
                if (id == vendedores.get(i).getId()){
                    vendedores.remove(vendedores.get(i));
                    return true;
                }
            }
            return false;
        }        
        // CLIENTES
        public void novoCliente(Vendedor vendedor, Cliente cliente){
            vendedor.addCliente(cliente);
            clientes.add(cliente);
        }        
        public LinkedList<Cliente> getClientes(){
            return clientes;
        }
        public static Cliente getCliente(Vendedor vendedor, int id){
            return vendedor.buscarClientePorId(id);
        }
        public Cliente getCliente(Vendedor vendedor, String nome){
            return vendedor.buscarClientePorNome(nome);
        }
        public Cliente getCliente(String nome){
            for (int i=0; i< clientes.size(); i++){
                if(nome.equals(clientes.get(i).getNome()))
                    return clientes.get(i);
            }
            return null;
        }
        public boolean excluirCliente(Vendedor vendedor, int id){
            clientes.remove(id);
            return vendedor.removerCliente(id);
        }
        // VENDAS
        public void novaVenda(Vendedor vendedor, Cliente cliente, Produto produto, int d, int m, int a){
            vendas.add(new Venda(vendedor, cliente, produto, d, m, a));
            vendas.getLast().setId(vendas.indexOf(vendas.getLast()));
        }
        public LinkedList<Venda> getVendas(){
            return vendas;
        }
        public Venda getVenda(int id){
                return vendas.get(id);
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
                    return vendas.get(i);
            }
            return null;
        }        
        // CATALAGO
        public  void addCatalago(Produto produto) {
            catalago.add(produto);
        }
        public boolean removeCatalago(int id) {
            for(int i=0; i<catalago.size(); i++){
                    if (id == catalago.get(i).getId()){
                        catalago.remove(catalago.get(i));
                        return true;
                    }
            }
            return false;
        }
        public LinkedList<Produto> getCatalago(){
            return catalago;
        }
        public Produto getItemCatalago(int id){
            for(int i = 0; i < catalago.size(); i++){
                if (id == catalago.get(id).getId())
                    return catalago.get(id);
            }
            return null;
        }
        public Produto getItemCatalago(String nome){
            for(int i = 0; i < catalago.size(); i++){
                if (nome.equals(catalago.get(i).getNome()))
                    return catalago.get(i);
            }
            return null;
        }
        
}
