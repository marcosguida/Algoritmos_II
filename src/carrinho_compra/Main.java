package carrinho_compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1) Adicionar eletrônico");
            System.out.println("2) Adicionar alimento");
            System.out.println("3) Listar itens");
            System.out.println("4) Calcular total");
            System.out.println("5) Finalizar compra");
            System.out.print("Escolha uma opção válida: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do eletrônico: ");
                        String nomeEletronico = scanner.nextLine();
                        System.out.print("Preço do eletrônico: ");
                        double precoEletronico = scanner.nextDouble();
                        scanner.nextLine();

                        if (precoEletronico < 0) {
                            throw new IllegalArgumentException("O preço não pode ser negativo.");
                        }

                        System.out.print("Marca do eletrônico: ");
                        String marcaEletronico = scanner.nextLine();
                        Eletronico eletronico = new Eletronico(nomeEletronico, precoEletronico, marcaEletronico);
                        carrinho.adicionarItem(eletronico);
                        break;

                    case 2:
                        System.out.print("Nome do alimento: ");
                        String nomeAlimento = scanner.nextLine();
                        System.out.print("Preço do alimento: ");
                        double precoAlimento = scanner.nextDouble();
                        scanner.nextLine();

                        if (precoAlimento < 0) {
                            throw new IllegalArgumentException("O preço não pode ser negativo.");
                        }

                        System.out.print("Origem do alimento: ");
                        String origemAlimento = scanner.nextLine();
                        Alimento alimento = new Alimento(nomeAlimento, precoAlimento, origemAlimento);
                        carrinho.adicionarItem(alimento);
                        break;

                    case 3:
                        carrinho.listarItens();
                        break;

                    case 4:
                        System.out.println("Total em R$: " + carrinho.calcularTotal());
                        break;

                    case 5:
                        System.out.println("Finalizando programa em 1, 2, 3, 4...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Entrada errada. Por favor, insira um número válido");
                scanner.nextLine();
            }
        }
    }
}