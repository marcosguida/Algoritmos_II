package revisao.escola;

public class Professor implements Pessoa {

    private String nome;
    private int idade;
    private String disciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

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
