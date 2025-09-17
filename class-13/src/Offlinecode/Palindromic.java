package Offlinecode;

import java.util.Scanner;

public class Palindromic {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: Read the number as a positive integer
        int number = sc.nextInt();

        int originalNumber = number;
        int reverse = 0;

        // Loop to reverse the number
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            reverse = reverse * 10 + digit;  // Add the digit to the reverse
            number /= 10;  // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reverse) {
            System.out.println("Palindromic number");
        } else {
            System.out.println("No Palindromic number");
        }

    }
}