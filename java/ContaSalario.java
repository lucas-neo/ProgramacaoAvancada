class ContaSalario extends ContaCorrente {
    private int saquesGratis = 1;
    private static final double TAXA_SAQUE_EXTRA = 5.00;

    public ContaSalario(int numeroConta, double saldo, String titular, double chequeEspecial) {
        super(numeroConta, saldo, titular, chequeEspecial);
    }

    @Override
    public double sacar(double valor) {
        if (saquesGratis > 0) {
            saquesGratis--;
            return super.sacar(valor);
        } else {
            double total = valor + TAXA_SAQUE_EXTRA;
            if (total <= super.saldo) {
                super.saldo -= total;
                return valor;
            } else {
                System.out.println("Saque não permitido: saldo insuficiente para cobrir taxa de R$ 5,00.");
                return 0;
            }
        }
    }
}
