package onlinecode;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1){
            System.out.println("No prime factors");
            return;
        }
        for (int i = 2; i <= n ; i++){
            while (n % i == 0){
                System.out.println(i);
                n = n/i;
            }
        }
    }
}
