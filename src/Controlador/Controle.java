/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Controlador;
import Modelo.Admin;
import DAO.*;
import java.util.LinkedList;
import Modelo.*;
public class Controle {
        private Admin admin;
        private LinkedList<Vendedor> vendedores;
        private LinkedList<Cliente> clientes;
        private LinkedList<Venda> vendas;
        private LinkedList<Produto> catalago;
        public Controle(){
            this.admin = new Admin(1,"talesmateus123", "21142307", "Tales Mateus de Oliveira Ferreira", 14, 06, 1999);
            this.vendedores = new LinkedList();
            this.clientes = new LinkedList();
            this.vendas = new LinkedList();
            this.catalago = new LinkedList();
        }
        // GETTERS
        public LinkedList<Produto> getCatalago(){
            return catalago;
        }
        public LinkedList<Vendedor> getVendedores(){
            return vendedores;
        }
        public LinkedList<Cliente> getClientes(){
            return clientes;
        }
        public LinkedList<Venda> getVendas(){
            return vendas;
        }        
                
        // MÉTODOS DE LISTA
        // -----------------ESTÁ FALTANDO TRATAR AS EXCEÇÕES DOS MÉTODOS DE LISTA-----------------
        public void adicionarVendedor(Vendedor vendedor){
            this.vendedores.add(vendedor);
        }
        public void removerVendedor(int id){
            for(int i=0; i<vendedores.size(); i++){
                if(vendedores.get(i).getId() == id)
                    this.vendedores.remove(vendedores.get(id));
            }
        }
        public void removerVendedor(Vendedor vendedor){
            if(vendedores.contains(vendedor))
                this.vendedores.remove(vendedor);
        }
        public void limparVendedores(){
            vendedores.clear();
        }
        public Vendedor buscarVendedorPorId(int id){
            for(int i=0; i<vendedores.size(); i++){
                if(vendedores.get(i).getId() == id)
                    return this.vendedores.get(i);
            }
            return null;
        }
        public Vendedor buscarVendedorPorNome(String nome){
            for(int i=0; i<vendedores.size(); i++){
                if(vendedores.get(i).getNome().equals(nome))
                    return this.vendedores.get(i);
            }
            return null;
        }   
        public void adicionarCliente(Vendedor vendedor, Cliente cliente){
            this.clientes.add(cliente);
            vendedor.adicionarCliente(cliente);
        }
        public void removerCliente(Vendedor vendedor, int id){
            for(int i=0; i<clientes.size(); i++){
                if(clientes.get(i).getId() == id){
                    this.clientes.remove(clientes.get(id));
                    vendedor.removerCliente(id);
                }
            }
        }
        public void removerCliente(Vendedor vendedor, Cliente cliente){
            if(clientes.contains(cliente)){
                this.clientes.remove(cliente);
                vendedor.removerCliente(cliente);
            }
        }
        public void limparClientes(){
            this.clientes.clear();
            for(int i = 0; i< this.vendedores.size(); i++)
                vendedores.get(i).limparClientes();
        }
        //testar
        public void limparClientesPorVendedor(Vendedor vendedor){
            this.clientes.removeAll(vendedor.getClientes());
            vendedor.limparClientes();
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
        public void novaVenda(Venda venda){
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
        public Venda buscarVendasPorId(int id){
            for(int i=0; i<vendas.size(); i++){
                if(vendas.get(i).getId() == id)
                    return this.vendas.get(i);
            }
            return null;
        }
        public void adicionarAoCatalago(Produto produto){
            this.catalago.add(produto);
        }
        public void removerDoCatalago(int id){
            for(int i=0; i<catalago.size(); i++){
                if(catalago.get(i).getId() == id)
                    this.catalago.remove(catalago.get(id));
            }
        }
        public void removerDoCatalago(Produto produto){
            if(catalago.contains(produto))
                this.catalago.remove(produto);
        }
        public void limparCatalago(){
            catalago.clear();
        }
        public Produto buscarCatalagoPorId(int id){
            for(int i=0; i<catalago.size(); i++){
                if(catalago.get(i).getId() == id)
                    return this.catalago.get(i);
            }
            return null;
        }
        public Produto buscarCatalagoPorNome(String nome){
            for(int i=0; i<catalago.size(); i++){
                if(catalago.get(i).getNome().equals(nome))
                    return this.catalago.get(i);
            }
            return null;
        }       
}
