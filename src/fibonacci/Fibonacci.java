// Programa que exibe os primeiros N números da sequência de Fibonacci, onde N é fornecido pelo usuário.

package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public void exibirSequenciaFibonacci() {
        int primeiro = 0, segundo = 1, proximo;

        System.out.print("Os primeiros " + n + " números da sequência de Fibonacci são: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(primeiro + ", ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (número de termos da sequência de Fibonacci): ");
        int n = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci(n);
        fibonacci.exibirSequenciaFibonacci();

        scanner.close();
    }
}
