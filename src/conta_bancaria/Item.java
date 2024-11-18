package conta_bancaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Item {
    String nome;
    double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public boolean vender(int quantidade) {
        return true;
    }
}
