public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento confirmado: " + amount);
        System.out.println("Cartão Nº " + cardNumber);
        System.out.println("Valor: R$ " + amount);
    }
}
