# Projeto de Demonstração de POO (Programação Orientada a Objetos)

## Introdução
Este projeto é uma implementação prática dos principais conceitos de Programação Orientada a Objetos (POO) em Java. Ele cobre encapsulamento, herança, polimorfismo e abstração através de diferentes classes e cenários, como gerenciamento de produtos, hierarquia de funcionários e um sistema de pagamento. O projeto foi desenvolvido para demonstrar boas práticas e fornecer exemplos claros de cada conceito.

---

## Funcionalidades

### 1. **Encapsulamento**
- **Classe Produto**
  - Atributos privados: `nome`, `preco` e `quantidadeEmEstoque`.
  - Métodos públicos para acessar e modificar os atributos.
  - Validação para garantir que `preco` e `quantidadeEmEstoque` nunca sejam negativos.
  - Método `aplicarDesconto(double porcentagem)` para reduzir o preço, garantindo que o desconto não ultrapasse 50%. Se isso ocorrer, uma exceção é lançada.

### 2. **Herança**
- **Classe Funcionario**
  - Atributos `nome` e `salario` definidos como `protected` para serem acessados pelas subclasses.
  - Método `calcularBonus()` que será sobrescrito pelas subclasses.
  - Método `trabalhar()` que é genérico e pode ser sobrescrito pelas subclasses.

- **Subclasses: Gerente e Desenvolvedor**
  - Subclasse `Gerente` implementa um bônus de 20% do salário.
  - Subclasse `Desenvolvedor` implementa um bônus de 10% do salário.
  - Ambas sobrescrevem o método `trabalhar()` para especificar a função.

### 3. **Polimorfismo**
- **Interface IMeioTransporte**
  - Métodos `acelerar()` e `frear()` são implementados em classes `Carro`, `Bicicleta` e `Trem`.
  - Um array de `IMeioTransporte` é percorrido para chamar `acelerar()` e `frear()` de maneira polimórfica.

- **Classe Abstrata Animal**
  - Método abstrato `emitirSom()` é implementado em subclasses `Cachorro`, `Gato` e `Vaca`.
  - Uma lista de `Animal` é iterada para demonstrar o polimorfismo no método `emitirSom()`.

### 4. **Abstração**
- **Classe Abstrata FormaPagamento**
  - Métodos abstratos `processarPagamento(double valor)` e `validarPagamento()` são implementados em classes concretas `CartaoCredito`, `Boleto` e `Pix`.
  - Cada classe concreta possui uma validação específica e simula o processo de pagamento.

- **Sistema de Gestão de Funcionários**
  - O sistema gerencia diferentes tipos de funcionários (Gerente, Desenvolvedor, Estagiário), cada um com sua própria maneira de calcular salário e bônus.
  - O método `calcularFolhaPagamento()` itera sobre os funcionários, calcula e retorna o total de salários e bônus.
  - Possibilidade de promoção de funcionários, que altera seu tipo e os cálculos de salário e bônus.

---

## Estrutura do Projeto

```bash
src/
├── Encapsulamento/
│   └── Produto.java
├── Heranca/
│   ├── Funcionario.java
│   ├── Gerente.java
│   └── Desenvolvedor.java
├── Polimorfismo/
│   ├── IMeioTransporte.java
│   ├── Carro.java
│   ├── Bicicleta.java
│   └── Trem.java
├── Abstracao/
│   ├── Animal.java
│   ├── Cachorro.java
│   ├── Gato.java
│   └── Vaca.java
│   ├── FormaPagamento.java
│   ├── CartaoCredito.java
│   ├── Boleto.java
│   └── Pix.java
└── SistemaGestao/
    ├── Funcionario.java
    ├── Gerente.java
    ├── Desenvolvedor.java
    ├── Estagiario.java
    └── Main.java
```

### Requisitos:
- Java 8+: O projeto foi desenvolvido utilizando a linguagem Java.
- Um IDE ou compilador compatível com Java para executar o código (ex: IntelliJ, Eclipse ou o próprio terminal com javac e java).
