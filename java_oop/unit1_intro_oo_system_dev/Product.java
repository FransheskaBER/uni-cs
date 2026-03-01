package unit1_intro_oo_system_dev;

public class Product {
    // private String id;
    // private String title;
    private double price;
    private int stockQuantity;
    // private String category;

    public Product(String id, String title, double price, int stockQuantity, String category) {
        // this.id = id;
        // this.title = title;
        this.price = price;
        this.stockQuantity = stockQuantity;
        // this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 50) {
            this.price = this.price * (1 - percentage/100);
        }
    }

    public boolean isInStock() {
        return this.stockQuantity > 0;
    }

    public void reduceStock(int quantity) {
        if (quantity <= this.stockQuantity) {
            this.stockQuantity -= quantity;
        }
    }
}

