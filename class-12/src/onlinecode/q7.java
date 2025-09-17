package onlinecode;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (A == 0 && B == 0) {
            System.out.println("Undefined");
        } else {
            double result = Math.pow(A, B);
            if (result % 1 == 0) {
                System.out.println((int) result);
            } else {
                System.out.println(result);
            }
        }
    }
}
