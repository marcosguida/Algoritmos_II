package lista_exercicios.ex10;

import sistema_carrinho.Produto;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("Salon Marques", "98765432198"); // CPF sem pontos e traço para facilitar

            Produto produto1 = new Produto("Monitor Portatil Led Full HD Samsung", 789.99);
            Produto produto2 = new Produto("Camisa polo tam G", 299.99);
            Produto produto3 = new Produto("Fone de ouvido Apple", 319.99);

            Pedido pedido = new Pedido(1031, new Date(), cliente);

            pedido.adicionarProduto(produto1);
            pedido.adicionarProduto(produto2);
            pedido.adicionarProduto(produto3);

            System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());

            System.out.println("Número do pedido: " + pedido.getNumero());
            System.out.println("Data do pedido: " + pedido.getData());
            System.out.println("Cliente: " + pedido.getCliente().getNome());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}