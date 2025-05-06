package POO_Monitoria.POLIMORFISMO.Ex4.ClasseAbstrata;

abstract class Forma {
    
    public abstract double calcularArea();

    public void exibirInformacao(){
        System.out.println("A área da forma: " + calcularArea());
    }

}

class Quadrado extends Forma{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Forma{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;

    }
}
