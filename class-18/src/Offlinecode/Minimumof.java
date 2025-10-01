package Offlinecode;
class Solution {
    public int minCost(int[] A, char[] B) {
        // Initialize minimum values
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE, minC = Integer.MAX_VALUE;

        // If the array length is less than 3, just return the minimum of A
        if (A.length < 3) {
            int minVal = Integer.MAX_VALUE;
            for (int val : A) {
                minVal = Math.min(minVal, val);
            }
            return minVal;
        }

        // Find minimum values for 'a', 'b', and 'c'
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 'a') {
                minA = Math.min(minA, A[i]);
            } else if (B[i] == 'b') {
                minB = Math.min(minB, A[i]);
            } else if (B[i] == 'c') {
                minC = Math.min(minC, A[i]);
            }
        }

        // Case 1: both 'a' and 'b' exist → compute minA + minB
        long option1 = (minA != Integer.MAX_VALUE && minB != Integer.MAX_VALUE)
                ? (long) minA + minB
                : Long.MAX_VALUE;

        // Case 2: 'c' exists
        long option2 = (minC != Integer.MAX_VALUE) ? minC : Long.MAX_VALUE;

        // Return minimum of valid options
        return (int) Math.min(option1, option2);
    }
}

public class Minimumof {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] A = {5, 3, 6, 2, 8};
        char[] B = {'a', 'b', 'a', 'c', 'b'};

        System.out.println(sol.minCost(A, B)); // Output: 3
    }
}
