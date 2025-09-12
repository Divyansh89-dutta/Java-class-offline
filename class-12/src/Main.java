import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // -------------------------------
        // 1️⃣ N times "Hello World"
        // -------------------------------
        System.out.print("Enter how many times to print Hello World: ");
        int n = sc.nextInt();

        System.out.println("\nPrinting 'hello world' " + n + " times:");
        for (int i = 1; i <= n; i++) {
            System.out.println("hello world");
        }

        // -------------------------------
        // 2️⃣ N natural numbers from 1 to N
        // -------------------------------
        System.out.print("\nEnter a number to print natural numbers (1 to N): ");
        int limit = sc.nextInt();

        System.out.println("\nNatural numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }

        // -------------------------------
        // 3️⃣ N natural numbers from N to 1
        // -------------------------------
        System.out.println("\n\nNatural numbers from " + limit + " to 1:");
        for (int i = limit; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}