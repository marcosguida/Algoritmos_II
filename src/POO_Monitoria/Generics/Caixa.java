package Generics;

public class Caixa<T> {
    private T conteudo;
    
    public void colocar(T item) {
        this.conteudo = item;
    }
    
    public T retirar() {
        return conteudo;
    }

    public static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.colocar("Hello");

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.colocar(42);

        System.out.println("\n");
        System.out.println("Conteúdo da caixa de texto: " + caixaTexto.retirar());
        System.out.println("Conteúdo da caixa de número: " + caixaNumero.retirar());
    }
}