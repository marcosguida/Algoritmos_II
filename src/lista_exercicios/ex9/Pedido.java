package lista_exercicios.ex9;

import sistema_carrinho.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    private int numero;
    private Date data;
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(int numero, Date data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }
}
