
package Etapa1UC15;

import java.util.ArrayList;
import java.util.List;


public class Venda { 
private int id;
    private String data;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;
    private double valorTotal;

    public Venda(int id, String data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        if (item.getQuantidade() <= item.getProduto().getQuantidade()) {
            itens.add(item);
            item.getProduto().setQuantidade(
                item.getProduto().getQuantidade() - item.getQuantidade()
            );
            calcularTotal();
        } else {
            System.out.println("Estoque insuficiente para o produto: " + item.getProduto().getNome());
        }
    }

    private void calcularTotal() {
        valorTotal = 0;
        for (ItemVenda item : itens) {
            valorTotal += item.getSubtotal();
        }
    }

    public void mostrarResumo() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Itens:");
        for (ItemVenda item : itens) {
            System.out.println("- " + item.getProduto().getNome() +
                    " | Qtd: " + item.getQuantidade() +
                    " | Subtotal: R$ " + item.getSubtotal());
        }
        System.out.println("Total da venda: R$ " + valorTotal);
    }
}

