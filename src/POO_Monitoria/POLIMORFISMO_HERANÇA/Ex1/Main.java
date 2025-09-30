package POLIMORFISMO_HERANÇA.Ex1;

// Classe pai
class Forma {
    public double calcularArea() {
        return 0.0;
    }
    
    public void exibir() {
        System.out.println("Forma");
    }
    
    // sobrecarga - mesmo nome, mas parâmetros diferentes - assinatura de método
    public void exibir(String tamanho) {
        System.out.println("Tamanho: " + tamanho);
    }
}


// Classe filha - subclasse - herda de Forma
class Quadrado extends Forma {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    // Sobrescrita 
     public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public void exibir() {
        System.out.println("Quadrado com lado " + lado);
    }
}


public class Main {
    public static void main(String[] args) {

        Forma formaGenerica = new Forma(); 
        Forma forma1 = new Quadrado(4.0);

        System.out.println("");

        System.out.println("Área da forma genérica: " + formaGenerica.calcularArea());
        formaGenerica.exibir("8.0");
        
        System.out.println("Área do quadrado: " + forma1.calcularArea());
        
    
    }
}