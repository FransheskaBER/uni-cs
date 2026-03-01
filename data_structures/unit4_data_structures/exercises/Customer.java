package exercises;

public class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getCustomerName() {
        return this.name;
    }

    public int getCustomerAge() {
        return this.age;
    }
}