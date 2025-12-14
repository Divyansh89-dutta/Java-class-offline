public class SwapUsingXOR {
    public static void main(String[] args) {
        int a = 5, b = 9;
        System.out.println("Before swap: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
