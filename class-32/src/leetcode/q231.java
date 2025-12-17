package leetcode;

class Solution1 {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
}

public class q231 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();   // create object

        System.out.println(sol.isPowerOfTwo(1));  // true
        System.out.println(sol.isPowerOfTwo(2));  // true
        System.out.println(sol.isPowerOfTwo(4));  // true
        System.out.println(sol.isPowerOfTwo(8));  // true
        System.out.println(sol.isPowerOfTwo(3));  // false
        System.out.println(sol.isPowerOfTwo(0));  // false
    }
}
