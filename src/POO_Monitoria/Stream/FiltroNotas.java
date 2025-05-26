package Stream;

import java.util.Arrays;
import java.util.List;

public class FiltroNotas {
    public static void main(String[] args) {
        List<Double> notas = Arrays.asList(8.5, 6.0, 9.2, 5.5, 7.8, 4.0, 8.0, 9.5, 6.5);
        
        System.out.println("\n");
        System.out.println("Todas as notas: " + notas);
        
        // Filtro de aprovados (nota >= 7.0)
        List<Double> aprovados = notas.stream()
            .filter(nota -> nota >= 7.0)
            .sorted()
            .toList();
        
        System.out.println("Notas dos aprovados: " + aprovados);
        
        // Média dos aprovados
        double mediaAprovados = notas.stream()
            .filter(nota -> nota >= 7.0)
            .mapToDouble(Double::doubleValue)
            .average()
            .orElse(0.0);
        
        System.out.println("Média dos aprovados: " + String.format("%.2f", mediaAprovados));
        
        // Alunos reprovados
        long reprovados = notas.stream()
            .filter(nota -> nota < 7.0)
            .count();
        
        System.out.println("Quantidade de reprovados: " + reprovados + "\n");

    }
}
