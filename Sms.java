class Sms extends Notificacao {
    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("\n\nEnviando SMS para: %s\nMensagem: %s", destinatario, mensagem);
    }
}