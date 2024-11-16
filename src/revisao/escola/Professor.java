package revisao.escola;

public class Professor implements Pessoa {
    private String nome;
    private int idade;
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Professor: " + nome + " | Idade: " + idade + " | Disciplina: " + disciplina);
    }
}
