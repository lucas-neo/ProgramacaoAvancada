import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor paymentType = new PaymentProcessor();

        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1. Pix");
        System.out.println("2. Cartão de Crédito");
        System.out.println("3. Boleto");
        System.out.print("Opção: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                // Achar algo que gere código int aleatório
                Random pixCode = new Random();
                int MyPixCode = pixCode.nextInt(900000) + 100000;
                System.out.println("Chave PIX para Pagamento: " + MyPixCode);
                paymentType.setPaymentProcessor(new PixPayment(MyPixCode));
                break;
            case 2:
                System.out.print("Digite o número do cartão: ");
                String cardNumber = scanner.nextLine();
                paymentType.setPaymentProcessor(new CreditCardPayment(cardNumber));
                break;
            case 3:
                UUID uuid = UUID.randomUUID();
                String boletoCode = uuid.toString();
                System.out.println("Seu boleto: " + boletoCode);
                paymentType.setPaymentProcessor(new BoletoPayment(boletoCode));
                break;
        }

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.close();

        paymentType.executarPayment(valor);
    }
}
