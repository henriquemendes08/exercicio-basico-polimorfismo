# exercicio-basico-polimorfismo

 Desafio: Sistema Bancário Simples com Polimorfismo

Crie uma classe Conta com atributos básicos (numero, saldo) e métodos (depositar, sacar, imprimirExtrato).

Crie duas subclasses:

ContaCorrente → cobra uma taxa fixa em cada saque.

ContaPoupanca → rende um pequeno "juros" quando o cliente chama o método imprimirExtrato.

Use polimorfismo para que o método imprimirExtrato funcione de forma diferente em cada tipo de conta.

Crie uma classe Banco que gerencia uma lista de contas e permite:

adicionar contas,

listar todas,

buscar pelo número da conta e imprimir o extrato.
