public class Lists {
    /*
    LISTS: ORDERED COLLECTIONS
        - Elements are stored in the exact sequence you added them
        - access elements by their index (position number)
        Order matters use cases:
            - shopping cart, todo list, playlist

    LIST INTERFACE METHODS
        - List interface extends Collection, and it has all Collection methods:
            add()
            remove()
            size()
        - specific List-only methods for index-based operations:
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add(0, "Banana"); -> insert banana at index 0

            fruits.addAll(1, newCollection); -> you can use addAll() to insert collections

            String removed = fruits.remove(1); -> remove item at index 1 and return it
            - remove(int index) -> remove by position (list method)
            - remove(Object o) -> remove by value (collection method)

            String old = fruits.set(1, "Blueberry"); -> replace fruit at index 1 with "blueberry" and return the replaced fruit

            List<String> fruitsWithHighCalories = fruits.subList(1, 4); -> return fruits from index 1 to index 3 (4 is exclusive)

    ARRAYLIST
        - Stored elements in an internal array that gtows automatically when needed
        - think of it like a "smart array"
        - fast random access get(index)
        - fast iteration
        - memory efficient
        - slow insertion/deletion in middle
        - slow when growing
        - wasted capacity

        Use only when:
            - need fast access by index
            - add elements at the end
            - you want to read more than write
            - size is stable

    LINKEDLIST
        - stored elements as nodes (objects) that point to each other and each node has:
            the actual data, reference to previous node and next node.
        - fast insertion/deletion anywhere 
        - no waste capacity
        - no copying or resizing
        - slow random access
        - more memory per element
        - slow iteration

        Use only when:
            - you need to frequently insert and delete elements
            - you need to change the size a lot
            - you dont need random access by index
            - you need to implement queue or deque.
    */
}
