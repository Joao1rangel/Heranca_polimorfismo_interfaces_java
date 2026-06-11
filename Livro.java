public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, int anoPubicacao, String autor) {
        super(titulo, anoPubicacao);
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: " + getTitulo() + " | Autor: " + autor);

    }
}
