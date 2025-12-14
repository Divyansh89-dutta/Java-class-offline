package Questions;
abstract class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    abstract double calculateBonus();
}
class PermanentEmployee extends Employee{
    PermanentEmployee(String name, double salary){
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}
class ContractEmployee extends Employee{
    ContractEmployee(String name, double salary){
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}
public class Bonus {
    public static void main(String[] args) {
        Employee p1 = new PermanentEmployee("Divyansh", 2000);
        Employee c1 = new ContractEmployee("Rishi", 3000);

        System.out.println("Name: " + p1.name);
        System.out.println("Bonus: " + p1.calculateBonus());

        System.out.println("Name: " + c1.name);
        System.out.println("Bonus: " + c1.calculateBonus());
    }
}

