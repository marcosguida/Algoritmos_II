package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------------------------------ MENU ------------------------------");
            System.out.println("Insira o nome do funcionário (ou digite 'sair' para terminar, 'listar' para ver os funcionários ou 'demissao' para demitir um funcionário):");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;

            } else if (entrada.equalsIgnoreCase("listar")) {
                System.out.println("\nNome da Empresa: " + empresa.getNome());
                System.out.println("Lista de Funcionários:");

                for (Funcionario funcionario : empresa.getFuncionarios()) {
                    System.out.println("> " + funcionario.getNome() + "  CPF: " + funcionario.getCpf() + "  Cargo: " + funcionario.getCargo());
                }
                continue;

            } else if (entrada.equalsIgnoreCase("demissao")) {
                System.out.println("Insira o CPF do funcionário que deseja demitir:");
                String cpfParaDemitir = scanner.nextLine();
                Funcionario funcionarioParaDemitir = empresa.getFuncionarioPorCpf(cpfParaDemitir);

                if (funcionarioParaDemitir != null) {
                    empresa.demitirFuncionario(funcionarioParaDemitir);
                } else {
                    System.out.println("Funcionário com CPF " + cpfParaDemitir + " não encontrado.");
                }
                continue;
            }

            System.out.println("Insira o CPF do funcionário:");
            String cpf = scanner.nextLine();

            System.out.println("Insira o cargo do funcionário:");
            String cargo = scanner.nextLine();

            Funcionario funcionario = new Funcionario(entrada, cpf, cargo);
            empresa.contratarFuncionario(funcionario);
        }

        scanner.close();
    }
}
