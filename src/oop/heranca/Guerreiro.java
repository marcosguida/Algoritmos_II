package oop.heranca;

public class Guerreiro extends Personagem {
	public Guerreiro(int hp, int sp) {
		super(hp, sp);
	}

	public void usarArmaduraPesada() {
		System.out.println("Guerreiro está usando armadura pesada.");
	}
}
