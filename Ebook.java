public class Ebook extends Midia {
    private String formato;

    public Ebook(String titulo, int anoPubicacao, String formato) {
        super(titulo, anoPubicacao);
        this.formato = formato;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + gerarCodigo() + " | Ebook: " + getTitulo() + " | Formato: " + formato);

    }
}

