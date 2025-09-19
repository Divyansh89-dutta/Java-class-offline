public class Main {
    public static void main(String[] args) {

        // ===============================
        // 🔹 PATTERN 1: Square Pattern
        // Outer loop → rows
        // Inner loop → columns
        // ===============================
        for (int i = 1; i <= 4; i++) {          // 4 rows
            for (int j = 1; j <= 4; j++) {      // 4 columns
                System.out.print("* ");
            }
            System.out.println();               // new line after each row
        }

        /*
        ✅ Output:
        * * * *
        * * * *
        * * * *
        * * * *
        */


        // ===============================
        // 🔹 PATTERN 2: Right-Angled Triangle
        // Row number = number of stars in that row
        // ===============================
        for (int i = 1; i <= 5; i++) {          // rows
            for (int j = 1; j <= i; j++) {      // stars increase per row
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        ✅ Output:
        *
        * *
        * * *
        * * * *
        * * * * *
        */


        // ===============================
        // 🔹 PATTERN 3: Inverted Triangle
        // Row number = stars decrease per row
        // ===============================
        for (int i = 5; i >= 1; i--) {          // rows decreasing
            for (int j = 1; j <= i; j++) {      // stars decrease
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        ✅ Output:
        * * * * *
        * * * *
        * * *
        * *
        *
        */


        // ===============================
        // 🔹 PATTERN 4: Pyramid (Centered)
        // Need spaces before stars
        // Outer loop = rows
        // Inner loop 1 = spaces
        // Inner loop 2 = stars
        // ===============================
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            // print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        ✅ Output:
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
        */


        // ===============================
        // 🔹 PATTERN 5: Number Triangle
        // Print row number as repeated value
        // ===============================
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
        ✅ Output:
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        */


        // ===============================
        // 🔹 PATTERN 6: Floyd’s Triangle
        // Print continuous numbers
        // ===============================
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        /*
        ✅ Output:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */

    }
}