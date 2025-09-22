package Onlinecode;

//Class to check Strong Number
// A number is Strong if sum of factorial of its digits == original number
class Solution {

    // Method to check if number is Strong
    public boolean isStrongNumber(int n) {
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;          // extract last digit
            sum += factorial(digit);     // add factorial of digit
            n /= 10;                     // remove last digit
        }

        // return true if strong number
        return sum == originalNumber;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int num1 = 145;   // 1! + 4! + 5! = 145 → Strong Number
        int num2 = 123;   // Not a Strong Number

        System.out.println(num1 + " is Strong? " + sol.isStrongNumber(num1));
        System.out.println(num2 + " is Strong? " + sol.isStrongNumber(num2));
    }
}
