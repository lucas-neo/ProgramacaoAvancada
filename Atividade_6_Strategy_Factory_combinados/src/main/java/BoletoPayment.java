public class BoletoPayment implements PaymentStrategy{
    private String boletoId;

    public BoletoPayment(String boletoId) {
        this.boletoId = boletoId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento com Boleto efetuado com Sucesso!");
        System.out.println("Código do Boleto: " + boletoId);
        System.out.println("Valor: R$ " + amount);
    }
}
