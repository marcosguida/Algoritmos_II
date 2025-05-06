package POO_Monitoria.POLIMORFISMO_HERANÇA.Ex3.ClasseAbstrata;
// Classe abstrata
abstract class Forma {
    // Método abstrato (sem implementação)
    public abstract double calcularArea();
    
    // Método concreto (com implementação)
    public void exibirInformacao() {
        System.out.println("Área: " + calcularArea());
    }
}

// Classes que estendem a classe abstrata
class Circulo extends Forma {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

public class ClasseAbstrataMain {
    public static void main(String[] args) {
        // Forma forma = new Forma(); // Erro: não pode instanciar classe abstrata
        
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);
        
        circulo.exibirInformacao(); 
        retangulo.exibirInformacao(); 
    }
}
