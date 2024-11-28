package exercicio_interface;

abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int sp;
    protected Arma arma;
    protected Armadura armadura;

    public Personagem(String nome, int hp, int sp) {
        this.nome = nome;
        this.hp = hp;
        this.sp = sp;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void equiparArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public void atacar(Personagem alvo) {
        int dano = arma.atacar();
        alvo.receberDano(dano);
    }

    public void receberDano(int dano) {
        int defesa = armadura.defender();
        hp -= (dano - defesa);
        if (hp < 0) hp = 0;
    }
}
