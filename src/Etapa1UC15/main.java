
package Etapa1UC15;


import Etapa1UC15.view.CadastroProdutos;
import java.util.Scanner;


public class main {

   public static void main(String[] args) {
       
       { java.awt.EventQueue.invokeLater(() -> {
        new CadastroProdutos().setVisible(true);
    });

}
     /*  Estoque estoque = new Estoque();

        Produto p1 = new Produto(1, "Cimento", "Construção", 45.0, 10);
        Produto p2 = new Produto(2, "Tijolo", "Construção", 2.5, 100);

        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);

        estoque.listarProdutos();

        Cliente c1 = new Cliente(1, "João Silva", "12345678901", "11999999999", "Rua A");

        Venda venda = new Venda(1, "25/02/2026", c1);

        ItemVenda item1 = new ItemVenda(p1, 2);
        ItemVenda item2 = new ItemVenda(p2, 20);

        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        venda.mostrarResumo();

        System.out.println();
      estoque.listarProdutos(); */
    }
}