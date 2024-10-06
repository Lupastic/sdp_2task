public class SMSNotification implements NotificationChannel {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
        // Логика отправки SMS
    }
}