import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList é uma implementação da interface List que usa um array dinâmico
 */
public class Exemplo1 {
    public static void main(String[] args) {

        List<String> linguagens = new ArrayList<>();
        
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("C#");
        
        System.out.println("Lista de linguagens: " + linguagens);
        
        System.out.println("Linguagem na posição 1: " + linguagens.get(1));
        
        linguagens.set(2, "TypeScript");
        System.out.println("Após modificação: " + linguagens);
        
        System.out.println("Contém Python? " + linguagens.contains("Python"));
        
        // Remover elementos
        linguagens.remove("C#");
        System.out.println("Após remover C#: " + linguagens);
        
        // Remover pelo índice
        linguagens.remove(0); 
        System.out.println("Após remover o primeiro elemento: " + linguagens);
        
        // Imprimindo o tamanho da lista
        System.out.println("Tamanho da lista: " + linguagens.size());
        
        // Verificando se a lista está vazia
        System.out.println("A lista está vazia? " + linguagens.isEmpty());
        
        // Iterando sobre a lista
        System.out.println("\nIterando sobre a lista:");
        for (String linguagem : linguagens) {
            System.out.println("- " + linguagem);
        }
        
        // Usando lambda
        System.out.println("\nUsando lambda para iterar:");
        linguagens.forEach(linguagem -> System.out.println("- " + linguagem));
        
        // Limpando a lista
        linguagens.clear();
        System.out.println("\nApós limpar a lista: " + linguagens);
        System.out.println("Tamanho: " + linguagens.size());
    }
}