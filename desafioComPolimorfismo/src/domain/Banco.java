package domain;

public class Banco {
    private Conta[] contas = new Conta[100];
    private int totalContas = 0;



    public void adicionarConta(Conta conta){
        if(totalContas < contas.length){
            contas[totalContas] = conta;
            totalContas++;
            System.out.println("Conta adicionada com sucesso!");
        }else {
            System.out.println("Não é possível adicionar mais contas. Limite atingido.");
        }
    }

    public void listarContas(){
        if(totalContas == 0) return;
        for(int i = 0; i < totalContas; i++){
            Conta conta = contas[i];
            System.out.println("---------------------------------");
            System.out.println("Número da conta "+ conta.getNumeroC() );
            System.out.println("Saldo da conta " + conta.getSaldo());
            System.out.println("--------------------------------");
            System.out.println();
        }
    }

    public Conta buscarContaPorNumero(int numero) {
        for(int i = 0; i < totalContas; i++){
           Conta conta = contas[i];
           if(conta.getNumeroC() == numero){
               System.out.println("Sua Conta: ");
               System.out.println("Número: " + conta.getNumeroC());
               System.out.println("Valor: " + conta.getSaldo());
               return conta;
           }
        }
        return null;
    }
}
