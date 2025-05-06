package POO_Monitoria.POLIMORFISMO.Ex3.toString;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto(String nome, String codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
        
    @Override
    public String toString() {
        return "Produto [" +
               "Nome: " + nome + ", " +
               "Código: " + codigo + ", " + 
               // Formata o preço para duas casas decimais 
               // e adiciona o símbolo de moeda (R$)
               "Preço: R$ " + String.format("%.2f", preco) + ", " +
               "Estoque: " + quantidadeEstoque + "]";
    }
    
    public static void main(String[] args) {
        System.out.println("\n \n");
        Produto celular = new Produto("Smartphone X", "SM001", 1299.99, 15);
        System.out.println(celular);
        System.out.println("\n \n");
    }
}

