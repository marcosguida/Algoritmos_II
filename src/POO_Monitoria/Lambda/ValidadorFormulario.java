package Lambda;

import java.util.function.Predicate;
import java.util.regex.Pattern;

class Usuario {
    private String nome;
    private String email;
    private int idade;
    
    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public int getIdade() { return idade; }
    
    @Override
    public String toString() {
        return String.format("Usuario{nome='%s', email='%s', idade=%d}", nome, email, idade);
    }
}

public class ValidadorFormulario {
    public static void main(String[] args) {

        Predicate<String> nomeValido = nome -> 
            nome != null && nome.trim().length() >= 2 && nome.matches("[a-zA-ZÀ-ÿ\\s]+");
            
        Predicate<String> emailValido = email -> 
            email != null && Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$").matcher(email).matches();
            
        Predicate<Integer> idadeValida = idade -> idade >= 18 && idade <= 120;
        
        Predicate<Usuario> usuarioValido = usuario ->
            nomeValido.test(usuario.getNome()) &&
            emailValido.test(usuario.getEmail()) &&
            idadeValida.test(usuario.getIdade());
        
        Usuario[] usuarios = {
            new Usuario("João Silva", "joao@email.com", 25),
            new Usuario("A", "email-invalido", 15),
            new Usuario("Maria Santos", "maria@teste.com.br", 30),
            new Usuario("", "vazio@email.com", 25)
        };
        
        for (Usuario user : usuarios) {
            System.out.println("\n");
            System.out.println(user + " -> " + 
                (usuarioValido.test(user) ? "VÁLIDO" : "INVÁLIDO"));
        }
        System.out.println("\n");
    }
}
