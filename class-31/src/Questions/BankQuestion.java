package Questions;
abstract class Bank {
    abstract double getInterestRate();
}
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}
class HDFC extends Bank{
    @Override
    double getInterestRate() {
        return 7.5;
    }
}
public class BankQuestion {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println("SBI Interst: " + b1.getInterestRate());
        System.out.println("HDFC Interst: " + b2.getInterestRate());
    }
}
