package domain;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroC, double saldoInicial) {
        super(numeroC, saldoInicial);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido ");
            return 0.0;
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return saldo;
        }
        System.out.println("Valor sacado de " + valor + " foi com sucesso!");
        saldo -= valor;
        return valor;
    }

    // Método de imprimir o Extrato + o juros
    static final double JUROS_AO_IMPRIMIR_EXTRATO = 0.05;
    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Poupaça ====");
        System.out.println("Número da conta: " + numeroC);
        saldo += saldo * JUROS_AO_IMPRIMIR_EXTRATO;
        System.out.println("Saldo atual: " + saldo);

    }
}


