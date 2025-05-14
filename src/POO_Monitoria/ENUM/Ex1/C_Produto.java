package ENUM.Ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C_Produto {
    private String nome;
    private double preco;
    private LocalDate dataValidade;
    private Categoria categoria;

    public C_Produto(String nome, double preco, LocalDate dataValidade, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Produto: " + nome +
               "\nPreço: R$ " + String.format("%.2f", preco) +
               "\nData de Validade: " + dataValidade.format(formatter) +
               "\nCategoria: " + categoria;
    }
}

