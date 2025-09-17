package onlinecode;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i <= 2 * n; i++) {
            if (i == 0) {
            } else if (i == 1) {
            } else {
                int fib = a + b;
                a = b;
                b = fib;

                if (i % 2 == 0) {
                    sum += fib;
                }
            }
        }

        System.out.println(sum);
    }
}
