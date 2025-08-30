public class Main {
    public static void main(String[] args) {
        int num1 = -25;
        double num2 = 4.7;
        double num3 = 16;
        double num4 = 27;

        // Math class methods
        System.out.println("abs(-25) = " + Math.abs(num1));       // 25
        System.out.println("floor(4.7) = " + Math.floor(num2));   // 4.0
        System.out.println("ceil(4.7) = " + Math.ceil(num2));     // 5.0
        System.out.println("sqrt(16) = " + Math.sqrt(num3));      // 4.0
        System.out.println("cbrt(27) = " + Math.cbrt(num4));      // 3.0
        System.out.println("pow(2, 5) = " + Math.pow(2, 5));      // 32.0
        System.out.println("round(4.6) = " + Math.round(4.6));    // 5
        System.out.println("max(15, 30) = " + Math.max(15, 30));  // 30
        System.out.println("min(15, 30) = " + Math.min(15, 30));  // 15
    }
}