package classes_abstratas;

public abstract class ContaAbstrata{
    
    private String numero;
    private double saldo;

    public abstract void debitar (double valor);

    public ContaAbstrata (String numero){
        this.numero = numero;
        saldo = 0.0;
    }

    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}

class Conta extends ContaAbstrata{

    public void debitar (double valor){
            if (valor <= getSaldo()){
                setSaldo(getSaldo() - valor);
            } else{
                System.out.println("Saldo Insuficiente");
            }
        }

    public Conta (String numero){
        super(numero);
    }

}


