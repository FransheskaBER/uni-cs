package unit2_into_oo_modeling;

import java.math.BigDecimal;

public class Product {
    private final String productNumber;
    private String title;
    private BigDecimal price;
    private int stockQuantity;

    public Product(String productNumber, String title, BigDecimal price, int stockQuantity) {
        this.productNumber = productNumber;
        this.title = title;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Methods
    public String getProductTitle() {
        return this.title;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public String getProductNumber() {
        return this.productNumber;
    }

    public void setProductTitle(String newTitle) {
        this.title = newTitle;
    }
    
    public boolean isInStock() {
        if (this.stockQuantity < 0) {
            return false;
        }
        return true;
    }

    public boolean canFullfillOrder(int quantity) {
        if (quantity < stockQuantity) {
            return true;
        }
        return false;
    }
    
    public BigDecimal getPriceAfterDiscount(int percentage) {
        BigDecimal discount = this.price.multiply(BigDecimal.valueOf(percentage)).divide(BigDecimal.valueOf(100));
        return this.price.subtract(discount);
    }
}
