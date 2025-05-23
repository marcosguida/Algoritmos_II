package Generics;

import java.util.List;
import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        // Com generics
        List<String> lista = new ArrayList<>();
        lista.add("CPF");
        String cpfv = lista.get(0);
        System.out.println(cpfv);
    }
}