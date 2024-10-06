import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        NotificationChannel sms = new SMSNotification();
        NotificationService smsService = new NotificationService(sms);
        smsService.sendNotification("Hello via SMS!", "123-456-7890");

        NotificationChannel email = new EmailNotification();
        NotificationService emailService = new NotificationService(email);
        emailService.sendNotification("Hello via Email!", "user@example.com");

        NotificationChannel push = new PushNotification();
        NotificationService pushService = new NotificationService(push);
        pushService.sendNotification("Hello via Push!", "userDeviceId");

        smsService.sendBulkNotifications("Bulk SMS Notification", Arrays.asList("111-111-1111", "222-222-2222"));
    }
}
