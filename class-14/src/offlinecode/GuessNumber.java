package offlinecode;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // 🔹 Generate random target number between 1 and 100
        int target = rand.nextInt(100) + 1;
        int guess;
        System.out.println("Guess the number (between 1 and 100): ");
        // 🔹 Keep looping until guess matches target
        do {
            guess = sc.nextInt(); // take user input
            if (guess == target) {
                System.out.println("Congrats!");
            } else if (guess > target) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again");
            }
        } while (guess != target); // loop ends only when guess is correct
        System.out.println("Program exits.");
    }
}
