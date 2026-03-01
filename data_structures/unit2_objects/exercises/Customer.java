package exercises;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public Customer (int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name=%s %s, email=%s]", customerId, firstName, lastName, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        return this.customerId == other.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(123, "Alice", "Smith", "alice@example.com");
        Customer c2 = new Customer(123, "Alice", "Johnson", "alice2@example.com");
        Customer c3 = new Customer(456, "Bob", "Smith", "bob@example.com");
        Customer c4 = c1;
        Customer c5 = new Customer(789, "Charlie", "Brown", "charlie@example.com");

        Set<Customer> allUniquecustomers = new HashSet<>();
        allUniquecustomers.add(c1);
        allUniquecustomers.add(c2);
        allUniquecustomers.add(c3);
        allUniquecustomers.add(c4);
        allUniquecustomers.add(c5);

        System.out.println(" === Customer Objects === ");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        System.out.println("");
        System.out.println(" === Testing equals() Method ");
        System.out.println("c1.equals(c2): " + (c1.equals(c2)) + " (same ID, different details)");
        System.out.println("c1.equals(c3): " + (c1.equals(c3)) + " (different ID)");
        System.out.println("c1.equals(c4): " + (c1.equals(c4)) + " (same reference)");
        System.out.println("");
        System.out.println(" === Testing hashCode() Method === ");
        System.out.println("c1.hashcode(): " + c1.hashCode());
        System.out.println("c2.hashcode(): " + c2.hashCode() + " (same as customer1 - same ID!)");
        System.out.println("c3.hashcode(): " + c3.hashCode() + " (different from customer1 - different ID)");
        System.out.println("");
        System.out.println(" === Testing with HashSet === ");
        System.out.println("Adding c1, c2, c3, c4, c5 to HashSet...");
        System.out.println("HashSet size: " + allUniquecustomers.size() + " (c1 and c2 are duplicates - same IDs)");
    }
}
