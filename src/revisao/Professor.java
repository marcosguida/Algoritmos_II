package revisao;

public class Professor extends Pessoa {
    private double salario;
    private String especialidade;

    public Professor(String nome, int idade, double salario, String especialidade) {
        super(nome, idade); // Chama o construtor da classe Pessoa para inicializar nome e idade
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário: " + salario);
        System.out.println("Especialidade: " + especialidade);
    }
}
