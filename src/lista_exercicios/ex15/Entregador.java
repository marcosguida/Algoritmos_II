package lista_exercicios.ex15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Entregador {
    private String nome;
    private Veiculo veiculo;
    private String telefone;
    private String email;
    private List<Pedido> pedidos;

    public Entregador(String nome, Veiculo veiculo, String telefone, String email) {
        this.nome = nome;
        this.veiculo = veiculo;
        this.telefone = telefone;
        this.email = email;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedido() {
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido ID: " + pedido.getId() + " | Status: " + pedido.getStatus() +
                    " | Cliente: " + pedido.getCliente().getNome() +
                    " | Produto: " + pedido.getProduto().getNome());
        }
    }

    public void otimizarRotas() {
        Rota gerenciador = new Rota(pedidos);
        gerenciador.otimizarRotas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pedido> getPedido() {
        return pedidos;
    }

    public void setPedido() {
        this.pedidos = pedidos;
    }

}