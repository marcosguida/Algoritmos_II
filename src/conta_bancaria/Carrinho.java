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

        Alimento leite = new Alimento("Leite", 2.99, LocalDate.of(2023, 10, 15));
        Livro livro = new Livro("Dom Casmurro", 34.90);
        Eletronicos foneDeOuvido = new Eletronicos("Fone de Ouvido", 149.90);

        Carrinho carrinho = new Carrinho();

        carrinho.addItem(leite, 2);
        carrinho.addItem(livro, 1);
        carrinho.addItem(foneDeOuvido, 1);

        for (Item item : carrinho.produtos) {
            System.out.println(item.nome);
        }
    }
}