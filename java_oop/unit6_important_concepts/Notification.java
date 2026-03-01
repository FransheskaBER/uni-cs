package unit6_important_concepts;

public abstract class Notification {

    public abstract void send(String message);
    public abstract double getDeliveryCost();
    
    public void logNotification(String message) {
        System.out.println("Logging: " + message);
    }

}
