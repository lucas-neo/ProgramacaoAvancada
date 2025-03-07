public class PixPayment implements PaymentStrategy {
    private int pixKey;

    public PixPayment(int pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento com Pix efetuado com Sucesso!");
        System.out.println("Chave PIX utilizada: " + pixKey);
        System.out.println("Valor: R$ " + amount);
    }
}