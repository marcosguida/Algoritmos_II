package revisao.escola;

public class Aluno implements Pessoa {
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome + " | Idade: " + idade + " | Curso: " + curso);
    }
}

