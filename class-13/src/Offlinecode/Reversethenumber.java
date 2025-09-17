package Offlinecode;

import java.util.Scanner;

public class Reversethenumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: Read the number as a positive integer
        int number = sc.nextInt();

        int reverse = 0;

        // Loop to reverse the number
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            reverse = reverse * 10 + digit;  // Add the digit to the reverse
            number /= 10;  // Remove the last digit
        }

        // Output the reversed number
        System.out.println(reverse);
    }
}
