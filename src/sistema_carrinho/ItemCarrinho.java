package sistema_carrinho;

public class ItemCarrinho {
    public int quantidade;
    private Produto produto;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalItem() {
        return produto.getPreco() * quantidade;
    }
}
