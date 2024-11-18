package conta_bancaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Carrinho {
    List<Item> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public boolean addItem(Item item, int quantidade) {
        if (item instanceof Alimento) {
            Alimento alimento = (Alimento) item;
            if (alimento.vender(quantidade)) {
                produtos.add(item);
                return true;
            }
        } else if (item instanceof Item) {
            produtos.add(item);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Alimento leite = new Alimento("Energetico Power", 10.49, LocalDate.of(2024, 10, 15));
        Livro livro = new Livro("O processo", 84.90);
        Eletronicos foneDeOuvido = new Eletronicos("Fone de Ouvido TWS JBL", 69.90);

        Carrinho carrinho = new Carrinho();

        carrinho.addItem(2);
        carrinho.addItem(1);
        carrinho.addItem(1);

        for (Item item : carrinho.produtos) {
            System.out.println(item.nome);
        }
    }
}
