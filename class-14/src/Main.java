public class Main {
    public static void main(String[] args) {
        int i = 1;
//         🔹 do...while loop syntax:
//        do {
//         body
//        } while(condition);
//         ✅ Difference from while loop:
//        - Body executes FIRST, condition is checked AFTER.
//        - Executes at least once, even if condition is false.
        do {
//            loop body: executes first
            System.out.println("Value of i: " + i);
            i++;
        } while (i <= 5); // condition checked after execution
        // 🔹 Example where condition is false at start
        int j = 10;

        do {
            System.out.println("This will run at least once, even though j < 5 is false");
        } while (j < 5); // false condition, but body already executed once
    }
}