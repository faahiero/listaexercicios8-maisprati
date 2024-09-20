package Abstracao;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String dataValidade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " realizado no Cartão de Crédito.");
        } else {
            System.out.println("Validação do pagamento no Cartão de Crédito falhou.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return validarNumeroCartao() && validarDataValidade() && validarCVV();
    }

    private boolean validarNumeroCartao() {
        int soma = 0;
        boolean alternar = false;
        for (int i = numeroCartao.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(numeroCartao.substring(i, i + 1));
            if (alternar) {
                n *= 2;
                if (n > 9) n -= 9;
            }
            soma += n;
            alternar = !alternar;
        }
        return soma % 10 == 0;
    }

    private boolean validarDataValidade() {
        String[] partes = dataValidade.split("/");
        int mes = Integer.parseInt(partes[0]);
        int ano = Integer.parseInt(partes[1]);

        return (mes >= 1 && mes <= 12) && (ano >= 24);
    }

    private boolean validarCVV() {
        return cvv.length() == 3 || cvv.length() == 4;
    }
}