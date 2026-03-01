import java.util.Scanner;

public class Practice {
    // private int accountNum;
    // private double balance;
    // private String accountHolderName;
    // private boolean isActive;
    // private char accountTypeCode; 
    private double totalPrice;

    public double addItem(double itemPrice, int quantity) {
        double itemSubtotal = itemPrice * quantity;
        int discount;
        if (quantity > 5) {
            discount = 10;
        } else {
            discount = 0;
        }
        double itemTotal = itemSubtotal - (itemSubtotal * discount / 100);
        this.totalPrice = totalPrice + itemTotal;
        return itemTotal;
    }

    public void calculation() {
        // declaration of local variables only
        // int num1;

        // // assignment
        // num1 = 123;

        // // declaration + assignment
        // int num2 = 456;
    }

    public String calculateGrade(int score) {
        if (score < 0 || score > 100) return "Invalid";
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        return "F";
    }

    public boolean canVote(int age, boolean isCitizen) {
        return age >= 18 && isCitizen;
    }

    static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) { // each row
            for (int j = 1; j <= n; j++) { // each column
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    static void sumUntilNegative() {
        Scanner userInput = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = userInput.nextInt();
            
            if (num >= 0) break;
            sum += num;
        }
        System.out.println("Sum: " + sum);
        userInput.close();
    }

    public static void main(String[] args) {
        // int a = 5 / 2; // 2 because int are whole numbers
        // double b = 5 / 2; // 2.0 because doubles are decimals 
        // double c = 5.0 / 2; // 2.5
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println();
        // System.out.println(a + ", " + b + ", " + c); // 2, 2.0, 2.5

        Practice.printMultiplicationTable(3);
        Practice.sumUntilNegative();
    }
}