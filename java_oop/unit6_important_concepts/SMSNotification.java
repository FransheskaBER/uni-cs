package unit6_important_concepts;

public class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);        
    }

    @Override
    public double getDeliveryCost() {
        return 0.05;
    }
    
}
