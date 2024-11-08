package revisao;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}

class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcos Julius", 30, "123.456.789-10");
        Pessoa pessoa2 = new Pessoa("Campos Sales", 25, "123.456.789-10");

        pessoa1.exibirInformacoes();

        if (pessoa1.equals(pessoa2)) {
            System.out.println("As pessoas são iguais (mesmo CPF).");
        } else {
            System.out.println("As pessoas são diferentes.");
        }
    }
}
