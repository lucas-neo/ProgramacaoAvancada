import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentStrategy paymentStrategy = null;

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Cartão de Crédito");
        System.out.println("3. Boleto");
        System.out.print("Opção: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (option) {
            case 1:
                paymentStrategy = PaymentStrategyFactory.createPaymentStrategy("pix", null);
                break;
            case 2:
                System.out.print("Digite o número do cartão: ");
                String cardNumber = scanner.nextLine();
                paymentStrategy = PaymentStrategyFactory.createPaymentStrategy("credit", cardNumber);
                break;
            case 3:
                paymentStrategy = PaymentStrategyFactory.createPaymentStrategy("boleto", null);
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        paymentProcessor.setPaymentProcessor(paymentStrategy);

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.close();

        paymentProcessor.executarPayment(valor);
    }
}
