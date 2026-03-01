public class Queues {
    /*
    FIFO (first in - first out)

    - Queue is like a line in a store, the first person in line, is the first being served.

    Features:
        - two end access from the front or from the back
        - OPERATIONS:
            enqueue (add/offer) -> add element to back of the queue
            dequeue (remove/poll) -> remove elemtn from the front of the queue
            peek (element/peek) -> look at front element without removing
    
    use-cases:
        - process order as they arrive
        - print documents in the order that have been submitted
        - help customers in the order they have arrived
        - execute tasks in the order they have been submitted
        - tree and graph algorithms

    add(element) -> throw IllegalStateException -> queue is full
    remove()     -> throw NoSuchElementException -> queue is empty
    element()    -> throw NoSuchElementException -> queue is empty

    SAFER ERRORS THROWS:
    offer(element) -> return FALSE if queue is full
    poll()         -> return NULL is queue is empty
    peek()         -> return NULL is queue is empty

    general-purpose queue -> linkedList
    Priority-base -> priorityQueue
    parallel-programming-base -> concurrentLinkedQueue
    array-based queue -> arrayDeque
    

    */
    
}
