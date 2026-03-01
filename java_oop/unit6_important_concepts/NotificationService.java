package unit6_important_concepts;

public class NotificationService {
    public void sendBulkNotifications(Notification[] notifications, String message) {
        double total = 0;

        for (Notification n : notifications) {
            n.send(message);
            total += n.getDeliveryCost();
        }
        
        System.out.println("Total Delivery Costs: " + total);
    }

    public static void main(String[] args) {
        NotificationService service1 = new NotificationService();
        service1.sendBulkNotifications(new Notification[]{new EmailNotification(), new SMSNotification()}, "hello");
    }
}
