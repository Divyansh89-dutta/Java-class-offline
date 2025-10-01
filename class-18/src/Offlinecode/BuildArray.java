package Offlinecode;

import java.util.Scanner;

class solution1{
    public int[] buildArray(int[] nums, int n){
        int[] ans = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = nums[nums[i]];
        }
        return ans;
    }
}
public class BuildArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution1 sol = new solution1();
        int[] result = sol.buildArray(arr, n);
        for (int x : result) {
            System.out.println(x + " ");
        }
    }
}
