package POO_Monitoria.ENUM.Ex3;

public class Hoje {
    enum Dia {
        Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo, Feriado
    }

    public static void main(String[] args) {
        Dia dia = Dia.Segunda;
        System.out.println("Hoje é: " + dia);
    }
}
