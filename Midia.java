public class Midia {
    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPubicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPubicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String gerarCodigo() {
        return "LIB-" + titulo.substring(0, 3) + anoPublicacao;
    }
}
