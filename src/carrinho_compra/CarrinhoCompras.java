package carrinho_compra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens;

    public CarrinhoCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void listarItens() {
        System.out.println("Itens no carrinho:");
        for (Item item : itens) {
            System.out.println(item.getNome() + " - R$" + item.getPreco());
        }
    }
}