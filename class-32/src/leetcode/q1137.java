package leetcode;

class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1;

        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}

public class q1137 {
    public static void main(String[] args) {
        Solution sol = new Solution();     // create object
        int result = sol.tribonacci(5);   // pass value
        System.out.println(result);       // output
    }
}
