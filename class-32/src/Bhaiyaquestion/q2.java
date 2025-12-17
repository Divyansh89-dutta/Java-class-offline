package Bhaiyaquestion;

public class q2 {
    public static void main(String[] args) {
        fun(5);
        fun2(5);
    }
    // simple print
    static void fun2(int n) {
        if (n == 0) return;
        fun2(n - 1);
        System.out.println(n);
    }
    // reverse
    static void fun(int n) {
        if (n==0) return;
        System.out.println(n);
        fun(n-1);
    }
}
