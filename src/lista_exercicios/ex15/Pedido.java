package lista_exercicios.ex15;

public class Pedido {
    private int id;
    private Cliente cliente;
    private Produto produto;
    private String enderecoEntrega;
    private String status;

    public Pedido(int id, Cliente cliente, Produto produto, String enderecoEntrega) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.enderecoEntrega = enderecoEntrega;
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}