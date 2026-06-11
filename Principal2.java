public class Principal2 {
    public static void main (String[] args) {
        Aluno aluno1 = new Aluno("João Pedro", 24, 10);
        Docente docente1 = new Docente("Claudio", 56, "Análise Orientada a Objetos");

        docente1.exibirInformacoes();
        aluno1.exibirInformacoes();

    }
}
