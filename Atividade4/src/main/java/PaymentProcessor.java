public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executarPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
