package Ex2;

// SUPERCLASSE
class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calculoSalario() {
        return salarioBase;
    }

    public void exibirFuncionario() {
        System.out.println("Funcionario: " + nome + ", CPF: " + cpf + ", Salario Base: " + salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

// Classe Filha - Subclasse - Classe que herda de Funcionario
class Desenvolvedor extends Funcionario {

    private String linguagemProg;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemProg) {
        super(nome, cpf, salarioBase);
        this.linguagemProg = linguagemProg;
    }
   
    // sobrescrita 
    @Override
    public double calculoSalario() {
        return getSalarioBase() * 1.2;
    }

    @Override
    public void exibirFuncionario() {
        super.exibirFuncionario();
        System.out.println("Linguagem de Programacao: " + linguagemProg);
    }

    public String getLinguagemProg() {
        return linguagemProg;
    }

    public void setLinguagemProg(String linguagemProg) {
        this.linguagemProg = linguagemProg;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marcos", "214234235", 100.00);
        Funcionario desenvolvedor = new Desenvolvedor("Lucas", "123456789", 200.00, "Java");

        funcionario.exibirFuncionario();
        System.out.println("Salario: " + funcionario.calculoSalario());

        desenvolvedor.exibirFuncionario();
        System.out.println("Salario: " + desenvolvedor.calculoSalario());
    }
}
