package Onlinecode;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNumber = num;
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
