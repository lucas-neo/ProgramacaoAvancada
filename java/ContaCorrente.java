public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial;

    public ContaCorrente(int numeroConta, double saldo, String titular, double chequeEspecial) {
        super(numeroConta, saldo, titular);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public double sacar(double valor) {
        if (valor <= super.saldo + chequeEspecial) {
            super.saldo -= valor;
            return valor;
        } else {
            System.out.println("Saque não permitido");
            return 0;
        }
    }
}
