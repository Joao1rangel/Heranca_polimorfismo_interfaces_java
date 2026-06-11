public class Docente extends Pessoa {
    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void exibirInformacoes() {
        System.out.println("Professor: " + getNome() + " - Idade: " + getIdade() + " - Disciplina: " + disciplina);
    }
}
