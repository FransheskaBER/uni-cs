// ToString obj inherits the method "toString()" from the Object class
// OBJECT class is the PARENT of all classes
// By overridin (re-writing) this method in your class, you can define ONCE how your obj should be displayed as text

// example
public class ToStringMethod {
    private String name;
    private String email;
    private int id;

    // contructor
    public ToStringMethod(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    // override toString() - to define how this object looks as text
    @Override
    public String toString() {
        return "Customer[name=" + name + " , email=" + email + ", id=" + id + "]"; 
    }
}

// Using it
// ToString mycustomer = new ToStringMethod("Alice", "alice@example.com", 123);
// System.out.prinln(mycustomer) => OUTPUT: Customer[name=Alice, email=alice@example.com, id=123]



/* Every class automatically inherits from a special class called OBJECT

This object class provides some basic methods:
1. toString() = converts object to string
2. equals() = compare objects
3. hashCode() = generate a number representing the object (useful for collections)

*/

