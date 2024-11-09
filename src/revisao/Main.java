package revisao;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcos Julius", 30, "144.446.789-10");
        Pessoa pessoa2 = new Pessoa("Campos Sales", 25, "072.343.999-12");

        Aluno aluno1 = new Aluno("Luana Pires", 20, "923856");
        Aluno aluno2 = new Aluno("Sergio Maia", 22, "789012");

        System.out.println("----------------------- CLASS ALUNOS -------------------");
        aluno1.exibirInformacoes();
        System.out.println();
        aluno2.exibirInformacoes();

        System.out.println("\n");
        System.out.println("----------------------- CLASS PESSOAS -------------------");

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
