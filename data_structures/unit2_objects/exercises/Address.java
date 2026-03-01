package exercises;

public class Address implements Cloneable {
    private String street;
    private String city;
    private String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.zipCode = other.zipCode;
    }

    @Override
    public Address clone() {
        try {
            Address copy = (Address) super.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return String.format("Address[street=%s, city=%s, zipcode=%s]", street, city, zipCode);
    }

    public void setStreet(String newStreet) {
        this.street = newStreet;
    }
}
