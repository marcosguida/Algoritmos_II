package lista_exercicios.ex15;

public class Produto {
    private String nome;
    private int quantidade;
    private double peso;

    public Produto(String nome, int quantidade, double peso) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}