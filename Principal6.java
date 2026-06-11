public class Principal6 {
    public static void main(String[] args) {
        Notificador notificacao = new Notificador();
        notificacao.enviarMensagem("Olá");
        notificacao.enviarMensagem("João","Fala meu mano!");
        notificacao.enviarMensagem("Maria", "Olá", 2);

    }
}
