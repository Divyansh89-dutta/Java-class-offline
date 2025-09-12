import java.util.Scanner;

public class ValidVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + ", you are a valid voter.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("Hello " + name + ", you will be eligible to vote in " + yearsLeft + " years.");
        }
    }
}
