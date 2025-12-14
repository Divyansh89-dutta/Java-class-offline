public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println(n + " is a power of 2");
        else
            System.out.println(n + " is not a power of 2");
    }
}
