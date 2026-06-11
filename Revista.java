public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoPubicacao, int edicao) {
        super(titulo, anoPubicacao);
        this.edicao = edicao;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + gerarCodigo() + " | Revista: " + getTitulo() + " | Edição: " + edicao);

    }
}


