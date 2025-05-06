package POO_Monitoria.POLIMORFISMO_HERANÇA.Ex3.toString;

public class Livro {
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return "Livro: " + titulo + " por " + autor;
    }
    
    public static void main(String[] args) {
        
        Livro meuLivro = new Livro("Java para Iniciantes", "João Silva");
        
        // Quando imprimimos o objeto, o método toString() é chamado automaticamente
        System.out.println(meuLivro);
        
        String mensagem = "Estou lendo: " + meuLivro;
        System.out.println(mensagem);
    }
}