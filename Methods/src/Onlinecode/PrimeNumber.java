package Onlinecode;

public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // 1 and numbers less than 1 are NOT prime
        if (n <= 1) {
            return false;
        }

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // Found a factor, not prime
            }
        }
        return true; // No factors found, number is prime
    }

    public static void main(String[] args) {
        int n = 29; // You can change this value to test

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }
    }
}
