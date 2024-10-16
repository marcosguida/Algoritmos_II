package jogo_rpg;

public class Mago extends Personagem {
    public Mago(int hp, int sp) {
        super(hp, sp);
    }

    public void castarMagiaArcana() {
        System.out.println("Mago está lançando uma magia arcanica.");
    }
}