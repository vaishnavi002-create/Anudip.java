// A class is like a blueprint, template used to store the object
//An object is a real instance of a class.



 //store and display information about a car (brand and year)."

class BankAccount {
    String name;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.name = "Vaishnavi";
        acc.balance = 1000;

        acc.deposit(500);
        acc.show();
    }
}


