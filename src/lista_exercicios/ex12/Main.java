// Implemente um sistema de folha de pagamento na classe Empresa, calculando o total de salários pagos.

package lista_exercicios.ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------------------------------ EMPRESA TECH ------------------------------");
            System.out.println("1. Contratar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Demitir funcionário");
            System.out.println("4. Calcular folha de pagamento");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome do funcionário:");
                    String nome = scanner.nextLine();
                    System.out.println("Insira o CPF do funcionário:");
                    String cpf = scanner.nextLine();
                    System.out.println("Insira o cargo do funcionário:");
                    String cargo = scanner.nextLine();
                    System.out.println("Insira o salário do funcionário:");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do Scanner
                    Funcionario funcionario = new Funcionario(nome, cpf, cargo, salario);
                    empresa.contratarFuncionario(funcionario);
                    break;
                case 2:
                    System.out.println("\nNome da Empresa: " + empresa.getNome());
                    System.out.println("Lista de Funcionários:");
                    for (Funcionario func : empresa.getFuncionarios()) {
                        System.out.println("> " + func.getNome() + "  CPF: " + func.getCpf() + "  Cargo: " + func.getCargo());
                    }
                    break;
                case 3:
                    System.out.println("Insira o CPF do funcionário que deseja demitir:");
                    String cpfParaDemitir = scanner.nextLine();
                    Funcionario funcionarioParaDemitir = empresa.getFuncionarioPorCpf(cpfParaDemitir);
                    if (funcionarioParaDemitir != null) {
                        empresa.demitirFuncionario(funcionarioParaDemitir);
                    } else {
                        System.out.println("Funcionário com CPF " + cpfParaDemitir + " não encontrado.");
                    }
                    break;
                case 4:
                    double totalFolhaPagamento = empresa.calcularFolhaPagamento();
                    System.out.println("Total da folha de pagamento: R$" + totalFolhaPagamento);
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
