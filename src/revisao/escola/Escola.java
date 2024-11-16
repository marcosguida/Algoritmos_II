package revisao.escola;

public class Escola {
    public void adicionarPessoa(Pessoa pessoa) {
        pessoa.exibirInformacoes();
    }

    public static void main(String[] args) {
        Escola escola = new Escola();

        Aluno aluno = new Aluno("Ezequial Garcia", 22, "Ciência da Computação");
        Professor professor = new Professor("Olivia", 40, "Matemática");

        escola.adicionarPessoa(aluno);
        escola.adicionarPessoa(professor);
    }
}
