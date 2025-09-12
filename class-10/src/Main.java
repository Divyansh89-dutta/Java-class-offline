import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------------------
        // 1. TERNARY OPERATOR
        // ---------------------------
        // <condition> ? <value_if_true> : <value_if_false>;
        // Works like a shortcut for if-else.
        // Returns a value based on the condition.
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b; // Ternary to find greatest
        System.out.println("Greatest number: " + max);

        // ---------------------------
        // 2. TYPE CASTING
        // ---------------------------
        // Implicit / Widening
        // (b) Explicit / Narrowing Conversion
        // Larger data type → Smaller data type (done manually).
        // Possible data loss.
        int num = 100;
        double wide = num; // int -> double automatically
        System.out.println("Widening conversion (int to double): " + wide);

        // Explicit / Narrowing
        double bigNum = 9.75;
        int narrow = (int) bigNum; // manual type cast
        System.out.println("Narrowing conversion (double to int): " + narrow);

        // ---------------------------
        // 3. NORMAL SWITCH
        // ---------------------------
        // Allowed Data Types:
        //
        // byte, short, char, int, String, enum
        // ❌ Not allowed: float, double, long
        // Because floating-point comparison can be imprecise, causing ambiguity.
        System.out.print("\nEnter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7: // multiple cases for weekend
                System.out.println("Weekend");
                break;
            default:
                System.out.println("WRONG INPUT");
        }

        // ---------------------------
        // 4. JAVA 14 SWITCH UPDATE
        // ---------------------------
        System.out.print("\nEnter a day (1-7) for modern switch: ");
        int modernDay = sc.nextInt();

        // Modern Switch using arrow
        String modernResult = switch (modernDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4, 5 -> {
                yield "Thursday or Friday"; // yield returns value
            }
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("Modern Switch Output: " + modernResult);

        sc.close();
    }
}
