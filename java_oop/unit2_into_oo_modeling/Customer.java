package unit2_into_oo_modeling;

public class Customer {
    String firstname;
    String lastname;
    String email;

    public Customer(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("Hans", "Meier", "hans@email.com");
        Customer customer2 = new Customer("Anna", "Schmidt", "anna@email.com");

        System.out.println(customer1);
        System.out.println(customer2);
    }

}