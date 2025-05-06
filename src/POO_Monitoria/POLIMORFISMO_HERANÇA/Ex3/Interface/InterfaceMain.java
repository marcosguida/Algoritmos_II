package POO_Monitoria.POLIMORFISMO_HERANÇA.Ex3.Interface;

// Interface
interface Pagavel {
    double calcularPagamento();
    
    // Método default (a partir do Java 8)
    default void exibirPagamento() {
        System.out.println("Pagamento: R$" + calcularPagamento());
    }
}

// Classes que implementam a interface
class Funcionario implements Pagavel {
    private double salario;
    
    public Funcionario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double calcularPagamento() {
        return salario;
    }
}

class Fatura implements Pagavel {
    private double valor;
    private double desconto;
    
    public Fatura(double valor, double desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }
    
    @Override
    public double calcularPagamento() {
        return valor - (valor * desconto);
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Pagavel funcionario = new Funcionario(3000);
        Pagavel fatura = new Fatura(1000, 0.1);
        
        funcionario.exibirPagamento(); // Pagamento: R$3000.0
        fatura.exibirPagamento(); // Pagamento: R$900.0
    }
}
