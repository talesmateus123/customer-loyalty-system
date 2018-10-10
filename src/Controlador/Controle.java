/*
NOME: TALES MATEUS DE OLIVEIRA
TURMA: 1224
 */
package Controlador;
import java.util.LinkedList;
import Modelo.Cliente;
import Modelo.Usuario;
public class Controle {
        private final LinkedList<Usuario> usuarios = new LinkedList();
        public void addUsuario(int id, int idade, String nome, int d, int m, int a){
            usuarios.add(new Usuario(usuarios.size()+1, idade, nome, d, m, a));
        }
        public void addCliente(Usuario usuario, int idade, String nome, int d, int m, int a){
            usuario.addCliente(idade, nome, d, m, a);
        }
        public void removeCliente(Usuario usuario, int id){
            usuario.removeCliente(id);
        }
        public void buscarClientePorId(Usuario usuario, int id){
            usuario.buscarClientePorId(id);
        }
        public void buscarClientePorNome(Usuario usuario, String nome){
            usuario.buscarClientePorNome(nome);
        }
        public void removeUsuario(int id){
            for(int i=0; i<usuarios.size(); i++){
                if (id == usuarios.get(i).getId())
                    usuarios.remove(usuarios.get(i));
            }
        }
        public Usuario buscarUsuarioPorId(int id){
            for(int i=0; i<usuarios.size(); i++){
                if (id == usuarios.get(i).getId())
                    return usuarios.get(i);
            }
            return null;
        }
        public Usuario buscarUsuarioPorNome(String nome){
            for(int i=0; i<usuarios.size(); i++){
                if (nome.equals(usuarios.get(i).getNome()))
                    return usuarios.get(i);
            }
            return null;
        }
}
