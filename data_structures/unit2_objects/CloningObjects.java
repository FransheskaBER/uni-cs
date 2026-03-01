public class CloningObjects {
    /*

    HOW TO CREATE COPIES OF OBJECTS

    1. CALL BY VALUE vs CALL BY REFERENCE
    - When we pass arguments or parameters to methods in Java, the behaviour differs between primitives and objects.
    a) For example > call by value(Primitives):
    public static void changeValue(int x) {
        x = 100; // Here we are changing only the local copy
    }
    public static void main(String[] args) {
        int num = 5;
        changeValue(num);
        System.out.println(num); // it will print 5 unchanged    
    }
    Changes to X inside the method donts affet "num"

    - in call by reference means that Java pass the reference of an object A to another object B, and then when you call a method
    that changes some field, it actually also changes in both A and B. This dones't apply when calling by value.



    2. CLONE() method
    - This method is inherited from the Object parent class and creates a copy of an object.

    3. CLONEABLE interface means that this class can be cloned safely. 
    without this interface calling super.clone() will throw an exception like clone not supported..

    4. SHALLOW COPY vs DEEP COPY
    a) shallow copy - copies the object's fields. If the field is a reference to another object, it only
        copy the refrence not the object itself. The result is that the original and copy SHARE same objects.
        the default clone() does shallow copy.
    b) deep copy - copies the object's fields. If a field is a refrence to another object, the entired referenced
        is also copied. Result is the original and copy are completely independent.
        here you do shallow copy first for refular fields with:
        super.clone()
        and for fields that reference another object do, deep copy with:
        this.object.clone()


    5. COPY CONSTRUCTORS
    instead of using clone(), modern Java prefers copy constructors
    
    a) Regular constructor:
    public Customer(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    b)Copy contructor:
    public Customer(Customer other) {
        this.id = other.id;
        this.address = new Address(other.address);
    }
    c) then you use it like this:
    Customer original = new Customer(123, new Address("main str 123"));
    Customer copy = new Customer(original); // it uses the copy constructors
    copy.getAddress().setStreet("Oak Ave");
    System.out.println(original.getAddress().getStreet()); // "Main str 123" (unchanged)
    System.out.println(copy.getAddress().getStreet()); // "Oak Ave" (changed)

    - When you use copy constructors, you DO NOT NEED TO USE:
    1. No need to handle the exception clonenot supported
    2. No need to implement the cloneable interface
    3. No need for casting
    */
}
