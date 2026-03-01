package exercises;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    
    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    @Override
    // public String toString() {
    //     return "Product[name=" + name + ", price=$" + price + ", stock=" + stockQuantity + "]";
    // }
    public String toString() {
        return String.format("Product[name=%s, price=$%.2f, stock=%d]",
                                    name, price, stockQuantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 990.99, 3);
        Product p2 = new Product("Mac Laptop", 500, 2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
