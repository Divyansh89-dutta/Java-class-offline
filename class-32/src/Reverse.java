public class Reverse {
    public static void main(String[] args) {
        System.out.print(reverse(1234, 2));
    }
    static int reverse(int n, int rev){
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + (n % 10));
    }
}
