package Lambda;

import java.util.Arrays;
import java.util.List;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

public class ProdutoLambda {

    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
            new Produto("Geladeira", 2000),
            new Produto("Fogão", 1500),
            new Produto("Microondas", 800),
            new Produto("Liquidificador", 300),
            new Produto("Batedeira", 400)
        );

        System.out.println("Produtos não ordenados:");
        produtos.forEach(p -> System.out.println(p));
        System.out.println("\n");


        System.out.println("Produtos ordenados:");
        produtos.stream()
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .forEach(p -> System.out.println(p));
        System.out.println("\n");

        System.out.println("Produtos ordenados por preço em ordem decrescente:");
        produtos.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPreco(), p1.getPreco()))
                .forEach(p -> System.out.println(p));
        System.out.println("\n");
    


    }
}
