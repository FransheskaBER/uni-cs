public class Sets {
    /*
    SETS
        - no duplicates
        - fast membership tresting wtih contains()
        - No order/index

    SET INTERFACE
        - Set uses exisiting Collection methods like:
            add(element)
            remove(obj)
            contains(obj)
            size()
            isEmpty()
            clear()
        - equals() will return true if they have the same number of items and the same items, order doesnt matter
            if (set1.equals(set2) == true) { they are condirered duplicates } 
            Example:
            Product p1 = new Product("Laptop", 999);
            Product p2 = new Product("Laptop", 999);

            Set<Product> products = new HashSet<>();
            products.add(p1);
            products.add(p2);

            // Are p1 and p2 duplicates? Depends on Product's equals() method!
            // If equals() compares by name and price → YES, duplicate
            // If equals() not overridden (default) → NO, different objects

        

    HASHSET VS TREESET
        - For HashSet, if you want your objects to be considered duplicates because of their id, 
            then you need to override equals() and hashcode() int he object/class itself.
        - For TreeSet, your objects must implement Comparable or you can provide a Comparator.


        - HashSet:
            Fast but not order
            Good for large datasets
            memory efficient
            Requires good hashcode()
            cannot iterate in sorted order
            mostyl for ionsead operatins
        
        - TreeSet
            Sorted but slower
            always sorted
            can get ranges first(), last(), subset()
            predictable performance
            slower than hashset
            more memory
            requires comparable
            use it when you need to find ranges, minimum or maximum and dataset is not too large
    
    
    SET OPERATIONS
        - y.containsAll(x) --> returns true if all elements of X are in Y
        - y.retainAll(x) --> keep ONLY commons elements in both X and Y (keep an eye that this method modifies the caling set so make a copy
        - y.removeAll(x) --> remove common elements in both X and Y and return just unique elements from Y
        - y.addAll(x) --> return true if elements from both X and Y where succerssfully combined

        

    */
}
