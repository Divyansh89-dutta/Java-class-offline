package onlinecode;

import java.util.Scanner;

public class q1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
