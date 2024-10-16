package jogo_rpg;

public class Ladrao extends Personagem {
    public Ladrao(int hp, int sp) {
        super(hp, sp);
    }

    public void ficarInvisivel() {
        System.out.println("Ladrão está ficando invisível.");
    }
}