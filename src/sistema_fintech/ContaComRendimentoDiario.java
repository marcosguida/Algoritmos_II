package sistema_fintech;

public class ContaComRendimentoDiario extends Conta {
    private double taxaRendimento;

    public ContaComRendimentoDiario(double saldoInicial, String titular, double taxaRendimento) {
        super(saldoInicial, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void render() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }
}
