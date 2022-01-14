package Constructor;

public class VipCustomer {
    public String name, emailAddress;
    public double creditLimit;

    public VipCustomer() {
        this("Default name", "123@email.com", 5000.00);
    }
    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, "123@gmail.com", creditLimit);
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
