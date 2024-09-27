package lista_exercicios.ex8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    private int numero;
    private Date data;
    private List<Produto> produtos;

    public Pedido(int numero, Date data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public static void main(String[] args) {

        Produto produto1 = new Produto("Queijo Minas", 15.50);
        Produto produto2 = new Produto("Café Paraiso", 20.10);
        Produto produto3 = new Produto("Cacau ", 40.00);

        Pedido pedido = new Pedido(1, new Date());

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());
    }
}