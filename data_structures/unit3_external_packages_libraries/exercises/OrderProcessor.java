// package data_structures.unit3_external_packages_libraries.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

public class OrderProcessor {
    public static void main(String[] args) {
        // Create a list of products
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        
        // Create a map of prices
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Laptop", 999.99);
        prices.put("Mouse", 25.50);
        prices.put("Keyboard", 75.00);
        
        // Get current date
        LocalDate orderDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = orderDate.format(formatter);
        
        // Display order summary
        System.out.println("=== ORDER SUMMARY ===");
        System.out.println("Date: " + formattedDate);
        System.out.println("\nProducts:");
        
        for (String product : products) {
            Double price = prices.get(product);
            System.out.println("  " + product + ": $" + price);
        }
        
        // Calculate total
        double total = 0.0;
        for (Double price : prices.values()) {
            total += price;
        }
        
        System.out.println("\nTotal: $" + total);
        
        // Sort products alphabetically
        Collections.sort(products);
        System.out.println("\nProducts (sorted): " + products);
    }
}
