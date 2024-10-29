// Crie uma classe Pessoa com os atributos: nome e idade. Crie um objeto dessa classe, atribua valores aos atributos e imprima-os no console.

package lista_exercicios.ex1;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Luiza Souza", 18);
        Pessoa pessoa2 = new Pessoa("Marcos Paulo", 20);
        Pessoa pessoa3 = new Pessoa("Carlos", 28);

        System.out.println("Pessoa 1");
        pessoa1.console();
        System.out.println("\nPessoa 2");
        pessoa2.console();
        System.out.println("\nPessoa 3");
        pessoa3.console();
    }

}
