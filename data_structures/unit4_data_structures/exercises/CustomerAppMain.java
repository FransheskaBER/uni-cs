package exercises;

public class CustomerAppMain {
    public static void main(String[] args) {
        // create a CustomerManager
        CustomerManager manager = new CustomerManager();

        // create and add customers
        manager.addCustomer(new Customer("Alice", 25));
        manager.addCustomer(new Customer("Bob", 15));
        manager.addCustomer(new Customer("Charlie", 30));
        manager.addCustomer(new Customer("Diana", 12));
        manager.addCustomer(new Customer("Eve", 22));
        manager.addCustomer(new Customer("Frank", 17));

        // print all customers
        System.out.println("All Customers:");
        manager.printAllCustomers();
        System.out.println("");

        // print customer count
        System.out.println("Total customers: " + manager.getCustomerCount());

        // print average age
        System.out.println("Average age: " + manager.getAverageAge());
        System.out.println("");

        // remove minors (should remove Bob, Diana, Frank)
        System.out.println("Removing minors...");
        manager.removeMinors();
        System.out.println("");

        // print all customers again
        System.out.println("All Customers:");
        manager.printAllCustomers();
        System.out.println("");

        // print new customer count
        System.out.println("Total customers: " + manager.getCustomerCount());

        // print new average age
        System.out.println("Average age: " + manager.getAverageAge());


    }
}
