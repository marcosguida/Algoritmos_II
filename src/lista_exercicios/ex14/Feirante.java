package lista_exercicios.ex14;

public class Feirante {
    private Estoque estoque;
    private double faturamentoDiario;

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public double getFaturamentoDiario() {
        return faturamentoDiario;
    }

    public void setFaturamentoDiario(double faturamentoDiario) {
        this.faturamentoDiario = faturamentoDiario;
    }

    public Feirante() {
        estoque = new Estoque();
        faturamentoDiario = 0.0F;
    }

    public void adicionarProdutoAoEstoque(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        estoque.adicionarProduto(produto);
    }

    public void realizarVenda(String nomeProduto, int quantidade) {
        Produto produto = estoque.obterProduto(nomeProduto);
        if (produto != null) {
            Venda venda = new Venda(produto, quantidade);
            faturamentoDiario += venda.getPrecoTotal();
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public double obterFaturamentoDiario() {
        return faturamentoDiario;
    }
}
