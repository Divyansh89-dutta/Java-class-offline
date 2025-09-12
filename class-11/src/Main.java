import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ------------------------------
        // 1. Need of Loops
        // ------------------------------
        System.out.println("Printing Hello 5 times using loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }

        // ------------------------------
        // 2. Entry Controlled Loop Example
        // ------------------------------
        System.out.println("\nCounting numbers 1 to 5:");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ------------------------------
        // 3. Exit Controlled Loop Example (do-while)
        // ------------------------------
        System.out.println("\nExit Controlled Loop Example:");
        int count = 1;
        do {
            System.out.println("This will run at least once, count = " + count);
            count++;
        } while(count <= 3);

        // ------------------------------
        // 4. Init outside loop
        // ------------------------------
        System.out.println("\nInitialization outside loop:");
        int i = 1;
        for(; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        // ------------------------------
        // 5. Multiple variables in a loop
        // ------------------------------
        System.out.println("\nMultiple initialization and updates:");
        for(int x = 1, y = 3; x <= 3 && y >= 1; x++, y--) {
            System.out.println("x = " + x + ", y = " + y);
        }

        // ------------------------------
        // 6. Infinite Loop (Press Ctrl + C to stop)
        // ------------------------------
        System.out.println("\nExample of Infinite Loop (will run forever, be careful!):");
        System.out.println("Press Ctrl + C to stop.");
        // Uncomment below to test
        /*
        for(;;) {
            System.out.println("Infinite loop running...");
        }
        */

        // ------------------------------
        // 7. Accidental Infinite Loop Example
        // ------------------------------
        System.out.println("\nAccidental infinite loop:");
        System.out.println("This loop never ends because condition always true.");
        /*
        int num = 5;
        while(num > 0) {
            System.out.println(num); // Forgot to decrease num
        }
        */

        sc.close();
    }
}