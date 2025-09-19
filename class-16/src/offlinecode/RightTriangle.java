package offlinecode;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Accept input n
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        // ===============================
        // 🔹 Pattern 1: Right-angled star triangle
        // ===============================
        System.out.println("\nRight-angled Star Triangle:");
        for (int i = 1; i <= n; i++) {   // rows
            for (int j = 1; j <= i; j++) { // stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
        Example for n=5:
        *
        * *
        * * *
        * * * *
        * * * * *
        */


        // ===============================
        // 🔹 Pattern 2: Right-angled number triangle
        // ===============================
        System.out.println("\nRight-angled Number Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
          /*
        Example for n=5:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        // ===============================
        // 🔹 Pattern 3: Inverted right-angled star triangle
        // ===============================
        System.out.println("\nInverted Right-angled Star Triangle:");
        for (int i = n; i >= 1; i--) {            // rows decrease
            for (int j = 1; j <= i; j++) {        // stars per row
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        Example for n=5:
        * * * * *
        * * * *
        * * *
        * *
        *
        */


        // ===============================
        // 🔹 Pattern 4: Right-angled Alphabet Triangle
        // ===============================
        System.out.println("\nRight-angled Alphabet Triangle:");
        for (int i = 1; i <= n; i++) {                   // rows
            char ch = 'A';                               // start from A every row
            for (int j = 1; j <= i; j++) {               // letters in each row
                System.out.print(ch + " ");
                ch++;                                    // move to next character
            }
            System.out.println();
        }

        /*
        Example for n=5:
        A
        A B
        A B C
        A B C D
        A B C D E
        */

        sc.close();
    }
}
