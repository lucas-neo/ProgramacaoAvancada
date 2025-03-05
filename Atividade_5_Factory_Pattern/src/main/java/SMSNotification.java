public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Notificação SMS enviada! " + message);
    }
}
