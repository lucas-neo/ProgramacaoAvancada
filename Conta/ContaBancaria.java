abstract public class ContaBancaria {
    private int numeroConta;
    public double saldo;
    private String titular;

    public ContaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double depositar (double valor) {
        return this.saldo += valor;
    }

    public abstract double sacar (double valor);

    public void exibirInformacoes(){
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Titular: " + this.titular);
    }
}
