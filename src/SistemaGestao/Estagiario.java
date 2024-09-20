package SistemaGestao;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioComBonus() {
        return getSalarioBase();
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }
}