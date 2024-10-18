package lista_exercicios.ex13;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;

    public Funcionario(int id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Cargo: " + cargo;
    }
}
