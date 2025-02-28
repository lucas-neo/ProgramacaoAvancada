public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1001, 500, "João", 200);
        ContaPoupanca cp = new ContaPoupanca(1002, 300, "Maria");
        ContaInvestimento ci = new ContaInvestimento(1003, 1000, "Pedro");
        ContaSalario cs = new ContaSalario(1004, 800, "Ana", 100);
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco(1005, 15000, "Carlos");

        ContaBancaria[] contas = {cc, cp, ci, cs, ciar};

        for (ContaBancaria conta : contas) {
            conta.exibirInformacoes();
            System.out.println("Tentando sacar R$ 200,00...");
            conta.sacar(200);
            conta.exibirInformacoes();
            System.out.println("--------------------------------");
        }
    }
}
