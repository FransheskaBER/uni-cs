public class ComparisonHashCode {
    /* COMPARISON WITH HASHCODE()

    - hashCode() ONLY checks references FAST with == and SLOW with equals()
    - hashing is the proccess of converting objects to numbers
    - the hashCode() method generates hash codes which are unique integer indentifiers for objects
    - prime numbers in hashing like 31 are special
    - hash-based data strcutures like HashMap and HashSet

    - Objects that have the same content will have the same hash code 
    - different content means most of the time different hash code

    example:
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "bye";

    System.out.println(s1.hashCode());  // 99162322
    System.out.println(s2.hashCode());  // 99162322  (same content, same hash!)
    System.out.println(s3.hashCode());  // 113318802 (different content, different hash)\

    EVERY CLASS inherist a hashCode() method from the Object class kjust like toString() and equals(). 
    The default implemention uses the memory address like == which is not useful for content comparison.
    So, we should override hasCode() whenever you override equals()
    
    // this is an example of how you create hashcodes for object's fields:
    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price);
    }


    IMPORTANT: If two objects are equal according to equals() then they MUST have the ame hashcode.
    this is important because hash-base collections like hashMap and hashSet uses this assumption.


    */    
}
