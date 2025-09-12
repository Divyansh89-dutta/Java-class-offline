import java.util.Scanner;

public class GeraterBetweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Greatest number: " + a);
        } else if (b > a) {
            System.out.println("Greatest number: " + b);
        } else {
            System.out.println("Both numbers are equal!");
        }
    }
}
