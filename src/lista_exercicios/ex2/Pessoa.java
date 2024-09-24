package lista_exercicios.ex2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void console(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void cumprimentar() {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao nosso sistema");
    }
}