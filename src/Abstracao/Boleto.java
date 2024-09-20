package Abstracao;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " realizado via Boleto.");
        } else {
            System.out.println("Validação do pagamento via Boleto falhou.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return validarCodigoBarras();
    }

    private boolean validarCodigoBarras() {
        return codigoBarras.length() == 47 && codigoBarras.matches("\\d+");
    }
}
