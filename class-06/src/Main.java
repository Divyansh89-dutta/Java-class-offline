public class Main {
    public static void main(String[] args) {
        int a = 10, b = 3;
        // 🔹 Unary Operators
        System.out.println("Unary Operators:");
        System.out.println("a = " + a);
        System.out.println("+a = " + (+a));   // + doesn't change value
        System.out.println("-a = " + (-a));   // negative value
        System.out.println("++a = " + (++a)); // increment first, then use
        System.out.println("a-- = " + (a--)); // use first, then decrement
        System.out.println("After a--, a = " + a);
        System.out.println();
        // 🔹 Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("a / b = " + (a / b)); // integer division
        System.out.println("a % b = " + (a % b)); // remainder
        System.out.println();
        // 🔹 Special Arithmetic Tricks
        int num = 1234;
        System.out.println("Special Arithmetic:");
        System.out.println("num = " + num);
        System.out.println("num / 10 (remove last digit) = " + (num / 10));
        System.out.println("num % 10 (last digit) = " + (num % 10));
        System.out.println("2^3 using Math.pow = " + Math.pow(2, 3));
        System.out.println();
        // 🔹 Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a < b : " + (a < b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println();
        // 🔹 Logical Operators
        int age = 20;
        boolean isCitizen = true;
        System.out.println("Logical Operators:");
        System.out.println("age > 18 && isCitizen = " + (age > 18 && isCitizen));
        System.out.println("age < 18 || isCitizen = " + (age < 18 || isCitizen));
        System.out.println("!(age > 18) = " + !(age > 18));
        System.out.println();
        // 🔹 Precedence Example
        int result = 10 + 5 * 2;  // * has higher precedence
        System.out.println("Precedence Example:");
        System.out.println("10 + 5 * 2 = " + result);
    }
}