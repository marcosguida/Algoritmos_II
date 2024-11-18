package carrinho_compra;

import java.time.LocalDate;

public class Alimento extends Item {
    private String origem;

    public Alimento(String nome, double preco, LocalDate origem) {
        super(nome, preco);
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }
}
