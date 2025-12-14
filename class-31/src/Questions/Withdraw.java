package Questions;
abstract class Account{
    double balance;
    Account(double balance){
        this.balance = balance;
    }
    abstract void withdraw(double amount);
    void deposit(double amount){
        balance += amount;
    }
}
class SavingAccont extends Account{
    SavingAccont(double balance){
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }
}
class CurrentAccount extends Account {
    CurrentAccount(double balance){
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
    }
}
public class Withdraw {
    public static void main(String[] args) {

    }
}
