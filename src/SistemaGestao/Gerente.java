package SistemaGestao;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioComBonus() {
        return getSalarioBase() * 1.20;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}
