package Controlador;
import Banco_de_dados.*;
import DAO.*;
import InterfaceGrafica.FormLogin.*;
import Modelo.*;
import java.awt.Component;
import javax.swing.JOptionPane;
public class ClasseDeTestes {
    public static void main(String[] args){
        // Teste das classes Vendedor, cliente, produto e venda
        Vendedor vendedor1 = new Vendedor(1,"Elizinho", "senha", "Eli Soares", 02, 10, 1988);
        Cliente cliente1 = new Cliente(1,"Telminha", "senha", "Telma Vital Machado", 17, 06, 1972);
        vendedor1.adicionarCliente(cliente1);
        
        Produto prod1 = new Produto(1, "Empire", "Melhor perfume do Brasil", "Masculino",145, 0, 0, 0);
        Produto prod2 = new Produto(2, "Grace La Rose", "Melhor perfume da amárica Latina", "Feminino",145, 0, 0, 0);
        Produto prod3 = new Produto(3, "Sublime", "Masculino",145, 0, 0, 0);
        Produto prod4 = new Produto(4, "Grace Midnight", "Masculino",145, 0, 0, 0);
        
        vendedor1.adicionarAoEstoque(prod1);
        vendedor1.adicionarAoEstoque(prod2);
        vendedor1.adicionarAoEstoque(prod3);
        vendedor1.adicionarAoEstoque(prod4);
        
        Venda venda1 = new Venda(1,vendedor1, cliente1, 14, 10, 2018);
        
        venda1.adicionarProduto(prod1);
        venda1.adicionarProduto(prod2);
        venda1.adicionarProduto(prod3);
        venda1.adicionarProduto(prod4);
        
        vendedor1.adicionarVenda(venda1);
        cliente1.adicionarCompra(prod1);
        cliente1.adicionarCompra(prod4);
        cliente1.adicionarCompra(prod3);
        cliente1.adicionarCompra(prod4);
        
        vendedor1.removerDoEstoque(prod1);
        vendedor1.removerDoEstoque(prod2);
        vendedor1.removerDoEstoque(prod3);
        vendedor1.removerDoEstoque(prod4);
        
        //System.out.println("Dados do vendedor:\n"+vendedor1.toString());
        /*
        if(vendedor1.getCliente(1).toString() != null)
            System.out.println(vendedor1.getCliente(1).toString());
        */
        
        //System.out.println(vendedor1.getCliente(1).toStringCompras());
        
        //System.out.println("Dados da venda:\n"+venda1.toString());
        
        // Tratar exceção de ponteiro nulo (try catch)
        //System.out.println(venda1.buscarProdutoPorId(5).toString());
        
        // TESTE DO CONTROLADOR
        
        Controle controle = new Controle();
        controle.adicionarAoCatalago(prod1);
        controle.adicionarAoCatalago(prod2);
        controle.adicionarAoCatalago(prod3);
        controle.adicionarAoCatalago(prod4);
        
        controle.adicionarVendedor(vendedor1);
        controle.adicionarCliente(vendedor1, cliente1);
        controle.novaVenda(venda1);
        
        //System.out.println(controle.buscarVendasPorId(1).toString());
        //System.out.println(controle.buscarCatalagoPorId(1));
        //System.out.println(controle.buscarVendedorPorId(1));
        //System.out.println(controle.buscarClientePorId(1));
        
        try{
            System.out.println(controle.buscarVendedorPorNome("Eli Soares").toString());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro:\nO nome enviado como parâmetro não existe: \'" + e.getMessage()+"\'.");
        }
        //System.out.println(controle.buscarClientePorNome("").toString());
        //System.out.println(controle.buscarCatalagoPorNome("").toString());
        
        // Teste Classe VendedorDAO
        //inserir(new Vendedor("ireliaCarriesWU", "1234", "Main Irelia Pro Player",19, 5, 1972));
    }
}
