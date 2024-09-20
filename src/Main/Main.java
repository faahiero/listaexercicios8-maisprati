package Main;

import Abstracao.*;
import Polimorfismo.Bicicleta;
import Polimorfismo.Carro;
import Polimorfismo.IMeioTransporte;
import Polimorfismo.Trem;
import SistemaGestao.*;

public class Main {
    public static void main(String[] args) {

        IMeioTransporte[] transportes = new IMeioTransporte[3];

        transportes[0] = new Carro();
        transportes[1] = new Bicicleta();
        transportes[2] = new Trem();

        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
            System.out.println();
        }

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");


        FormaPagamento cartao = new CartaoCredito("4532015112830366", "09/26", "123");
        cartao.processarPagamento(1000.0);

        FormaPagamento boleto = new Boleto("00190500954014481606906809350314337370000000100");
        boleto.processarPagamento(500.0);

        FormaPagamento pix = new Pix("12345678909");
        pix.processarPagamento(300.0);

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        Empresa empresa = new Empresa();

        Funcionario estagiario1 = new Estagiario("João", 1500.00);
        Funcionario dev1 = new Desenvolvedor("Maria", 5000.00);
        Funcionario gerente1 = new Gerente("Carlos", 10000.00);

        empresa.adicionarFuncionario(estagiario1);
        empresa.adicionarFuncionario(dev1);
        empresa.adicionarFuncionario(gerente1);

        System.out.println("Folha de pagamento inicial:");
        empresa.listarFuncionarios();
        System.out.printf("Total da folha de pagamento: R$%.2f%n", empresa.calcularFolhaPagamento());

        empresa.promoverFuncionario(estagiario1);

        empresa.promoverFuncionario(dev1);

        empresa.promoverFuncionario(gerente1);

        System.out.println("\nFolha de pagamento após promoções:");
        empresa.listarFuncionarios();
        System.out.printf("Total da folha de pagamento: R$%.2f%n", empresa.calcularFolhaPagamento());
    }
}
