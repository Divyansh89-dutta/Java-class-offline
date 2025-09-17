package Onlinecode;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNumber = num;
        int rev = 0;
        while (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (originalNumber == rev) {
            System.out.println("Palindromic Number");
        } else
            System.out.println("Not Palindromic Number");
    }
}
