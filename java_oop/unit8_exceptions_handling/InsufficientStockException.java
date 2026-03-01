package unit8_exceptions_handling;

public class InsufficientStockException extends Exception {
        public InsufficientStockException() {
        super("Quantity order value exceeds available stocks");
    }

    public InsufficientStockException(String message) {
        super(message);
    }
    
}
