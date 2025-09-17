package offlinecode;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8; // limit (number of terms)
        int a = 0, b = 1; // first two numbers
        System.out.println(a + " " + b + " "); // print 0 and 1 first

        for (int i = 2; i < n; i++) {
            int c = a + b;  // next term = sum of previous two
            System.out.print(c + " ");
            a = b;  // shift values
            b = c;
        }
    }
}
