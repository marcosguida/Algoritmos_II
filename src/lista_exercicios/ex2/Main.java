package lista_exercicios.ex2;

// Adicionar um metodo cumprimentar() à classe Pessoa que imprime uma mensagem de saudação usando o nome.

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Luiza Souza", 18);
        Pessoa pessoa2 = new Pessoa("Marcos Paulo", 20);
        Pessoa pessoa3 = new Pessoa("Carlos", 29);

        System.out.println("Pessoa 1");
        pessoa1.console();
        pessoa1.cumprimentar();
        System.out.println("\nPessoa 2");
        pessoa2.console();
        pessoa2.cumprimentar();
        System.out.println("\nPessoa 3");
        pessoa3.console();
        pessoa3.cumprimentar();
    }
}