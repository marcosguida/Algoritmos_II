

// Algoritmo para ler 3 números inteiros e imprimir em ordem crescente

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = scan.nextInt();

		ordemCrescente(num1, num2, num3);

	}
 
	public static void ordemCrescente(int num1, int num2, int num3) {
		int aux = 0;
		if (num1 > num2) {
			aux = num1;
			num1 = num2; 
			num2 = aux; 
		}

		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux; 
		}

		if (num1 > num3) {
			aux = num1;
			num1 = num3;
			num3 = aux; 
		}

		System.out.println("A ordem crescente é: " + num1 + ", " + num2 + ", " + num3);

	}

}

