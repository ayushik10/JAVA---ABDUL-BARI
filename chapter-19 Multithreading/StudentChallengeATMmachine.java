class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name+ " is Checking");

        try{ Thread.sleep(1000); }
        catch(Exception e) {}

        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name+ " is Withdrawing ");

        try{ Thread.sleep(1000); }
        catch(Exception e) {}

        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    Customer(String n, int amt, ATM a) {
        name = n;
        amount = amt;
        atm = a;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

public class StudentChallengeATMmachine {
    public static void main(String args[]) {
        ATM atm = new ATM();

        Customer c1 = new Customer("Flora", 1000, atm);
        Customer c2 = new Customer("Alice", 150, atm);
        
        c1.start();
        c2.start();
    }
}
