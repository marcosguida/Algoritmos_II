package POO_Monitoria.POLIMORFISMO.Ex4.MetodotoString;

public class Livro {

    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override 
    public String toString(){
        return "Título: " + titulo + ", Autor: " + autor;
    }

    public static void main(String[] args) {

        System.out.println("\n \n");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");
        System.out.println(livro.toString());
        System.out.println("\n");
    }
}