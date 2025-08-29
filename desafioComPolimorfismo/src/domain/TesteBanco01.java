package domain;

    public class TesteBanco01 {
        public static void main(String[] args) {
            // 1️⃣ Criar o banco
            Banco banco = new Banco();

            // 2️⃣ Criar contas
            ContaCorrente cc = new ContaCorrente(101, 1000);
            ContaPoupanca cp = new ContaPoupanca(202, 500);

            // 3️⃣ Adicionar contas no banco
            banco.adicionarConta(cc);
            banco.adicionarConta(cp);

            // 4️⃣ Listar todas as contas
            System.out.println("\n=== Lista de Contas ===");
            banco.listarContas();

            // 5️⃣ Buscar uma conta e sacar
            Conta contaEncontrada = banco.buscarContaPorNumero(101);
            if (contaEncontrada != null) {
                contaEncontrada.sacar(200);
            }

            // 6️⃣ Imprimir extrato da ContaPoupanca
            Conta poupanca = banco.buscarContaPorNumero(202);
            if (poupanca != null) {
                poupanca.imprimirExtrato();
            }

            // 7️⃣ Listar contas novamente para ver o saldo atualizado
            System.out.println("\n=== Lista de Contas Atualizada ===");
            banco.listarContas();
        }
    }


