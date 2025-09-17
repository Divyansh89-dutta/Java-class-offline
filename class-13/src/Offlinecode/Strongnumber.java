package Offlinecode;

import java.util.Scanner;

public class Strongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = num;   // duplicate to compare later
        int sum = 0;

        while (num != 0) {
            int last = num % 10;   // get last digit
            int fact = 1;

            // factorial of last digit
            for (int i = 1; i <= last; i++) {
                fact *= i;
            }

            sum += fact;   // add factorial to sum
            num /= 10;     // remove last digit
        }

        // check strong number condition
        System.out.println(dup == sum ? "Strong Number" : "Not a Strong Number");
    }
}
