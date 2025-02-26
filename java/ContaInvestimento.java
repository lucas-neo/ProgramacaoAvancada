class ContaInvestimento extends ContaBancaria {
    private static final double TAXA_SAQUE = 0.02; // 2%

    public ContaInvestimento(int numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public double sacar(double valor) {
        double taxa = valor * TAXA_SAQUE;
        double total = valor + taxa;

        if (total <= super.saldo) {
            super.saldo -= total;
            return valor;
        } else {
            System.out.println("Saque não permitido: saldo insuficiente para cobrir taxa de 2%.");
            return 0;
        }
    }
}
