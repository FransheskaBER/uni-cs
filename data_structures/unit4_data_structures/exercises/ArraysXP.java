package exercises;

public class ArraysXP {
    public static void printAllCustomers(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Customer " + (i + 1) + ": " + items[i]);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        printAllCustomers(names);
        System.out.println("Total customers: " + names.length);
        names[2] = "Carlos";
        System.out.println();
        printAllCustomers(names);
    }
}
