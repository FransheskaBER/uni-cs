public class compareToMethod {
    /*
    COMPARISON WITH COMPARETO()

    OBJECT ORDERING - less than, greater than, equal to
    COMPARABLE interface - Java's standard way to define natural ordering
    compareTo() - compares objects and returns: -1, 0, 1
    generics: type-safe comparison for modern Java
    Lexicographical order: sorting like a phone book
    Wrapper classes and String methods to reuse exisiting implementaiton
    
    - with primitive types ORDER is easy, the value 5 is less (<) than 10. The issue is with objects.
    - with objects, Order is difficult:
    Example:
    Customer c1 = new Customer("Alice", 123);
    Customer c2 = new Customer("John", 456);

    - Every business needs to choose ONE way to decide who is coming first and later...
    - Java lets you use the interface Comparable<T> to define the natural ordering for your class. This interface
    has one method "compareTo()":

    public interface Comparable<T> {
        int compareTo(T other);
    }

    - It will return:
    1. NEGATIVE(-1): if "this" is LESS THAN "other" or "this" comes BEFORE "other"
    2. zero(0): if "this" is equal to "other"
    3. POSTIVE(1): if "this" is GREATER THAN "other" or "this" comes AFTER "other"

    implementation example:
    public class Customer implements Comparable<Customer> {
    .... 

        @Override
        public int compareTo(Customer other) {
            return Integer.compare(this.customerId, other.customerId);
        }
    }

    The "Comparable<Customer>" is like saying this class can be compare to other Customer objects/instances


    1. For int, double, float, etc.. use:
    return Integer.compare(this.id, other.id);

    2. For strings, use:
    return this.lastName.compareTo(other.lastName); - alphabetic order/case-sensitive/compares characters

    3. Lexicographical order (multiple fields - first stort by last name, then by first name, and then by ...)
    public int compareTo(Customer other) {
        // step1: compare by last name
        int lastNameComparison = this.lastName.compareTo(other.lastName);

        // step2: if last names are different, we are done
        if (lastNameComparison != 0){
            return lastNameComparison; 
        }

        // step3: if last names are the same, compare by first name (secondary)
        return this.firstName.compareTo(other.firstName);
    }

    */
}
