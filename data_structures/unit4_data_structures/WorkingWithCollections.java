public class WorkingWithCollections {
    /* 
    
    ITERATOR
        - tracks current position in collection
        - lets you check if there is a NEXT element
        - lets you get the next element
        - lets you remove the current element
        - Why is important?
            Because collections like SET dont have indices (unlike arrays or List).
            so how do you loop through a HASHSET? by using an iterator.

        Example:
        Collection: [Apple, Banana, Cherry, Date]
        Iterator:    ↑ (starts before first element)

        hasNext() → true (Apple exists)
        next() → Apple (iterator moves to Apple)
                ↑
        hasNext() → true (Banana exists)
        next() → Banana (iterator moves to Banana)
                    ↑
        ... and so on
    

    ITERATOR INTERFACE AND METHODS
        - Interfaces:
            1. Iterable<T>
                For any collection you can loop through
                Has one method iterator() which returns an Iterator<T>
                Collection<E> extends Iterable<T> (so all collections are iterable)

            2. Iterator<T>
                This is it does the ACTUAL iteration
                Has methods like hasNext(), next(), remove() 

            Example:
            Collection<String> names = new ArrayList<>();
            // Collection extends Iterable, so it has iterator() method

            Iterator<String> it = names.iterator();  // Get the iterator
            // Now use it to loop through

        - Methods:
            boolean hasNext() - is there another element ahead?
                Iterator<String> it = collection.iterator();
                if (it.hasnext()) { ... }
            
            E next() - return the next element and moves the iterator forward
                String element = it.next();
                
                Safer option:
                if (it.hasNext()) {
                    String element = it.next();    
                }

            void remove() - removes the current element (the one just retuned by next())
                String element = it.next(); -> get the element first
                it.remove(); -> then remove it from the collection

    ENHANCED FOR-LOOP
        - It is also called "for-each loop" 
        - cleaner syntax for iterating when your dont need to remove elements
        
        Syntax:
        for (ElementType variableName : collection) { ... }

        public void outputAllCustomer(Collection<Customer> c) {
            for (Customer k : c) {
                System.out.println(k)    
            }
        }

    WHEN TO USE ITERATOR VS FOR-EACH
        Use Iterator when:
        ✅ Need to remove elements during iteration
        ✅ Need more control (e.g., skip elements conditionally)
        ✅ Working with older code

        Use Enhanced For-Loop when:
        ✅ Just reading/processing elements
        ✅ Want cleaner, more readable code
        ✅ Not removing anything


        EXAMPLE:
        // Iterator (verbose but powerful)
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String name = it.next();
            if(name.startsWith("A")) {
                it.remove();  // Can remove!
            }
        }

        // Enhanced for-loop (clean and simple)
        for(String name : names) {
            System.out.println(name);  // Read-only
            // names.remove(name);  // ❌ Would crash!
        }


*/
    
}
