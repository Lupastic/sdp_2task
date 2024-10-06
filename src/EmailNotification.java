public class EmailNotification implements NotificationChannel {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}