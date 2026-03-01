public class Product {
    private String name;
    private double price;
    private int quantityInStock = 0;
    private boolean isOnSale = false;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public boolean IsOnSale() {
        return isOnSale;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative: " + price);
        }
        this.price = price;
    }

    public void setQuantityInStock(int quantity) {
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative : " + quantity);
        }
        this.quantityInStock = quantity;
        
    }

    public void setIsOnSale(boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    public void applyDiscount(double percentage) {
        if (percentage < 0 && percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
        this.price = price - (price * percentage / 100);
    }
}