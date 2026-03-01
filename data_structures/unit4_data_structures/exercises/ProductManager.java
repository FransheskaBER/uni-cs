package exercises;

import java.util.Set;
import java.util.HashSet;

public class ProductManager {
    static Set<String> productNames = new HashSet<>();

    static void addProduct(String name) {
        if (productNames.add(name)){
            System.out.println("Added: " + name);
        } else {
            System.out.println(name + " already exists - not added");
        }
    }

    static void removeProduct(String name) {
        if (productNames.remove(name)) {
            System.out.println("Removed: " + name);
        } else {
            System.out.println(name + " not found - cannot remove");
        }
    }

    static void showAllProducts() {
        if (productNames.isEmpty()) {
            System.out.println("No products in assortment");
        } else {
            System.out.println("Products: " + productNames);
        }
    }

    static int getProductCount() {
        return productNames.size();
    }

    public static void main(String[] args) {
        addProduct("Laptop");
        addProduct("Mouse");
        addProduct("Keyboard");
        addProduct("Monitor");
        addProduct("Mouse");
        showAllProducts();
        System.out.println("Total products: " + getProductCount());
        removeProduct("Keyboard");
        removeProduct("Tablet");
        showAllProducts();
    }
}
