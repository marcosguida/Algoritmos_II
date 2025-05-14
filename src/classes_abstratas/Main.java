package classes_abstratas;

public class Main {
    public static void main(String[] args) {
    Conta conta = new Conta("12345");
    conta.setSaldo(1000.0);
    System.out.println("Saldo: " + conta.getSaldo());

    
    conta.debitar(2000);
    System.out.println("Saldo após débito: " + conta.getSaldo());
    
}
}

    

