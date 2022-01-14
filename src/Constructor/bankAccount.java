package Constructor;

public class bankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public bankAccount() {
        this("56789", 2.50, "Default Name", "Default address", "Default phone");
        System.out.println("empty constructor called");
    }

    public bankAccount(String number, double balance, String customerName, String customerEmailAddress,
                       String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.customerName = customerName;
        this.number = number;
        this.balance = balance;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public bankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999", 100.5, customerName, customerEmailAddress, customerPhoneNumber);
        System.out.println("customer: " + customerName);
        System.out.println("partial called");
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of" + depositAmount + " made, new balance is" + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not precessed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdraw of " + withdrawalAmount + "processed with balance" + this.balance );
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

