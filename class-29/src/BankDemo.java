// File: BankDemo.java
class BankAccount {
    protected double balance;
    BankAccount(double b){ balance = b; }
    void deposit(double a){ balance += a; }
    void withdraw(double a){ balance -= a; }
    double getBalance(){ return balance; }
}

class SavingsAccount extends BankAccount {
    private double rate;
    SavingsAccount(double b, double r){ super(b); rate = r; }
    void addInterest(){ balance += balance * rate; }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1000, 0.05);
        s.addInterest();
        System.out.println("After interest: " + s.getBalance());
    }
}
