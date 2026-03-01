package unit8_exceptions_handling;

public class InvalidQuantityException extends Exception {
    public InvalidQuantityException() {
        super("The minimun order quantity must be at least 1");
    }

    public InvalidQuantityException(String message) {
        super(message);
    }
}
