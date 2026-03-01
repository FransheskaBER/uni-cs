public class Collections {
    /* Collections grows as needed.
    
    List<Product> cart = new ArrayList<>(); -> Starts small and grows automaticallt
        cart.add(product1);
        cart.add(product2);
        ..... ass thousands as needed
    
    Collections have dynamic size, built-in methods like add/remove/sort/search, it's type-safety with generics List<Customers>
    means only hold Customers objects and, you can use it to implement different needs (like fast access or fast assertions).

    Collection Framework - is a toolkit of ready-made data structures.
        Includes:
            1. Interfaces (Collection, List, Set, Map, Queue) - contracts that define what methods exist.
            2. Implementations (ArrayList, LinkedList, HashSet, TreetSet, HashMap) - classes you can use.
            3. Algorithms (sorting, searching, etc...)
            4. Utilities (helper methods)

    Important: to understand the different between "INTERFACES" and "IMPLEMENTATIONS":
        - Interfaces is what you can do => I can add items, I can remove items, etc...
        - Implementations is how it is done internally => I want to story this as an array, I want to store this as a linked nodes, etc..
    
    
    Collection<E> is the parent interface for most collections. It defines methods that work on any collection(list, set, etc..)
        Collection<String> names;
        Collection<Customer> customers;
        Collection<Integer> numbers;
    
    A) Add Element to Collection
        List<String> names = new ArrayList<>();
        names.add("Alice"); -> return true if added successfully
        names.add("Bob");
        -> names = ["Alice", "Bob"];
    
    B) Remove Element
        names.remove("Alice");
    
    C) Return Current Number of Elements
        names.size();

    D) Check if collection has zero elements
        if (names.isEmpty()) {...}

    E) Check if specific element exists in collection
        if (names.contains("Bob")) {...}

    F) Remove all elements
        names.clear();

    G) Get an iterator to loop through all elements
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    
    H) Convert collection to an array
        Object[] array = names.toArray(); -> collection to regular array


    DATA STRUCTURES:

    1. LIST
        - is ordered (the first added is the first in the list)
        - allows duplicates
        - accessed by index (list.get(0))
        - interface: 
            java.util.List
        - implementation:
            ArrayList (fast random access like an array but grows automatically)
            LinkedList (fast insertion/deletion at beginning/middle)

    2. SET
        - no duplicates (allows unique items only)
        - is no ordered (elements may appear in any order)
        - no index access
        - interface:
            java.util.Set
        - implementation:
            HashSet (fast add/remove/search, randome order)
            TreeSet (keeps elements sorted, slightly slower)

    3. MAP (key-value pairs)
        - Key-Value pairs
        - Fast lookup by KEY (Customer c = customers.get(key))
        - keys must be unique
        - interface:
            java.util.Map
        - implementation:
            HashMap (fast, random order)
            TreeMap (keeps key sorted)
            LinkedHashMap (maintains insertion order)

    4. QUEUE - first-in/first-out (FIFO)
        - FIFO ordering (first added = first removed)
        - is ordered
        - allows duplicates
        - it is like a line at a store
        - interface:
            java.util.Queue
        - implementation:
            LinkedList (fast insertion/deletion at the beggining/middle)

    5. DEQUE - double-ended queue (can do LIFO or FIFO)
        - can do undo functions (reverse user actions)
        - is ordered
        - allows duplicates
        - can add/remove from both ends
        - can act as Stack (LIFO) or Queue (FIFO)
        - interface:
            java.util.Deque
        - implementation:
            ArrayDeque:
                Deque<Action> undoStack = new ArrayDeque<>();
                undoStack.push(action1); -> add to top
                undoStack.push(action2); -> add to top
                Action last = undoStack.pop(); -> gets action2 (last in, first out)
    */

}
