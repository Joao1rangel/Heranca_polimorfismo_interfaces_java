public class Principal5 {
    public static void main (String[] args){
        Pagamento cartao = new CartaoCredito(480.00);
        Pagamento boleto = new BoletoBancario(526.00);
        Pagamento pix = new Pix(300.00);
        Pagamento pixCredito = new PixNoCredito(63.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
        pixCredito.confirmarPagamento();
    }
}
