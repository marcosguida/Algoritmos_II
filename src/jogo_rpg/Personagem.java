package jogo_rpg;

public class Personagem {
    private int hp; // Vida
    private int sp; // Alma

    public Personagem(int hp, int sp) {
        this.hp = hp;
        this.sp = sp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getSp() {
        return sp;
    }

    public void realizarAcao() {
        System.out.println("O personagem anda");
    }
}