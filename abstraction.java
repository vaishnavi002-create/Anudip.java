//"Abstraction means hiding internal details and showing only essential features to the user."

//In this example, the ATM class defines what every ATM should do: check balance and withdraw money.
//But it doesn't define how the withdrawal happens — that part is abstract.



abstract class ATM {
   
    abstract void withdraw(double amount);

    
    void checkBalance() {
        System.out.println("Balance checked successfully.");
    }
}


class SBIATM extends ATM {
    @Override
    void withdraw(double amount) {
        System.out.println( + amount + " withdrawn from SBI ATM.");
    }
}


public class abstraction {
    public static void main(String[] args) {
        ATM atm = new SBIATM();
        atm.checkBalance();
        atm.withdraw(2000);
    }
}
