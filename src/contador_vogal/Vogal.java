
// Programa que lê uma palavra inserida pelo usuário e conta quantas vogais ela contém.

package contador_vogal;

import java.util.Scanner;

public class Vogal {
    private String palavra;

    public Vogal(String palavra) {
        this.palavra = palavra;
    }

    public int contarVogais() {
        int contagem = 0;
        String vogais = "aeiouAEIOU";

        for (char c : palavra.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                contagem++;
            }
        }

        return contagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavraUsuario = scanner.nextLine();

        Vogal contador = new Vogal(palavraUsuario);
        int numeroDeVogais = contador.contarVogais();

        System.out.println("A palavra '" + palavraUsuario + "' contém " + numeroDeVogais + " vogais.");

        scanner.close();
    }
}
