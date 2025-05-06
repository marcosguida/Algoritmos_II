package POO.ENUM.Ex2;

public enum Categoria {
    ELETRONICO("Eletrônico"),
    ALIMENTO("Alimento"),
    VESTUARIO("Vestuário"),
    LIVRO("Livro");
    
    private String descricao;
    
    Categoria(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}

