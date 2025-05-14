package ENUM.Ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroProdutos {
    private static final int MAX_PRODUTOS = 100;
    private static C_Produto[] produtos = new C_Produto[MAX_PRODUTOS];
    private static int contador = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar todos os produtos");
            System.out.println("3. Buscar por categoria");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    buscarPorCategoria();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarProduto() {
        if (contador >= MAX_PRODUTOS) {
            System.out.println("Limite de produtos atingido!");
            return;
        }

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer

        System.out.print("Data de fabricação (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Categorias disponíveis:");
        for (int i = 0; i < Categoria.values().length; i++) {
            System.out.println((i + 1) + ". " + Categoria.values()[i].getDescricao());
        }

        System.out.print("Escolha a categoria (número): ");
        int catOpcao = scanner.nextInt();
        scanner.nextLine(); 

        Categoria categoria = Categoria.values()[catOpcao - 1];

        produtos[contador] = new C_Produto(nome, preco, data, categoria);
        contador++;

        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (contador == 0) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.println("\n===== LISTA DE PRODUTOS =====");
        for (int i = 0; i < contador; i++) {
            System.out.println("\n----- Produto " + (i + 1) + " -----");
            System.out.println(produtos[i]);
        }
    }

    private static void buscarPorCategoria() {
        if (contador == 0) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.println("Categorias disponíveis:");
        for (int i = 0; i < Categoria.values().length; i++) {
            System.out.println((i + 1) + ". " + Categoria.values()[i].getDescricao());
        }

        System.out.print("Escolha a categoria para busca (número): ");
        int catOpcao = scanner.nextInt();


        Categoria categoriaBusca = Categoria.values()[catOpcao - 1];

        System.out.println("\n===== PRODUTOS DA CATEGORIA: " + categoriaBusca.getDescricao() + " =====");
        boolean encontrou = false;

        for (int i = 0; i < contador; i++) {
            if (produtos[i].getCategoria() == categoriaBusca) {
                System.out.println("\n----- Produto " + (i + 1) + " -----");
                System.out.println(produtos[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto encontrado nesta categoria!");
        }
    }
}
  

