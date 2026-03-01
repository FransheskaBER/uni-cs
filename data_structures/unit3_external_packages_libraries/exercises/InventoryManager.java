// package data_structures.unit3_external_packages_libraries.exercises;

import java.util.*;

public class InventoryManager {
    public static void main(String[] args) {
        // Use ArrayList
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Electronics");
        categories.add("Books");
        categories.add("Furniture");
        
        // Use HashMap
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Laptop", 15);
        stock.put("Mouse", 50);
        
        // Use HashSet
        HashSet<String> suppliers = new HashSet<>();
        suppliers.add("TechCorp");
        suppliers.add("OfficeSupply Co");
        
        // Use Collections utility
        Collections.sort(categories);
        
        // Display inventory
        System.out.println("=== INVENTORY MANAGER ===");
        System.out.println("Categories: " + categories);
        System.out.println("Stock levels: " + stock);
        System.out.println("Suppliers: " + suppliers);
    }
}
