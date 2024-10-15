package sistema_fintech;

public class Conta {
    private double saldo;
    private String titular;

    public Conta(double saldoInicial, String titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
