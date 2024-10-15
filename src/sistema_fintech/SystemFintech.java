package sistema_fintech;

public class SystemFintech {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000, "João");
        cc.depositar(500);
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());

        ContaComLimite ccl = new ContaComLimite(500, "Maria", 1000);
        ccl.depositar(300);
        ccl.sacar(800);
        System.out.println("Saldo da Conta com Limite: " + ccl.getSaldo());

        ContaComRendimentoDiario ccrd = new ContaComRendimentoDiario(1500, "José", 0.01);
        ccrd.render();
        System.out.println("Saldo da Conta com Rendimento Diário após rendimento: " + ccrd.getSaldo());
    }
}