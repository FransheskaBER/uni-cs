public class Maps {
    /*
    Maps is not a cOLLECTION so has different methods:
        doesnt use add()
        doesnt use remove(Object o)
        doesnt use iterator()
        doesnt use enhanced for-loop directly

        Instead have:
        put(key, Value) for addding/updating
        remove(Object key) for removing entry by key
        get(Object key) for retrieving value by key
        views for iteration:    
            keySet()
            values()
            entry()

    Map.Entry -> single entry that hold one key-val pair.
    Example:
        Map.Entry<K,V>  // Interface for a single key-value pair

        Methods:
        - K getKey()           // Get the key
        - V getValue()         // Get the value
        - V setValue(V value)  // Change the value
        - boolean equals(Object o)
        - int hashCode()
   
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        
        // use a for enhance loop to get all entries with Map.Entry<>
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());    
        }
        // Ouput:
        Key: 1, Value: Alice
        Key: 2, Value: Bob
    
    Set<K> keySet() -> returns all keys as a Set
        Example:
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Alice");
            map.put(2, "Bob");

            Set<Integer> keys = map.keySet(); // keys = {1, 2}
            for (Integer key: keys) {
                System.out.println(key); // 1, 2    
            }
    
    Collection<V> values() -> returns all values as a Collection
        Example:
            Collection<String> values = map.values();

            for (String value : values) {
                System.out.println(value); // Alive, Bob    
            }
    
    Set<Map.Entry<K, V>> entrySet() -> return all key-value pairs as Set
        Example:
        Set<Map.Entry<Integer, String>> keysWithValues = map.entrySet();

        for (Map.Entry<Integer, String> keyWithValue : KeysWithValues) {
            System.out.println(keyWithValue.getKey() + " -> " + keyWithValue.getValue()); //
        }

    get(key) -> returns value
        Example: String name = map.get(1); // return "Alice"
    
    put(key, value) -> add/update entry
        Example: String oldValue = map.put(1, "Fran"); // it will return "Alice" the old value
                 String newKey = map.put(3, "John"); // it will return null, since this is a new key
    
    putAll(Map<K, V> variableName) -> add all entries from another map
        Example: 
            Map<Integer, String> map2 = new HashMap<>();
            map2.put(3, "Charlie");
            map2.put(4, "Diana");

            map.putAll(map2); // adds both entries to "map"
    
    containsKey(key) -> return true/false if key exists
        Example:
            boolean hasKey1 = map.containsKey(1); // true
            boolean hasKey5 = map.constainsKey(5); // false
    containsValue(value) -> returns tru/false if value exists

    Common Collection Methods:
        map.clear();                    // map is now empty
        boolean empty = map.isEmpty();  // true/false
        int count = map.size()          // return number of key-val pairs

    
    HASHMAP:
        Fast for reading data
        Best for large datasets
        Memory efficient
        No order
        Slow for writing data -> put()
        Requires good hashcode()
        Uses hash table (calculates the hash of key to determine storage location)


    TREEMAP:
        Order - always sorted
        Best for range operations (firstKey(), lastKey(), subMap(), etc.)
        Slower than HashMap
        More memory
        Requires keys to be sortable

    LINKEDHASHMAP:
        Keeps insertion order (keys appear in the order they were added)
        Nearly as fast as HashMap
        More memory
        Use when you want HashMap speed + predictable order
        Best for building LRU cache

    */
}
