package Ex3.equals;

public class Conta {
    private String numeroConta;
    private String agencia;
    private double saldo;
    
    public Conta(String numeroConta, String agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    // Getters e setters omitidos para brevidade
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Conta outraConta = (Conta) obj;
        
        // Duas contas são consideradas iguais se tiverem mesmo número e agência
        return numeroConta.equals(outraConta.numeroConta) && 
               agencia.equals(outraConta.agencia);
    }
    
    @Override
    public int hashCode() {
        int result = numeroConta.hashCode();
        result = 31 * result + agencia.hashCode();
        return result;
    }
    
    public static void main(String[] args) {
        Conta conta1 = new Conta("12345-6", "0001", 1000.0);
        Conta conta2 = new Conta("12345-6", "0001", 500.0);
        Conta conta3 = new Conta("98765-4", "0001", 1000.0);
        
        System.out.println("conta1 equals conta2: " + conta1.equals(conta2)); // true (mesmo número e agência)
        System.out.println("conta1 equals conta3: " + conta1.equals(conta3)); // false (número diferente)
    }
}
