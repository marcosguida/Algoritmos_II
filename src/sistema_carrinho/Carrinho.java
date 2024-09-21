package sistema_carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        ItemCarrinho item = new ItemCarrinho(produto, quantidade);
        itens.add(item);
    }

    public void removerProduto(Produto produto) {
        itens.removeIf(item -> item.getProduto().equals(produto));
    }

    public void atualizarQuantidade(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().equals(produto)) {
                item.quantidade = quantidade;
            }
        }
    }

    public double getTotalCarrinho() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getTotalItem();
        }
        return total;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }
}
