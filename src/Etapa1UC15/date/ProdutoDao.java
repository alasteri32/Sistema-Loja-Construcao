
package Etapa1UC15.date;

import Etapa1UC15.Produto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class ProdutoDao {
   
    
public void salvarProduto(Produto p){
     String sql = "INSERT INTO produto (nome, categoria, quantidade, preco) VALUES (?, ?, ?, ?)";

    try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){

        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getCategoria());
        stmt.setInt(3, p.getQuantidade());
        stmt.setDouble(4, p.getPreco());

        stmt.execute();

    } catch(Exception e){
        System.out.println("Erro ao salvar: " + e);
    }
}
public ArrayList<Produto> listarProdutos(){

    ArrayList<Produto> lista = new ArrayList<>();

    String sql = "SELECT * FROM produto";

    try(Connection conn = Conexao.conectar();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){

while(rs.next()){
    Produto p = new Produto(
    rs.getInt("id"),
    rs.getString("nome"),
    rs.getString("categoria"),
    rs.getDouble("preco"),
    rs.getInt("quantidade")
    );
            lista.add(p);
        }

    } catch(Exception e){
        System.out.println("Erro: " + e);
    }

    return lista;
}
public void atualizarQuantidade(String nome, int qtd){

    String sql = "UPDATE produto SET quantidade = ? WHERE nome = ?";

    try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){

        stmt.setInt(1, qtd);
        stmt.setString(2, nome);

        stmt.executeUpdate();

    } catch(Exception e){
        System.out.println("Erro: " + e);
    }
}
}
