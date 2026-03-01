package exercises;

public class Customer3 implements Cloneable {
    private int id;
    private String name;
    private Address address;

    public Customer3(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Customer3(Customer3 other) {
        this.id = other.id;
        this.name = other.name;
        this.address = new Address(other.address);
    }

    public Customer3 shallowClone() {
        try {
            return (Customer3) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Customer3 deepClone() {
        try {
            Customer3 deepCopy = (Customer3) super.clone();
            deepCopy.address = this.address.clone();
            return deepCopy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name=%s, address=%s]", id, name, address);
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public static void main(String[] args) {
        System.out.println("=== ORIGINAL CUSTOMER ===");
        Customer3 original1 = new Customer3(123, "Alice", new Address("Main St", "Boston", "02101"));
        System.out.println(original1);
        System.out.println();

        System.out.println("=== TEST 1: SHALLOW CLONE (BUGGY) ===");
        System.out.println("Before modifying clone:");
        System.out.println("  Original: " + original1);
        Customer3 shallowClone = original1.shallowClone();
        System.out.println("  Shallow Clone: " + shallowClone);
        System.out.println();

        System.out.println("Modifying shallow clone's address to \"Oak Ave\"...");
        shallowClone.getAddress().setStreet("Oak Ave");
        System.out.println();

        System.out.println("After modifying clone:");
        System.out.println("  Original: " + original1);
        System.out.println("  Shallow Clone: " + shallowClone);
        System.out.println();
        System.out.println("⚠️ BUG: Original was also modified! (Both share the same Address object)");
        System.out.println();

        System.out.println("=== TEST 2: DEEP CLONE (CORRECT) ===");
        Customer3 original2 = new Customer3(456, "Bob", new Address("Park Ave", "NYC", "10001"));
        System.out.println("Before modifying clone:");
        System.out.println("  Original: " + original2);
        Customer3 deepClone = original2.deepClone();
        System.out.println("  Deep Clone: " + deepClone);
        System.out.println();

        System.out.println("Modifying deep clone's address to \"5th Ave\"...");
        deepClone.getAddress().setStreet("5th Ave");
        System.out.println();

        System.out.println("After modifying clone:");
        System.out.println("  Original: " + original2);
        System.out.println("  Deep Clone: " + deepClone);
        System.out.println();
        System.out.println("✅ CORRECT: Only the clone was modified! (Independent Address objects)");
        System.out.println();

        System.out.println("=== TEST 3: COPY CONSTRUCTOR (MODERN APPROACH) ===");
        Customer3 original3 = new Customer3(789, "Charlie", new Address("Broadway", "LA", "90001"));
        System.out.println("Before modifying copy:");
        System.out.println("  Original: " + original3);
        Customer3 copy = new Customer3(original3);
        System.out.println("  Copy: " + copy);
        System.out.println();

        System.out.println("Modifying copy's address to \"Sunset Blvd\"...");
        copy.getAddress().setStreet("Sunset Blvd");
        System.out.println();

        System.out.println("After modifying copy:");
        System.out.println("  Original: " + original3);
        System.out.println("  Copy: " + copy);
        System.out.println();
        System.out.println("✅ CORRECT: Only the copy was modified! (Independent Address objects)");
        System.out.println();

        System.out.println("=== SUMMARY ===");
        System.out.println("Shallow Clone: ❌ Buggy - shares references");
        System.out.println("Deep Clone: ✅ Works - but complex with clone()");
        System.out.println("Copy Constructor: ✅ Works - simpler and more maintainable (RECOMMENDED!)");
    }
}
