package Offlinecode;

import java.util.Scanner;

class Solution2 {
    public int absoluteDifference(int[] arr, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += Math.abs(arr[i] - arr[j]);
            }
        }
        return totalSum;
    }
}

public class SumOfAbsolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution2 sol = new Solution2();
        int result = sol.absoluteDifference(arr, n);
        System.out.println("Sum of absolute differences: " + result);

        sc.close();
    }
}
