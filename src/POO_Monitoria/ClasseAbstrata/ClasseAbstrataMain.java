package ClasseAbstrata;
abstract class Forma {
    // Método abstrato (sem implementação)
    public abstract double calcularArea();
    
    // Método concreto (com implementação)
    public void exibirInformacao() {
        System.out.println("Área: " + calcularArea());
    }
}

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
        // Forma forma = new Forma(); // Erro: não pode instanciar classe abstrata no java
        
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);
        
        circulo.exibirInformacao(); 
        retangulo.exibirInformacao(); 
    }
}
