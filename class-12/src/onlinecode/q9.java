package onlinecode;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            int divisors = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0){
                    divisors++;
                }
            }
            if (divisors == x){
                count++;
            }
        }
        System.out.println(count);
    }
}
