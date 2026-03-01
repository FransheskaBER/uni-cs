package unit8_exceptions_handling;

public class OnlineShop {
    public void handleError(OrderProcessor processor, String productId, int quantity) {
        try {
            processor.processOrder(productId, quantity);
            System.out.println("Order processing successfully complete");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Order processing attempt complete");
        }
    }
}
