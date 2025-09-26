package Offlinecode;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "yes" : "no");
    }
}
