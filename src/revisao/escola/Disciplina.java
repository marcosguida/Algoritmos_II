package revisao.escola;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professorResponsavel;

    public Disciplina(String nome, int cargaHoraria, Professor professorResponsavel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public void exibirInformacoes() {
        System.out.println("Nome da Disciplina: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Professor Responsável: " + professorResponsavel.getNome());
    }
}

class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Fernando Matias", 35, "Sistemas Digitais II");
        Disciplina disciplina = new Disciplina("Sistemas Digitais II", 80, professor);
        disciplina.exibirInformacoes();
        }
}
