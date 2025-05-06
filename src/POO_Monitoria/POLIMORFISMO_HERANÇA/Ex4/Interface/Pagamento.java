package POO_Monitoria.POLIMORFISMO_HERANÇA.Ex4.Interface;

interface Pagamento {
    
    double calculoPagamento();

    default void exibirPagamento(){
        System.out.println("O valor do pagamento é: " + calculoPagamento());
    }
}

class Funcionario implements Pagamento {

    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculoPagamento() {
        return salario * 1.2;
    }

}


