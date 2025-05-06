package POO.ENUM.Ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<C_Produto> produtos = new ArrayList<>();

        System.out.println("=== CADASTRO DE PRODUTOS ===");

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar todos os produtos");
            System.out.println("3 - Buscar produtos por categoria");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarProduto(scanner, produtos);
                case 2 -> listarProdutos(produtos);
                case 3 -> buscarPorCategoria(scanner, produtos);
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarProduto(Scanner scanner, ArrayList<C_Produto> produtos) {
        System.out.println("\n== Cadastro de Produto ==");

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: R$ ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Data de validade (dd/mm/aaaa): ");
        String dataStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataStr, formatter);

        System.out.println("Categorias disponíveis:");
        for (Categoria cat : Categoria.values()) {
            System.out.println(cat.ordinal() + " - " + cat);
        }

        System.out.print("Escolha a categoria: ");
        int catOpcao = scanner.nextInt();
        scanner.nextLine();

        if (catOpcao < 0 || catOpcao >= Categoria.values().length) {
            System.out.println("Categoria inválida.");
            return;
        }

        Categoria categoria = Categoria.values()[catOpcao];

        produtos.add(new C_Produto(nome, preco, data, categoria));
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos(ArrayList<C_Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("\nNão há produtos cadastrados.");
            return;
        }

        System.out.println("\n=== LISTA DE PRODUTOS ===");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("\n--- Produto " + (i + 1) + " ---");
            System.out.println(produtos.get(i));
        }
    }

    private static void buscarPorCategoria(Scanner scanner, ArrayList<C_Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("\nNão há produtos cadastrados.");
            return;
        }

        System.out.println("\nCategorias disponíveis:");
        for (Categoria cat : Categoria.values()) {
            System.out.println(cat.ordinal() + " - " + cat);
        }

        System.out.print("Escolha a categoria para busca: ");
        int catOpcao = scanner.nextInt();
        scanner.nextLine();

        if (catOpcao < 0 || catOpcao >= Categoria.values().length) {
            System.out.println("Categoria inválida.");
            return;
        }

        Categoria categoriaBusca = Categoria.values()[catOpcao];

        System.out.println("\n=== PRODUTOS DA CATEGORIA " + categoriaBusca + " ===");
        boolean encontrou = false;

        for (C_Produto produto : produtos) {
            if (produto.getCategoria() == categoriaBusca) {
                System.out.println("\n" + produto);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto encontrado nessa categoria.");
        }
    }
}
