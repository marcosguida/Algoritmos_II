package lista_exercicios.ex3;

import java.util.Scanner;

public class Calculadora {

    private Scanner scanner;

    public Calculadora() {
        scanner = new Scanner(System.in);
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida!");
        }
        return a / b;
    }

    public void operacao() {
        System.out.println("Insira o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Sair");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado da soma: " + somar(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + subtrair(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + multiplicar(numero1, numero2));
                break;
            case 4:
                try {
                    System.out.println("Resultado da divisão: " + dividir(numero1, numero2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } break;
            case 0: break;
            default:
                System.out.println("Escolha inválida!");
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.operacao();
    }

}

