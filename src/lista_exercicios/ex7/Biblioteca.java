package lista_exercicios.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca() {

        livros = new ArrayList<>();
        adicionarLivro(new Livro("O Poder do Hábito", "Charles Duhigg", 2012));
        adicionarLivro(new Livro("Os princípios da filosofia de Santo Tomás de Aquino", "O.p. Fr. Édouard Hugon", 2023));
        adicionarLivro(new Livro("Pequena via de Santa Teresinha: Caminho de Cura e Santidade", "r André L. Botelho de Andrade ", 2021));
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

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }


    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu da Biblioteca:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Exibir Todos os Livros");
            System.out.println("4. Buscar Livro pelo Título");
            System.out.println("5. Sair");
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
                    buscarLivroPorTituloUsuario(scanner);
                    break;
                case 5:
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
                System.out.println("NÃO FOI POSSÍVEL REMOVER.");
            }
        } else {
            System.out.println("LIVRO NÃO ENCONTRADO.");
        }
    }

    private void buscarLivroPorTituloUsuario(Scanner scanner) {
        System.out.println("Digite o título do livro que deseja buscar:");
        scanner.nextLine();
        String titulo = scanner.nextLine();

        Livro livroEncontrado = buscarLivroPorTitulo(titulo);

        if (livroEncontrado != null) {
            System.out.println("Livro encontrado:");
            livroEncontrado.exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.menu();
    }
}
