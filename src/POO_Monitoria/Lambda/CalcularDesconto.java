package Lambda;

import java.util.function.Function;

public class CalcularDesconto {
    public static void main(String[] args) {

        Function<Double, Double> descontoVip = preco -> preco * 0.85; // 15% desconto
        Function<Double, Double> descontoNormal = preco -> preco * 0.95; // 5% desconto
        
        double precoOriginal = 100.0;
        
        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Cliente VIP: R$ " + descontoVip.apply(precoOriginal));
        System.out.println("Cliente normal: R$ " + descontoNormal.apply(precoOriginal));
        
        Function<Double, Double> descontoComTaxa = descontoVip.andThen(valor -> valor + 5.0);
        System.out.println("VIP + taxa entrega: R$ " + descontoComTaxa.apply(precoOriginal));
    }
}
