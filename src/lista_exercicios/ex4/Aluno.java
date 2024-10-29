// Crie uma classe Aluno com atributos nome, nota1, nota2 e métodos para calcular a média e verificar se o aluno foi aprovado (média maior ou igual a 7).

package lista_exercicios.ex4;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private float nota1;
    private float nota2;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float media() {
        return (nota1 + nota2) / 2;
    }

    public boolean verificacaoAprovacao() {
        return media() >= 7.0;
    }

    public void dadosAluno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Insira a primeira nota do aluno:");
        nota1 = scanner.nextFloat();

        System.out.println("Insira a segunda nota do aluno:");
        nota2 = scanner.nextFloat();

        System.out.println("Média: " + media());
        System.out.println("Aprovado: " + (verificacaoAprovacao() ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.dadosAluno();
    }

}
