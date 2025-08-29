package domain;

public abstract class Conta {
    protected int numeroC;
    protected double saldo;


    public Conta(int numeroC, double saldoInicial) {
        this.numeroC = numeroC;
        this.saldo = saldoInicial;
    }

    public int getNumeroC() {
        return numeroC;
    }


    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor){
        saldo += valor;
        System.out.println("Valor da sua conta foi atualizado com sucesso!");
        return saldo;
    }

    public abstract double sacar(double valor);
    public abstract void imprimirExtrato();



    }


