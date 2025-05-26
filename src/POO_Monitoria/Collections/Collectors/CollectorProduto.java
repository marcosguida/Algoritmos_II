package Collections.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorProduto {
    
    static class Produto {
        private String nome;
        private String categoria;
        private double preco;
        private int estoque;
        
        public Produto(String nome, String categoria, double preco, int estoque) {
            this.nome = nome;
            this.categoria = categoria;
            this.preco = preco;
            this.estoque = estoque;
        }
        
        public String getNome() { return nome; }
        public String getCategoria() { return categoria; }
        public double getPreco() { return preco; }
        public int getEstoque() { return estoque; }
        
        @Override
        public String toString() {
            return String.format("Produto{nome='%s', categoria='%s', preco=%.2f, estoque=%d}", 
                               nome, categoria, preco, estoque);
        }
    }
    
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Notebook", "Eletrônicos", 2500.00, 10),
            new Produto("Mouse", "Eletrônicos", 50.00, 25),
            new Produto("Mesa", "Móveis", 300.00, 5),
            new Produto("Armário", "Móveis", 800.00, 3),
            new Produto("Teclado", "Eletrônicos", 80.00, 20)
        );
        
        System.out.println("\n");
        System.out.println("---------- ESTOQUE DE PRODUTOS AMAZON ----------\n");
        
        // 1. Agrupamento por categoria
        System.out.println("1. Agrupamento por categoria:");

        Map<String, List<Produto>> porCategoria = produtos.stream()
            .collect(Collectors.groupingBy(Produto::getCategoria));
        
        porCategoria.forEach((categoria, listaProdutos) -> {
            System.out.println(categoria + ": " + listaProdutos.size() + " produtos");
            listaProdutos.forEach(p -> System.out.println("  - " + p.getNome()));
        });
        
        
        // 2. Produtos com baixo estoque
        System.out.println("\n2. Relatório de estoque baixo (menos de 10 unidades):");

        String relatorioEstoque = produtos.stream()
            .filter(p -> p.getEstoque() < 10)
            .collect(Collectors.collectingAndThen(
                Collectors.groupingBy(
                    Produto::getCategoria,
                    Collectors.mapping(
                        p -> "\n" + p.getNome() + " (" + p.getEstoque() + " unidades)",
                        Collectors.joining(", ")
                    )
                ),
                map -> {
                    if (map.isEmpty()) {
                        return "Todos os produtos têm estoque adequado!";
                    }
                    return map.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .collect(Collectors.joining("\n"));
                }
            ));
        
        System.out.println(relatorioEstoque);
        System.out.println("\n");
    }
}
