package conta_bancaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public boolean addItem(Item item, int quantidade) {
        if (item instanceof Alimento) {
            Alimento alimento = (Alimento) item;
            if (alimento.vender(quantidade)) {
                for (int i = 0; i < quantidade; i++) {
                    produtos.add(alimento);
                }
                return true;
            }
        } else {
            for (int i = 0; i < quantidade; i++) {
                produtos.add(item);
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Item alimento1 = new Alimento("Energético Power", 10.49, LocalDate.of(2024, 10, 15));
        Item livro1 = new Livro("O Processo", 84.90);
        Item eletronicos = new Eletronicos("Fone de Ouvido TWS JBL", 69.90);

        Carrinho carrinho = new Carrinho();

        carrinho.addItem(alimento1, 2);
        carrinho.addItem(livro1, 1);
        carrinho.addItem(eletronicos, 1);

        for (Item item : carrinho.produtos) {
            System.out.println(item.getNome());
        }
    }
}
