package POO_Monitoria.ENUM.Ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C_Produto {
    private String nome;
    private double preco;
    private LocalDate dataFabricacao;
    private Categoria categoria;

    public C_Produto(String nome, double preco, LocalDate dataFabricacao, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.dataFabricacao = dataFabricacao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Produto: " + nome +
               "\nPreço: R$ " + String.format("%.2f", preco) +
               "\nData de Fabricação: " + dataFabricacao.format(formatter) +
               "\nCategoria: " + categoria.getDescricao();
    }
}

