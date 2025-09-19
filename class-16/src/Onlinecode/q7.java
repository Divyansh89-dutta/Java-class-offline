package Onlinecode;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= (2 * (n - i) - 1); j++) {
                System.out.print(" ");
            }
            if (i != n) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
