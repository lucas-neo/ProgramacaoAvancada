public class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double TAXA_SAQUE = 0.05; // 5%
    private static final double SALDO_MINIMO = 10000.00;

    public ContaInvestimentoAltoRisco(int numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public double sacar(double valor) {
        if (super.saldo < SALDO_MINIMO) {
            System.out.println("Saque não permitido: saldo mínimo de R$ 10.000,00 exigido.");
            return 0;
        }

        double taxa = valor * TAXA_SAQUE;
        double total = valor + taxa;

        if (total <= super.saldo) {
            super.saldo -= total;
            return valor;
        } else {
            System.out.println("Saque não permitido: saldo insuficiente para cobrir taxa de 5%.");
            return 0;
        }
    }
}
