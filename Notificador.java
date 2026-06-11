public class Notificador {
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String nome, String mensagem) {
        System.out.printf("\nMensagem para %s : %s", nome , mensagem);
    }

    public void enviarMensagem(String nome, String mensagem, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.printf("\nMensagem enviada para %s: %s", nome, mensagem);
        }
    }
}
