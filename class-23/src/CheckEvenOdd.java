public class CheckEvenOdd {
    public static void main(String[] args) {
        int n = 7;
        if ((n & 1) == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is odd");
    }
}
