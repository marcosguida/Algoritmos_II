package sistema_fintech;

public class ContaComLimite extends Conta {
    private double limite;

    public ContaComLimite(double saldoInicial, String titular, double limite) {
        super(saldoInicial, titular);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            double saldo = valor;
            return true;
        }
        return false;
    }
}
