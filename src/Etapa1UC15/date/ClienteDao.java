
package Etapa1UC15.date;

import Etapa1UC15.Cliente;
import java.sql.*;
import java.util.ArrayList;

public class ClienteDao {
    public void salvar(Cliente c){

       String sql = "INSERT INTO cliente (nome, cpf, telefone, endereco) VALUES (?, ?, ?, ?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEndereco());
            stmt.execute();

        } catch(Exception e){
            System.out.println("Erro ao salvar cliente: " + e);
        }
    }

   
    public ArrayList<Cliente> listar(){

        ArrayList<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM cliente";

        try(Connection conn = Conexao.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()){

                Cliente c = new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("telefone"),
                rs.getString("endereco")
                );

                lista.add(c);
            }

        } catch(Exception e){
            System.out.println("Erro ao listar clientes: " + e);
        }

        return lista;
    }

    public Cliente buscarPorNome(String nome){

    String sql = "SELECT * FROM cliente WHERE nome LIKE ?";

    try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){

        stmt.setString(1, "%" + nome + "%");

        ResultSet rs = stmt.executeQuery();

        if(rs.next()){
            return new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("telefone"),
                rs.getString("endereco")
            );
        }

    } catch(Exception e){
        System.out.println("Erro ao buscar cliente: " + e);
    }

    return null;
    }

 
    public void atualizar(Cliente c){

       String sql = "UPDATE cliente SET nome=?, cpf=?, telefone=?, endereco=? WHERE id=?";

    try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){

        stmt.setString(1, c.getNome());
        stmt.setString(2, c.getCpf());
        stmt.setString(3, c.getTelefone());
        stmt.setString(4, c.getEndereco());
        stmt.setInt(5, c.getId());

        stmt.executeUpdate();

    } catch(Exception e){
        System.out.println("Erro ao atualizar cliente: " + e);
    }
    }

    public void excluir(int id){

        String sql = "DELETE FROM cliente WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println("Erro ao excluir cliente: " + e);
        }
    }
}