/* COMPARISON WITH EQUALS() METHOD
- the equals() method compares objects by CONTENT, not reference
- you can override equals() to customise how your class defines "equality"
- you can use the instanceof operator to check the type of object
- you can use "casting" to convert an object to a specific class type

- every class inherits equals from the Object parent class but the defaul implementation
uses == operator (meaning it compares references/addresses in memory). To make it compare 
content, you must override it.
*/

public class EqualsMethod {
    // private String name;

    // public EqualsMethod(String name) {
    //     this.name = name;
    // }

    // public static void main(String[] args) {
    //     EqualsMethod obj = new EqualsMethod("John");
    // }

    // @Override
    // public boolean equals(Object obj) { // is obj actually a EqualsMethod? before i try to access its name field
    //     // step 1: Check if it's the exact same object
    //     if (this == obj) return true;
        
    //     // step 2: check if obj is the right type - syntax: obj instanceof ClassName
    //     if (!(obj instanceof EqualsMethod)) return false;
    //     // Example:
    //     // Object obj = "Hello";  // A String
    //     // if (obj instanceof Customer) {
    //     //     System.out.println("It's a Customer");
    //     // } else {
    //     //     System.out.println("Not a Customer");  // This will print
    //     // }


    //     // step 3: cast obj to your class so you can acces it fields - "I know this Object obj is actually a EqualsMethod class, so let me treat it as one"
    //     // this converts the generic Object reference into a c EqualsMethod reference, allowing you to access EqualsMethod-spefici fields like name
    //     EqualsMethod other = (EqualsMethod) obj;
    //     // Example:
    //     // Object obj = new Customer("Bob", 456);
    //     // obj.customerId;  // ERROR! Object class doesn't have customerId field
    //     // Customer c = (Customer) obj;  // Cast it
    //     // c.customerId;  // ✅ Now we can access Customer fields

    //     // step 4: Compare the relevant fields content - equality
    //     return this.name.equals(other.name);
    //     // for string fields we use equals() - [String is an object hence use equals() otherwise use ==]
    // }
}
