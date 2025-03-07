import java.util.Random;
import java.util.UUID;

public class PaymentStrategyFactory {

    // extraParameter pode ser utilizado para dados como o número do cartão, se necessário.
    public static PaymentStrategy createPaymentStrategy(String type, String extraParameter) {
        switch (type.toLowerCase()) {
            case "pix":
                int pixKey = new Random().nextInt(900000) + 100000;
                System.out.println("Chave PIX para Pagamento: " + pixKey);
                return new PixPayment(pixKey);
            case "credit":
                return new CreditCardPayment(extraParameter);
            case "boleto":
                String boletoCode = UUID.randomUUID().toString();
                System.out.println("Seu boleto: " + boletoCode);
                return new BoletoPayment(boletoCode);
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido");
        }
    }
}
