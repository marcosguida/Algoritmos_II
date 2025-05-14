package Interface.Arquivo;

interface ArquivoOperações {

    void abrir();
    void fechar();
    boolean salvar(String conteudo);
    String ler(String conteudo);
}

class ArquivoTexto implements ArquivoOperações{

    private String caminho;
    private boolean aberto;

    public ArquivoTexto(String caminho) {
        this.caminho = caminho;
        this.aberto = false;
    }

    @Override
    public void abrir(){
        System.out.println("Arquivo aberto: " + caminho);
        aberto = true ;
    }

    @Override
    public void fechar(){
        System.out.println("Arquivo fechado: " + caminho);
        aberto = false;
    }

    @Override
    public boolean salvar(String conteudo){
        if (aberto){
            System.out.println("Salvando o conteudo:"+conteudo);
            return true;
        }
        return false;
    }

    @Override
    public String ler(String conteudo){
        if (aberto){
            System.out.println("Salvando o conteudo:"+ conteudo);
        }
        return null;
    }

    public static void main(String[] args) {

        ArquivoTexto arquivo = new ArquivoTexto("caminho/do/arquivo.txt");
        System.out.println("\n");
        arquivo.abrir();
        arquivo.salvar("unitins - 2025");
        arquivo.fechar();
    }

}

