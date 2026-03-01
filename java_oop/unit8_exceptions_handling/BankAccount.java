package unit8_exceptions_handling;

public class BankAccount {
    private double balance;
    private boolean frozen;

    public double transfer(double amount, String targetAccountId) {
        if (amount <= 0) return -1.0; // the -1.0 can be 1 or 0 and does that mean that the amount is not correct? we are onyl returning not throwing an error that can handle this is a simple solution cthat can be fixed but here we are oalready returning with a value instead of handling.
        if (targetAccountId == null) return -2.0; // What if the account is not null but it doesnt exist? We are just checking against null or not so this can cause a silent bug
        if (frozen) return -3.0; // the problem here is that we are not sending the caller any info about the account is frozen hence cannot make the transfer, unless the caller knows what -3.0 means but it can also be other numbers and can be confusin.
        if (balance < amount) return -4.0; // what if is exactly as the amount, tehcnically you can withdraw but th eissue is the number again can be confusing with the actual balance.

        balance -= amount;
        return balance;
    }

    public static void main(String[] args) {
        // the transfer can failed for 4 different reasons. for the amount being less or equal to 0, we need the information saying that the amount is not acceptable that we need a minimun amount.
        //  for the targetAccountId as null we need first of all check that the account is not null and then check if it exists or is valid, if not we need an exception to handle it and check the account id.
        // for the frozen being false, we can handle it by sending a permission to transfer is not allowed so the caller knows that the account is frozen hence not permission to transfer.
        // The amount being less that the balance also can handle by sending an error that not sufficient balance  so caller knows the actual issue is not the transfer but rather the amount is too hight compared to the available balance.
        BankAccount account = new BankAccount();
        double result = account.transfer(500.0, "ACC-9921");
        System.out.println("New balance: " + result);
    }
}


