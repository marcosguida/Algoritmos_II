package lista_exercicios.ex15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entregador entregador = new Entregador("João", new Veiculo("Moto"), "99999-9999", "joao@email.com");

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Adicionar Pedido");
            System.out.println("2. Listar Pedido");
            System.out.println("3. Otimizar Rotas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\n");

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Telefone do cliente: ");
                    String telefoneCliente = scanner.nextLine();
                    System.out.print("Endereço do cliente: ");
                    String enderecoCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, telefoneCliente, enderecoCliente);

                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Quantidade do produto: ");
                    int quantidadeProduto = scanner.nextInt();
                    System.out.print("Preco unitario do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    Produto produto = new Produto(nomeProduto, quantidadeProduto, preco);

                    System.out.print("Endereço de entrega: ");
                    String enderecoEntrega = scanner.nextLine();

                    Pedido pedido = new Pedido(entregador.getPedido().size() + 1, cliente, produto, enderecoEntrega);
                    entregador.adicionarPedido(pedido);
                    System.out.println("Pedido adicionado com sucesso!");
                    break;

                case 2:
                    entregador.listarPedido();
                    break;

                case 3:
                    entregador.otimizarRotas();
                    break;

                case 4:
                    System.out.println("Finalizando sessão do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}