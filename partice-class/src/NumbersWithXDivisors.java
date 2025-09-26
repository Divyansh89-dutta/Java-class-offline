import java.util.Scanner;

public class NumbersWithXDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("Enter X: ");
        int X = sc.nextInt();

        int count = 0;

        for (int num = 1; num <= N; num++) {
            int divisors = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisors++;
                }
            }
            if (divisors == X) {
                count++;
            }
        }

        System.out.println("Count of numbers with exactly " + X + " divisors: " + count);

        sc.close();
    }
}
