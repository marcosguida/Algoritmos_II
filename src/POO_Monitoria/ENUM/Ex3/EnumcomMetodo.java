package POO_Monitoria.ENUM.Ex3;

public class EnumcomMetodo {
    enum TAM {
        PEQUENO, MEDIO, LARGO;

    public String getTamanho(){
        switch (this){
            case PEQUENO:
                return "Tamanho pequeno";
            case MEDIO:
                return "Tamanho medio";
            case LARGO:
                return "Tamanho largo";
            default:
                return "Tamanho inexistente";
        }
        }
    }

    public static void main(String[] args) {
        TAM tamanho = TAM.LARGO;
        System.out.println("O tamanho é: " + tamanho.getTamanho());
    }
    
}
