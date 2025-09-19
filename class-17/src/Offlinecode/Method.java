package Offlinecode;

public class Method {
    public static void main(String[] args) {
        int n = 145;
        int copy = n;
        int sum = 0;
        while (n != 0){
            int last = n%10;
            sum = sum + fact(last);
            n /= 10;
        }
        System.out.println(sum == copy);
    }
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
