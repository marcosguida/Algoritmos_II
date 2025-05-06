package POO_Monitoria.POLIMORFISMO.Ex4.ClasseAbstrata;

public class ClasseAbstrata {
    
    public static void main(String[] args) {
        Forma forma1 = new Quadrado(5.0);
        Forma forma2 = new Circulo(3.0);
        
        forma1.exibirInformacao();
        forma2.exibirInformacao();

    }
}
