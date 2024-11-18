package carrinho_supermercado;

import java.time.LocalDate;

class Alimento extends Item {
    LocalDate dataValidade;

    public Alimento(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean vender(int quantidade) {
        if (LocalDate.now().isBefore(dataValidade)) {
            return super.vender(quantidade);
        } else {
            System.out.println("Este alimento está vencido e não pode ser vendido.");
            return false;
        }
    }
}
