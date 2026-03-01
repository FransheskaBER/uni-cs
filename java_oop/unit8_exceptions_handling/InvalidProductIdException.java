package unit8_exceptions_handling;

public class InvalidProductIdException extends Exception {
    public InvalidProductIdException() {
        super("Product ID is empty or null");
    }

    public InvalidProductIdException(String message) {
        super(message);
    }
    
}
