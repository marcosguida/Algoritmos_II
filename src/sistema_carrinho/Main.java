package sistema_carrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n ------------------------ MENU ---------------------- \n");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Total do carrinho");
            System.out.println("4. Sair \n");
            System.out.print("--> Escolha e insira uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto(carrinho, scanner);
                    break;
                case 2:
                    removerProduto(carrinho, scanner);
                    break;
                case 3:
                    System.out.println("Total do carrinho: R$" + carrinho.getTotalCarrinho());
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("\n ATENÇÃO - Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void adicionarProduto(Carrinho carrinho, Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nome = scanner.next();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco);
        carrinho.adicionarProduto(produto, quantidade);
        System.out.println("\n OK - Produto adicionado ao carrinho.!");
    }

    private static void removerProduto(Carrinho carrinho, Scanner scanner) {
        System.out.print("Nome do produto para remover: ");
        String nome = scanner.next();
        Produto produtoParaRemover = encontrarProdutoPorNome(carrinho, nome);

        if (produtoParaRemover != null) {
            carrinho.removerProduto(produtoParaRemover);
            System.out.println("\n OK - Produto removido do carrinho.");
        } else {
            System.out.println("\n ATENÇÃO - Produto não encontrado no carrinho.");
        }
    }

    private static Produto encontrarProdutoPorNome(Carrinho carrinho, String nome) {
        for (ItemCarrinho item : carrinho.getItens()) {
            if (item.getProduto().getNome().equals(nome)) {
                return item.getProduto();
            }
        }
        return null;
    }
}
