package BitwiseOperators;

public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + ( a << 1));
        System.out.println("a >> 1 = " + ( a >> 1));
    }
}
