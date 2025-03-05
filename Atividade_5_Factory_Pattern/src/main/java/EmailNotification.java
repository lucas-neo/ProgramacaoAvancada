public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Notificação E-mail enviada! " + message);
    }
}
