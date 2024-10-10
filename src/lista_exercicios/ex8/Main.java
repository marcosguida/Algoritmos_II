package lista_exercicios.ex8;

import java.util.Date;

public class Main {
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
