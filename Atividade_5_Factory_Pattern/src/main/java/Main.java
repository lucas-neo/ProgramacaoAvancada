import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma de notificação: ");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push");
        System.out.print("Opção: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        Notification notification = null;

        switch (option) {
            case 1:
                notification = NotificationFactory.createNotification("email");
                break;
            case 2:
                notification = NotificationFactory.createNotification("sms");
                break;
            case 3:
                notification = NotificationFactory.createNotification("push");
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }
        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        if (notification != null){
            notification.send(mensagem);
        }

        scanner.close();
    }
}
