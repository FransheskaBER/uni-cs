import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    /*
    LIFO (last in - first out)

    Stack - is like a stack of plates, where you can only move or add from the top. So, the LAST plate you put on, is the FIRST one you take off.

    Methods:
        push() -> add element on top
        pop() -> remove and return top element
        peek() -> look at the top element without removing
    
    Use cases:
        - Undo action
        - Browser back button
        - Track function calls
        - Calculate math expressons
        - Reverse last edits in a text editor undo
    */
    public static void main(String[] args) {
        
        Deque<String> stack = new ArrayDeque<>();
        stack.addFirst("First");
        stack.addFirst("second");
        stack.addFirst("third");

        System.out.println(stack); // [third, second, First]

        String third = stack.removeFirst(); // it removes and returns "third"
        System.out.println(third);

        String second = stack.peekFirst(); // it will return "second"
        System.out.println(second);

        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.size()); // 2
    }
}
