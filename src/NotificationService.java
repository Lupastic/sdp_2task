import java.util.List;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    // Отправка одного уведомления
    public void sendNotification(String message, String recipient) {
        notificationChannel.send(message, recipient);
    }

    // Отправка массовых уведомлений
    public void sendBulkNotifications(String message, List<String> recipients) {
        for (String recipient : recipients) {
            notificationChannel.send(message, recipient);
        }
    }
}