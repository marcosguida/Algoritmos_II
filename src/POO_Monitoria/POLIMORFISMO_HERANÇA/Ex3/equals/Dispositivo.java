package POO_Monitoria.POLIMORFISMO_HERANÇA.Ex3.equals;

public class Dispositivo {
    private String id;
    private String tipo;
    private String modelo;
    private String versaoSoftware;
    
    public Dispositivo(String id, String tipo, String modelo, String versaoSoftware) {
        this.id = id;
        this.tipo = tipo;
        this.modelo = modelo;
        this.versaoSoftware = versaoSoftware;
    }
    
    // Getters e setters omitidos para brevidade
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Dispositivo outro = (Dispositivo) obj;
        
        // Dispositivos são considerados iguais se tiverem o mesmo ID único
        return id.equals(outro.id);
    }
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
    @Override
    public String toString() {
        return "Dispositivo[id=" + id + ", tipo=" + tipo + ", modelo=" + modelo + 
               ", versão=" + versaoSoftware + "]";
    }
    
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo("ABC123", "Tablet", "Galaxy Tab", "12.1");
        Dispositivo d2 = new Dispositivo("ABC123", "Tablet", "Galaxy Tab", "12.2");
        Dispositivo d3 = new Dispositivo("XYZ789", "Tablet", "Galaxy Tab", "12.1");
        
        System.out.println("d1 equals d2: " + d1.equals(d2)); // true (mesmo ID, mesmo sendo versão diferente)
        System.out.println("d1 equals d3: " + d1.equals(d3)); // false (ID diferente)
        
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
    }
}