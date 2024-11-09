package revisao;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcos Julius", 30, "144.446.789-10");
        Pessoa pessoa2 = new Pessoa("Campos Sales", 25, "072.343.999-12");

        Aluno aluno1 = new Aluno("Luana Pires", 20, "923856");
        Aluno aluno2 = new Aluno("Sergio Maia", 22, "789012");

        Professor professor1 = new Professor("Carlos Roberto", 45, 8000.0, "Matemática");
        Professor professor2 = new Professor("Lívia Rocha", 35, 7500.0, "Química");

        System.out.println("----------------------- CLASSE PROFESSOR -------------------");
        System.out.println("Professor 1:");
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Idade: " + professor1.getIdade());
        System.out.println("Salário: " + professor1.getSalario());
        System.out.println("Especialidade: " + professor1.getEspecialidade());

        System.out.println("\nProfessor 2:");
        System.out.println("Nome: " + professor2.getNome());
        System.out.println("Idade: " + professor2.getIdade());
        System.out.println("Salário: " + professor2.getSalario());
        System.out.println("Especialidade: " + professor2.getEspecialidade());
        System.out.println("\n");

        System.out.println("----------------------- CLASSE ALUNOS -------------------");
        aluno1.exibirInformacoes();
        System.out.println();
        aluno2.exibirInformacoes();

        System.out.println("\n");
        System.out.println("----------------------- CLASSE PESSOA -------------------");

        pessoa1.exibirInformacoes();
        System.out.println("\n");
        pessoa2.exibirInformacoes();

        if (pessoa1.equals(pessoa2)) {
            System.out.println("\n -------- As pessoas são iguais (mesmo CPF). ---------------");
        } else {
            System.out.println("\n ---------------- As pessoas são diferentes. -------------------");
        }
    }
}

