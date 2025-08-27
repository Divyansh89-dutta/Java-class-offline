/*
   🔹 Understanding Java In-Built Input/Output
   -------------------------------------------
   - Standard Input (STDIN)  → System.in
   - Standard Output (STDOUT) → System.out

   To read user input → we use Scanner class
   - Scanner is inside java.util package
*/

/*
   🔹 Steps to use Scanner API
   1. Import Scanner class → import java.util.Scanner;
   2. Create Instance → Scanner sc = new Scanner(System.in);
   3. Use methods to read data
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Step 1 & 2: Create Scanner object
        Scanner sc = new Scanner(System.in);

        /*
           🔹 Reading different numeric types
           Methods available:
           - nextByte(), nextShort(), nextInt(), nextLong()
           - nextFloat(), nextDouble()
           - nextBoolean()
        */
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a boolean (true/false): ");
        boolean flag = sc.nextBoolean();

        /*
           🔹 Reading Strings
           - next() → reads first word only
           - nextLine() → reads whole line (with spaces)
           - hasNext() → checks if more input is available
        */
        sc.nextLine(); // 🔹 Fix: consume leftover newline after nextInt()/nextDouble()
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine(); // Reads complete line

        System.out.print("Enter a single word: ");
        String word = sc.next(); // Reads only one word

        /*
           🔹 Reading char data
           Trick: Use nextLine().charAt(0)
        */
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Display all inputs
        System.out.println("\n📌 You entered:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + flag);
        System.out.println("Full Name: " + fullName);
        System.out.println("Word: " + word);
        System.out.println("Character: " + ch);

        sc.close(); // Always close Scanner
    }
}
/*
   ⚠️ Problem with nextLine():
   ---------------------------
   - After calling nextInt(), nextDouble(), etc.,
     the ENTER key is still stored in input buffer.
   - nextLine() immediately reads that ENTER instead of waiting for user input.
   ✅ Fix → Add an extra sc.nextLine() before using nextLine().
   (More here: https://dev.to/sbu_05/reading-an-string-after-an-integer-4jbp)

   🔹 Java Documentation
   - Official docs for Scanner class:
   https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
*/