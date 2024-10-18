package lista_exercicios.ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(1, "Ana Maria", "Caixa");
        Funcionario funcionario2 = new Funcionario(2, "Paulo Souza", "Atendente");

        ControlePonto controlePonto = new ControlePonto();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n------------ Sistema de Controle de Ponto - LOJA ALYSSON --------------");
            System.out.println("1. Registrar Entrada");
            System.out.println("2. Registrar Saída");
            System.out.println("3. Exibir Registros");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    registrarPonto(scanner, controlePonto, "Entrada", funcionario1, funcionario2);
                    break;
                case 2:
                    registrarPonto(scanner, controlePonto, "Saída", funcionario1, funcionario2);
                    break;
                case 3:
                    controlePonto.exibirRegistros();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void registrarPonto(Scanner scanner, ControlePonto controlePonto, String tipo, Funcionario funcionario1, Funcionario funcionario2) {
        System.out.println("Escolha o funcionário:");
        System.out.println("1. " + funcionario1.getNome());
        System.out.println("2. " + funcionario2.getNome());
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        Funcionario funcionarioSelecionado;
        if (escolha == 1) {
            funcionarioSelecionado = funcionario1;
        } else if (escolha == 2) {
            funcionarioSelecionado = funcionario2;
        } else {
            System.out.println("Funcionário inválido. Registro não efetuado.");
            return;
        }

        controlePonto.registrarPonto(funcionarioSelecionado, tipo);
    }
}
