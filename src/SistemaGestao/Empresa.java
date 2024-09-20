package SistemaGestao;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalarioComBonus();
        }
        return total;
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%s - %s - Salário: R$%.2f%n", funcionario.getNome(), funcionario.getCargo(), funcionario.calcularSalarioComBonus());
        }
    }

    public void promoverFuncionario(Funcionario funcionario) {
        if (funcionario instanceof Estagiario) {
            Desenvolvedor novoDesenvolvedor = new Desenvolvedor(funcionario.getNome(), funcionario.getSalarioBase());
            funcionarios.set(funcionarios.indexOf(funcionario), novoDesenvolvedor);
            System.out.println(funcionario.getNome() + " foi promovido para Desenvolvedor!");
        } else if (funcionario instanceof Desenvolvedor) {
            Gerente novoGerente = new Gerente(funcionario.getNome(), funcionario.getSalarioBase());
            funcionarios.set(funcionarios.indexOf(funcionario), novoGerente);
            System.out.println(funcionario.getNome() + " foi promovido para Gerente!");
        } else {
            System.out.println(funcionario.getNome() + " já é Gerente e não pode ser promovido.");
        }
    }
}