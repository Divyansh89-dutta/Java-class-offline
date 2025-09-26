package class3;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
//        static int countDivisors(int n) {
//            int count = 0;
//            for (int i = 1; i * i <= n; i++) {
//                if (n % i == 0) {
//                    if (i == n / i) {
//                        count++;   // perfect square
//                    } else {
//                        count += 2; // i and n/i
//                    }
//                }
//            }
//            return count;
//        }
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int X = 4;
        int count = 0; // number
        for (int num = 1; num <= N; num++) { // i = 10
            int divisorCount = 0; // divisor 1 = 1 2 = 2 value save jise divide ho rahi hai
            for (int i = 1; i <= num; i++) { //div
                if (num % i == 0) {
                    divisorCount++; // chalo
                }
            }
            if (divisorCount == X) {
                count++;// ice
            }
        }

        System.out.println("Count = " + count);
    }
}
