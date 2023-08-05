class Account {

    public String accNo;
    public String name;
    public String email;
    public String address;
    public String phNo;
    public String dob;
    public double balance;

    public String getAccNo() { 
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getDob() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setPhNo(String p) {
        phNo = p;
    }

    public void setAddress(String add) {
        address = add;
    }

}

class SavingsAccount extends Account {

    public double fixedBalance;

    public double getFixedBalance() {
        return fixedBalance;
    }

    public void setFixedBalance(double fd) {
        this.fixedBalance = fd;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -=amount;
    }

    public void fixedDeposit(double amount) {
        fixedBalance += amount;
    }
    public void liquidate(double amount) {
        fixedBalance -= amount;
    }
}

class LoanAccount extends Account {
    public double loanBalance;

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public void payEMI(double amount) {
        loanBalance -= amount;
    }

    public void topUpLoan(double amount) {
        loanBalance += amount;
    }

    public void repayment(double amount) { 
        if(balance == amount)
        loanBalance = 0;
    }
}

public class AccountChallenge {
    public static void main(String args[]) {
        Account a = new Account();
        SavingsAccount s = new SavingsAccount();
        LoanAccount l = new LoanAccount();
    }
    
}
