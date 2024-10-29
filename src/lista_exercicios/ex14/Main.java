// Como feirante, preciso controlar meu estoque de produtos e registrar as vendas realizadas durante
//a feira, para acompanhar meu faturamento diário.

package lista_exercicios.ex14;

public class Main {
    public static void main(String[] args) {

        Feirante feirante = new Feirante();

        feirante.adicionarProdutoAoEstoque("Banana", 6.9, 100);
        feirante.adicionarProdutoAoEstoque("Cenoura", 3.0, 50);
        feirante.adicionarProdutoAoEstoque("Pepino", 3.5, 75);

        feirante.realizarVenda("Banana", 47);
        feirante.realizarVenda("Cenoura", 5);
        feirante.realizarVenda("Pepino", 15);

        System.out.println("Faturamento diário: R$" + feirante.obterFaturamentoDiario());
    }
}

