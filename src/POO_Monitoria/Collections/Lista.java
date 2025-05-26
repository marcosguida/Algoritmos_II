package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    private String nome;
    private String cpf;
    private int idade;

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("R");
        lista.add("E");
        lista.add("D");
        lista.add("C");

        // Não ordenado

        for (String valor : lista){
            System.out.println('\n');
            System.out.println(valor);
        }

        // Ordenado 
        Collections.sort(lista);
        for (String valor : lista){
            System.out.println('\n');
            System.out.println(valor);
        }
        
    }
    
}
