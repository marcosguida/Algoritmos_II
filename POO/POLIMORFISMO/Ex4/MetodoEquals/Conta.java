package Ex4.MetodoEquals;

public class Conta {
    
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Conta(String numeroConta, String agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Conta outraConta = (Conta) obj;
        return numeroConta.equals(outraConta.numeroConta) && agencia.equals(outraConta.agencia);
    }

    @Override
    public int hashCode() {
        int result = numeroConta.hashCode();
        result = 31 * result + agencia.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta ("342", "001", 1000.0);
        Conta conta2 = new Conta ("34223", "72341", 2000.0);
        Conta conta3 = new Conta ("342", "001", 2000.0);

        System.out.println("\n \n");
        System.out.println("Contas iguais? " + conta3.equals(conta2));
        System.out.println("\n");
    
    }
}
