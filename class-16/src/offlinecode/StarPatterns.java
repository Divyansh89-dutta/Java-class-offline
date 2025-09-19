package offlinecode;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // ===============================
        // 🔹 Pattern 1: Right-angled Triangle
        // ===============================
        System.out.println("\nTriangle Pattern:");
        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= i; j++) {      // stars per row
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        Example n=5:
        *
        * *
        * * *
        * * * *
        * * * * *
        */


        // ===============================
        // 🔹 Pattern 2: V Shape Pattern
        // (Two stars per row moving closer until they meet at bottom)
        // ===============================
        System.out.println("\nPattern V:");
        for (int i = 0; i < n; i++) {
            // left star
            for (int j = 0; j < i; j++) {
                System.out.print("  ");   // spaces before left star
            }
            System.out.print("*");

            // spaces between left and right star
            for (int j = 0; j < (2 * (n - i - 1) - 1); j++) {
                System.out.print(" ");
            }

            // right star (skip when both stars meet at bottom)
            if (i != n - 1) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Example n=5:
        *       *
         *     *
          *   *
           * *
            *
        */


        // ===============================
        // 🔹 Pattern 3: X Shape Pattern
        // (Stars cross each other at diagonals, n is odd)
        // ===============================
        System.out.println("\nPattern X:");
        if (n >= 3 && n % 2 == 1) {   // constraint check
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // star on main diagonal (i == j)
                    // OR star on opposite diagonal (i + j == n - 1)
                    if (i == j || (i + j) == (n - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // spaces
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("X pattern requires n >= 3 and odd!");
        }

        /*
        Example n=5:
        *       *
          *   *
            *
          *   *
        *       *
        */

        sc.close();
    }
}
