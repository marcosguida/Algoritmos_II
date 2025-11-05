package Generics;

import java.util.List;
import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        // Sem generics
        // Com generics
        List<String> lista = new ArrayList<>();
        lista.add("041456767");
        String cpfv = lista.get(0);
        System.out.println(cpfv);
    }
}
