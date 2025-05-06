package POO;

// Algoritmo para verificar o tipo de animal e executar um método específico (instanceof e casting)

class Animal {
    public String nome;
    public String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }
}

class Cachorro extends Animal {
    public String raca;

    public Cachorro(String nome, String especie, String raca) {
        super(nome, especie);
        this.raca = raca;
    }

    public void pular(){
        System.out.println("O cachorro " + nome + " está pulando.");
    }
}

class Papagaio extends Animal {
    public String corPena;

    public Papagaio(String nome, String especie, String corPena) {
        super(nome, especie);
        this.corPena = corPena;
    }

    public void falar(){
        System.out.println("O papagaio " + nome + " está falando.");
    }   
}

public class TesteAnimais {
    public static void verificarAnimal (Animal animal){
        if (animal instanceof Cachorro){
            Cachorro c = (Cachorro) animal;
            c.pular();
        } else if (animal instanceof Papagaio){
            Papagaio p = (Papagaio) animal;
            p.falar();
        } else {
            System.out.println("Tipo de animal desconhecido.");
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex", "Canino", "Labrador");
        Animal a2 = new Papagaio("Loro", "Ave", "Verde");

        verificarAnimal(a2);
        
    }
}