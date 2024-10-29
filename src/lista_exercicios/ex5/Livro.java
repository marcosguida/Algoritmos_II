// Crie uma classe Livro com atributos titulo, autor e anoPublicacao. Adicione um método exibirDetalhes().

package lista_exercicios.ex5;

public class Livro {

    private String titulo, autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public static void main(String[] args) {
        Livro livro = new Livro("O Poder do Hábito", "Charles Duhigg", 2012);
        Livro livro1 = new Livro("Os princípios da filosofia de Santo Tomás de Aquino", "O.p. Fr. Édouard Hugon", 2023);
        Livro livro2 = new Livro("Pequena via de Santa Teresinha: Caminho de Cura e Santidade", "André L. Botelho de Andrade ", 2021);

        livro.exibirDetalhes();
        System.out.println("\n");

        livro1.exibirDetalhes();
        System.out.println("\n");

        livro2.exibirDetalhes();
        System.out.println("\n");
    }

}

