package lista_exercicios.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public boolean removerLivro(Livro livro) {
        return livros.remove(livro);
    }

    public void exibirLivros() {
        for (Livro livro : livros) {

            System.out.println("\n");
            System.out.println("---------------");
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
            System.out.println("---------------");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu da Biblioteca:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Exibir Todos os Livros");
            System.out.println("4. Finalizar programa:");
            System.out.print("Escolha uma das opções: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarLivroUsuario(scanner);
                    break;
                case 2:
                    removerLivroUsuario(scanner);
                    break;
                case 3:
                    exibirLivros();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private void adicionarLivroUsuario(Scanner scanner) {
        System.out.println("Digite o título do livro:");
        scanner.nextLine();
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação do livro:");
        int anoPublicacao = scanner.nextInt();

        Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
        adicionarLivro(novoLivro);
        System.out.println("LIVRO ADICIONADO COM SUCESSO!");
    }

    private void removerLivroUsuario(Scanner scanner) {
        System.out.println("Digite o título do livro que deseja remover:");
        scanner.nextLine();
        String titulo = scanner.nextLine();

        Livro livroARemover = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livroARemover = livro;
                break;
            }
        }

        if (livroARemover != null) {
            boolean removido = removerLivro(livroARemover);
            if (removido) {
                System.out.println("LIVRO REMOVIDO COM SUCESSO!");
            } else {
                System.out.println("NOÃ FOI POSSIVEL REMOVER.");
            }
        } else {
            System.out.println("LIVRO NAO ENCONTRADO.");
        }
    }

}


