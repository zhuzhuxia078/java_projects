package Constructor;

public class Main {
    public static void main(String[] args) {

        bankAccount myAccount = new bankAccount();

        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());
        myAccount.withdrawal(100.0);

        myAccount.deposit(101.0);

        bankAccount timsAccount = new bankAccount("Tims", "123@gmail.com", "12345");
        System.out.println(timsAccount.getCustomerName());
        System.out.println(timsAccount.getCustomerPhoneNumber());
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());


        // create new Vip customer
        // have 3 fields name, credit limit, email address
        // create 3 constructors

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 2500.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", "tim@gmail.com", 200.00);
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());


        // Check Wall
        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());

    }
}
