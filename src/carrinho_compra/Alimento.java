package carrinho_compra;

public class Alimento extends Item {
    private String origem;

    public Alimento(String nome, double preco, String origem) {
        super(nome, preco);
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }
}
