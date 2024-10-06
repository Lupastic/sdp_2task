public class PushNotification implements NotificationChannel {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending Push notification to " + recipient + ": " + message);
    }
}