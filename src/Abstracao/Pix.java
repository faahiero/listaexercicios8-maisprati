package Abstracao;

import java.util.regex.Pattern;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
        } else {
            System.out.println("Validação do pagamento via Pix falhou.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return validarChavePix();
    }

    private boolean validarChavePix() {
        return validarCPF(chavePix) || validarCNPJ(chavePix) || validarEmail(chavePix) || validarChaveAleatoria(chavePix);
    }

    private boolean validarCPF(String cpf) {
        return cpf.matches("\\d{11}");
    }

    private boolean validarCNPJ(String cnpj) {
        return cnpj.matches("\\d{14}");
    }

    private boolean validarEmail(String email) {
        return Pattern.compile("^[\\w-\\.]+@[\\w-\\.]+\\.\\w{2,}$").matcher(email).matches();
    }

    private boolean validarChaveAleatoria(String chave) {
        return chave.matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    }
}
