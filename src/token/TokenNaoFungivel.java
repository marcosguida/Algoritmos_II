package token;

public class TokenNaoFungivel extends Token {
    private String idUnico;

    public TokenNaoFungivel(String nome, double valor, String idUnico) {
        super(nome, valor);
        this.idUnico = idUnico;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }
}