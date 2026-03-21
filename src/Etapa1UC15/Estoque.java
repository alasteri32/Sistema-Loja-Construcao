
package Etapa1UC15;

import java.util.ArrayList;


public class Estoque {
 private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        System.out.println("Produto adicionado ao estoque: " + p.getNome());
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void listarProdutos() {
        System.out.println("=== ESTOQUE ===");
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " | Qtd: " + p.getQuantidade() + " | Preço: R$ " + p.getPreco());
        }
    }
}