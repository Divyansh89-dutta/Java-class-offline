package Offlinecode;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = new int[n];
        int i = 0, j = n -1;
        for (int k = 0; k < n; k++) {
            if (arr[k] > 0) {
                res[i++] = arr[k];
            } else {
                res[j--] = arr[k];
            }
        }
        for (int ele : res) {
            System.out.println(ele + " ");
        }
    }
}
