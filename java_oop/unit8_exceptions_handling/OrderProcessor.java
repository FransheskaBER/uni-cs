package unit8_exceptions_handling;

public class OrderProcessor {
    private int availableStock;

    public OrderProcessor(int availableStock) {
        this.availableStock = availableStock;
    }

    public void processOrder(String productId, int quantity) throws InvalidQuantityException, InsufficientStockException, InvalidProductIdException {
        if (productId == null || productId.trim().isEmpty()) throw new InvalidProductIdException("ProductId is empty or null");
        if (quantity <= 0) throw new InvalidQuantityException("Quantity must be minimum 1");
        if (quantity > availableStock) throw new InsufficientStockException("Quantity requests exceeds available items.");
        availableStock -= quantity;
    }
}
