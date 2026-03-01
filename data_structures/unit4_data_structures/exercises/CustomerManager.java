package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeMinors() {
        int removedCustomers = 0;

        Iterator<Customer> c = customers.iterator();
        while (c.hasNext()) {
            Customer first = c.next();
            if (first.getCustomerAge() < 18) {
                c.remove();
                removedCustomers++;
                System.out.println("Removed: " + first.getCustomerName() + " (age " + first.getCustomerAge() + ")");
            }
        }
        System.out.println("Total removed: " + removedCustomers);
    }

    public void printAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers");
        } else {
            for (Customer c : customers) {
                System.out.println("Name: " + c.getCustomerName() + ", Age: " + c.getCustomerAge());
            }
        }
    }

    public double getAverageAge() {
        double total = 0;
        if (customers.isEmpty()) {
            return 0.0;
        } else {
            for (Customer c : customers) {
                total += c.getCustomerAge();
            }
        }
        return Math.round((total / customers.size()) * 100.0) / 100.0;

    }

    public int getCustomerCount() {
        return customers.size();
    }
}
