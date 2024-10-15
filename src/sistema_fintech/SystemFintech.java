package sistema_fintech;

public class SystemFintech {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(84140, "João");
        cc.depositar(760);
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());

        ContaComLimite ccl = new ContaComLimite(570, "Maria", 4000);
        ccl.depositar(305);
        ccl.sacar(700);
        System.out.println("Saldo da Conta com Limite: " + ccl.getSaldo());

        ContaComRendimentoDiario ccrd = new ContaComRendimentoDiario(1600, "José", 0.04);
        ccrd.render();
        System.out.println("Saldo da Conta com Rendimento Diário após rendimento: " + ccrd.getSaldo());
    }
}

