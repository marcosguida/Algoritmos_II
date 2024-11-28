package exercicio_interface;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Merlin", 160, 230);
        Guerreiro guerreiro = new Guerreiro("Kalif", 150, 90);

        Espada espada = new Espada();
        Escudo escudo = new Escudo();

        mago.equiparArma(espada);
        guerreiro.equiparArmadura(escudo);

        mago.atacar(guerreiro);
        System.out.println("HP do Guerreiro após o ataque: " + guerreiro.hp);
    }
}