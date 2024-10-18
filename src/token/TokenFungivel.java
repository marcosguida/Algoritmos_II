package token;

public class TokenFungivel extends Token {
    private int quantidade;

    public TokenFungivel(String nome, double valor, int quantidade) {
        super(nome, valor);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}