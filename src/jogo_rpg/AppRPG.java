package jogo_rpg;

public class AppRPG {
    public static void main(String[] args) {
        Mago mago = new Mago(100, 100);
        mago.castarMagiaArcana();

        Guerreiro guerreiro = new Guerreiro(180, 60);
        guerreiro.usarArmaduraPesada();

        Sacerdote sacerdote = new Sacerdote(80, 120);
        sacerdote.fazerMilagre();

        Ladrao ladrao = new Ladrao(90, 90);
        ladrao.ficarInvisivel();
    }
}
