package unit6_important_concepts;

public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        double fee = getTransactionFee(amount);
        double total = getTotalCost(amount);
        System.out.println("Transaction fee: $" + fee);
        System.out.println("Total charged: $" + total);
    }

    @Override
    public double getTransactionFee(double amount){
        return (amount * 0.029) + 0.30;
    }

    public static void main(String[] args) {
        CreditCard c1 = new CreditCard();
        c1.processPayment(100);
        c1.processPayment(50);
        c1.processPayment(25);
    }
}
