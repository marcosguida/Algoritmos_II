package lista_exercicios.ex13;

import java.time.LocalDateTime;

public class RegistroPonto {
    private Funcionario funcionario;
    private LocalDateTime dataHora;
    private String tipo; // "Entrada" ou "Saída"

    public RegistroPonto(Funcionario funcionario, LocalDateTime dataHora, String tipo) {
        this.funcionario = funcionario;
        this.dataHora = dataHora;
        this.tipo = tipo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Funcionário: " + funcionario.getNome() + ", Data/Hora: " + dataHora + ", Tipo: " + tipo;
    }
}
