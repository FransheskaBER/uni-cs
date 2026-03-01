package unit6_important_concepts;

public class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

    @Override
    public double getDeliveryCost() {
        return 0.0;
    }
}
