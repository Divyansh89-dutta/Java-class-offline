package Offlinecode;

import java.util.Scanner;

class Solution1{
    public void updateArray(int[] arr,int n){
        if (n <= 1)
            return;

        int prev = arr[0];
        arr[0] = arr[0] * arr[1];

        for (int i = 1; i < n - 1; i++) {
            int curr = arr[i];
            arr[i] = prev * arr[i + 1];
            prev = curr;
        }

        arr[n - 1] = prev * arr[n - 1];
    }
}
public class Multipilication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution1 sol = new Solution1();
        sol.updateArray(arr, n);
        for (int x : arr) {
            System.out.println(x + " ");
        }
    }
}
