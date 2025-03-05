public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Notificação Push enviada! " + message);
    }
}
