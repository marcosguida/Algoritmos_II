package lista_exercicios.ex11;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " contratado!");
    }

    public void demitirFuncionario(Funcionario funcionario) {
        if (funcionarios.remove(funcionario)) {
            System.out.println("Funcionário " + funcionario.getNome() + " demitido!");
        } else {
            System.out.println("Funcionário " + funcionario.getNome() + " não encontrado no banco de dados da lista_exercicios.ex11.empresa.");
        }
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Funcionario getFuncionarioPorCpf(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
