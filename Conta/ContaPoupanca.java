class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= super.saldo) {
            super.saldo -= valor;
            return valor;
        } else {
            System.out.println("Saque não permitido: saldo insuficiente.");
            return 0;
        }
    }
}
