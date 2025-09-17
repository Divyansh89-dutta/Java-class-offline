package onlinecode;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) {
                System.out.print(" ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
