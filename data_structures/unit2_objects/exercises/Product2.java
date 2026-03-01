package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Product2 implements Comparable<Product2> {
    private int productId;
    private String name;
    private double price;
    private String category;

    public Product2(int productId, String name, double price, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Product[id=%d, name=%s, price=$%.2f, category=%s]", productId, name, price, category);
    }

    @Override
    public int compareTo(Product2 other) {
        int categoryComparison = this.category.compareToIgnoreCase(other.category);
        int priceComparison = Double.compare(this.price, other.price);

        if (categoryComparison != 0) {
            return categoryComparison;
        } else if (priceComparison != 0) {
            return priceComparison;
        } else {
            return this.name.compareToIgnoreCase(other.name);
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product2)) return false;
        Product2 other = (Product2) obj;
        return this.productId == other.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    public static void main(String[] args) {
        Product2 p1 = new Product2(101, "Laptop", 999.99, "Electronics");
        Product2 p2 = new Product2(102, "Mouse", 25.50, "Electronics");
        Product2 p3 = new Product2(103, "Keyboard", 75.00, "Electronics");
        Product2 p4 = new Product2(201, "Java Book", 45.99, "Books");
        Product2 p5 = new Product2(202, "Python Book", 45.99, "Books");
        Product2 p6 = new Product2(203, "C++ Book", 39.99, "Books");
        Product2 p7 = new Product2(301, "Desk", 299.99, "Furniture");

        List<Product2> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);

        System.out.println("=== BEFORE SORTING ===");
        for (Product2 p : products) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(products);

        System.out.println("=== AFTER SORTING ===");
        for (Product2 p : products) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("=== Testing compareTo() Directly ===");
        System.out.println("p1.compareTo(p2): " + p1.compareTo(p2) + " (same category, but Laptop is more expensive than Mouse)");
        System.out.println("p4.compareTo(p5): " + p4.compareTo(p5) + " (same category, same price, but \"Java Book\" < \"Python Book\" alphabetically)");
        System.out.println("p1.compareTo(p4): " + p1.compareTo(p4) + " (Electronics comes after Books alphabetically)");
        System.out.println();

        Product2 p1Duplicate = new Product2(101, "Gaming Laptop", 1299.99, "Electronics");
        
        System.out.println("=== Testing equals() vs compareTo() ===");
        System.out.println("p1.equals(p1Duplicate): " + p1.equals(p1Duplicate) + " (same productId)");
        System.out.println("p1.compareTo(p1Duplicate): " + p1.compareTo(p1Duplicate) + " (different categories/prices/names)");
        System.out.println("Note: equals() uses productId, compareTo() uses category/price/name - this is okay!");

        // System.out.println("---------toString()------------");
        // System.out.println("Product1: " + p1);
        // System.out.println("Product2: " + p2);
        // System.out.println("Product3: " + p3);
        // System.out.println("Product4: " + p4);
        // System.out.println("------- Testing equals() Method --------");
        // System.out.println("product1.equals(product1): " + (p1.equals(p1)) + " (same object - reflexive)"); // true - same objects and same ids
        // System.out.println("product1.equals(product2): " + (p1.equals(p2)) + " (same ID, different content)"); // true - different objects but same ids
        // System.out.println("product1.equals(product3): " + (p1.equals(p3)) + " (different ID)"); // false - different objects and different ids
        // System.out.println("product1.equals(product4): " + (p1.equals(p4)) + " (same reference)"); // true - same objects and same ids
        // System.out.println("product1.equals(null): " + (p1.equals(null)) + " (null safety)"); // false - null is always false
        // System.out.println("product1.equals('Not a product'): " + (p1.equals("Not a product")) + " (different type)"); // false - different object type - we are comparing it to an String object hence false
        // System.out.println("--------- Testing == Operator ------------");
        // System.out.println("product1 == product2: " + (p1 == p2) + " (different objects, but equals() returns true)"); //false - different obj references"
        // System.out.println("product1 == product4: " + (p1 == p4) + " (same reference)"); ; //true - same obj references
    }
}
