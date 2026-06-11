public class PixNoCredito extends Pagamento {

    public PixNoCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("\nPagamento via Pix de R$%.2f confirmado, (Taxa: R$%.2f)!", valor, calcularTaxa());
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.12;
    }
}
