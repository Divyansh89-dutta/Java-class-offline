package offlinecode;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n <= 1) {
//            System.out.println("Not PrimeNumber");
//        } else{
//            boolean isPrime = true;
//            for (int i = 2; i <=n /2; i++) {
//                if (n%i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) System.out.println("Prime");
//            else System.out.println("Not Prime");
//        }
//        Method - 2
       int n = 107;
       int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
            System.out.println(c == 2 ? "Prime": "Not Prime");
    }
}
