package onlinecode;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=1){
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
