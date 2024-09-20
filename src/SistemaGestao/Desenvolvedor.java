package SistemaGestao;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioComBonus() {
        return getSalarioBase() * 1.10;
    }

    @Override
    public String getCargo() {
        return "Desenvolvedor";
    }
}
