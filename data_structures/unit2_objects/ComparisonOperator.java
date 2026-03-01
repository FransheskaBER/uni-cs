/* COMPARISON WITH == OPERATOR

The == operator > compares VALUES for primitives and REFERENCES for objects
Identity (same object) vs Equality (same content)

A) Primitive types store values:
1. int
2. double
3. char
4. boolean

- when you compare variables "a" and "b", you are asking "do they contain the same number?"
int a = 5;
int b = 5;
System.out.println(a === b); // the output will be "TRUE" because both variables contain the value 5

B) Reference types store addresses (not values)
- These are complex types such as object like Customer, Product, String, etc.
- When you create an obj, Java creates the obj somewhere in memory and story the address (location)
of that obj in your variable, so the variable doesn't contain the obj itself but it contains its reference.

Example - create an object of class Customer:
Customer c1 = New Customer("Alice");
Customer c2 = New Customer("Alice");
Customer c3 = c1;
System.out.prinln(c1 == c2); // the output would be FALSE (different objs/addresses in memory)
System.out.prinln(c3 == c1); // the output would be TRUE (same objs/addresses in memory)

C) IDENTITY ==
- "Are these the same object?" (do they have the same address in memory?)

D) EQUALITY equals()
- "Do these objects have the same values?"
*/

public class ComparisonOperator {
//     private String name;
//     private double price;

//     public ComparisonOperator(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     public static void main(String[] args) {
//         ComparisonOperator c1 = new ComparisonOperator("Laptop", 999.99);
//         ComparisonOperator c2 = new ComparisonOperator("Laptop", 999.99);
//         ComparisonOperator c3 = c1;
        
//         System.out.println(c1 == c2); // false
//         System.out.println(c1 == c3); // true
//         System.out.println(c2 == c3); // false
//     }
}
