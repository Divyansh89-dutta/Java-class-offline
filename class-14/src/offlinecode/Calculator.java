package offlinecode;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // 🔹 do...while loop to keep showing menu until user exits
        do {
            // Menu for operations
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // If choice is between 1 and 4, take numbers as input
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result = " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                }
            } else if (choice != 5) {
                // If user enters invalid option
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5); // loop until user chooses Exit (5)

        // Exiting message
        System.out.println("Thank you! for using calculator");
    }
}
