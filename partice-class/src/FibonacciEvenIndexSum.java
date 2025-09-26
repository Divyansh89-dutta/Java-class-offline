import java.util.Scanner;

public class FibonacciEvenIndexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += a;  // add number at even index
            }
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Sum of Fibonacci numbers at even indices up to n = " + n + " is: " + sum);

        sc.close();
    }
}
