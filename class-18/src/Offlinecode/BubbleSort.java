package Offlinecode;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution sol = new solution();
        sol.bubbleSort(arr, n);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
