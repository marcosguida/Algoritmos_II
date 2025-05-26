package Collections;

// AgrupadorPalavras.java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupadorPalavras {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList(
            "casa", "carro", "bicicleta", "moto", "avião", 
            "barco", "trem", "ônibus", "pé", "skate"
        );
        
        System.out.println("\n Palavras: " + palavras);
        
        // Contar palavras por tamanho
        Map<Integer, Long> contagemPorTamanho = palavras.stream()
            .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        
        System.out.println("\nContagem por tamanho:");
        contagemPorTamanho.forEach((tamanho, count) -> 
            System.out.println(tamanho + " letras: " + count + " palavra(s)"));
        
        // Juntar palavras grandes em uma string
        String palavrasGrandes = palavras.stream()
            .filter(p -> p.length() > 4)
            .collect(Collectors.joining(", ", "Palavras grandes: [", "] \n"));
        
        System.out.println("\n" + palavrasGrandes);
    }
}
