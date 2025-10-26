import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle a: ");
        int a = sc.nextInt();
        System.out.print("Enter angle b: ");
        int b = sc.nextInt();
        System.out.print("Enter angle c: ");
        int c = sc.nextInt();

        int sum = a + b + c;

        if (sum == 180 && a != 0 && b != 0 && c != 0) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
