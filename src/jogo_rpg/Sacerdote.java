package jogo_rpg;

public class Sacerdote extends Personagem {
    public Sacerdote(int hp, int sp) {
        super(hp, sp);
    }

    public void fazerMilagre() {
        System.out.println("Sacerdote está realizando um milagre.");
    }
}