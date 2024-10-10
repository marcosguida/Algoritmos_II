// Programa que pede ao usuário para inserir um número inteiro positivo.
// Realiza uma contagem regressiva desse número até zero, exibindo cada número na tela.

package contagem_regressiva;

import java.util.Scanner;

public class ContagemRegressiva {
    private int numero;

    public ContagemRegressiva(int numero) {
        this.numero = numero;
    }

    public void realizarContagemRegressiva() {
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario < 0) {
            System.out.println("Número inválido. Por favor, insira um número inteiro positivo.");
        } else {
            ContagemRegressiva contagem = new ContagemRegressiva(numeroUsuario);
            contagem.realizarContagemRegressiva();
        }

        scanner.close();
    }
}
