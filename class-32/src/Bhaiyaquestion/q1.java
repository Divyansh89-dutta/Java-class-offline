package Bhaiyaquestion;

public class q1 {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0 ) return;
        System.out.println("Divyansh");
        fun(n - 1);
    }
}
