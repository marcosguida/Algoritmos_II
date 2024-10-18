package lista_exercicios.ex13;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ControlePonto {
    private List<RegistroPonto> registros;

    public ControlePonto() {
        this.registros = new ArrayList<>();
    }

    public void registrarPonto(Funcionario funcionario, String tipo) {
        RegistroPonto registro = new RegistroPonto(funcionario, LocalDateTime.now(), tipo);
        registros.add(registro);
        System.out.println("Ponto registrado: " + registro);
    }

    public void exibirRegistros() {
        System.out.println("\n--- Registros de Ponto ---");
        for (RegistroPonto registro : registros) {
            System.out.println(registro);
        }
    }
}

