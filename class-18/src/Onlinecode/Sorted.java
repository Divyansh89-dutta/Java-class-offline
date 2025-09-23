package Onlinecode;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isIncreasing = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing ) {
            System.out.println("Yes");
        } else System.out.println("no");
    }
}
