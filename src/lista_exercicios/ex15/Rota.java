package lista_exercicios.ex15;

import java.util.List;

public class Rota {
    private List<Pedido> listaDePedido;

    public Rota(List<Pedido> pedidos) {
        this.listaDePedido = pedidos;
    }

    public void otimizarRotas() {
        System.out.println("Rotas otimizadas com base nos pedidos atuais.");
    }
}
