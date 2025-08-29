package domain;

public class ContaCorrente extends Conta{
    static final double TAXA_SAQUE = 0.05;

    public ContaCorrente(int numeroC, double saldo) {
        super(numeroC, saldo);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido ");
            return 0.0;
        }
        double totalDebitado = valor +(valor * TAXA_SAQUE) ;

        if (totalDebitado > saldo) {
            System.out.println("Saldo insufuciente!");
            return 0.0;
        }
        saldo -= totalDebitado;
        System.out.println("Saque de " + valor + " foi realizado com sucesso! a taxa foi de: " + TAXA_SAQUE);
        return valor;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Corrente ====");
        System.out.println("Número da conta: " + numeroC);
        System.out.println("Saldo atual: " + saldo);
    }
}
