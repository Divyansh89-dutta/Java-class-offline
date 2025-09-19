public class Main {
    public static void main(String[] args) {
        // 🔹 NESTED LOOPS (Loop inside Loop)
        // Outer loop → controls rows
        // Inner loop → controls columns (elements inside each row)

        // Example 1: Printing a 3x4 rectangle
        for (int i = 1; i <= 3; i++) {   // Outer loop → runs 3 times (rows)
            for (int j = 1; j <= 4; j++) {  // Inner loop → runs 4 times for each row
                System.out.print("* ");  // print in SAME line
            }
            System.out.println();  // move to NEXT line after each row
        }
        /*
        ✅ Output:
        * * * *
        * * * *
        * * * *
        */
        // 🔹 HOW TO IDENTIFY IF NESTED LOOP IS REQUIRED?
        // 1. When you need row-column structure (table, matrix, grid).
        // 2. When solving pattern problems (stars, numbers, shapes).
        // 3. Quick rule:
        //    - One loop → straight line output
        //    - Nested loop → multi-row or grid output


        // 🔹 PATTERN PROGRAMMING THEORY
        // Steps:
        // 1. Decide number of rows → outer loop
        // 2. Decide what to print per row (stars, numbers) → inner loop
        // 3. Use print()/println() carefully for formatting
        // Example 2: Right-angled triangle of stars
        for (int i = 1; i <= 5; i++) {    // Outer loop → number of rows
            for (int j = 1; j <= i; j++) { // Inner loop → stars per row
                System.out.print("* ");
            }
            System.out.println();   // new line after each row
        }
        /*
        ✅ Output:
        *
        * *
        * * *
        * * * *
        * * * * *
        */


        // 🔹 print() vs println()
        // System.out.print()   → prints without moving to next line
        // System.out.println() → prints AND moves to next line

        System.out.print("A ");   // stays in same line
        System.out.print("B ");   // stays in same line
        System.out.println("C "); // prints and moves to next line
        System.out.print("D ");   // prints on new line after C

        /*
        ✅ Output:
        A B C
        D
        */

    }
}