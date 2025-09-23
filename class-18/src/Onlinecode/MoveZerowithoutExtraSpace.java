package Onlinecode;

import java.util.Scanner;

public class MoveZerowithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements (0s and 1s)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i=0, j=0;
        while (i < n) {
            if (arr[i] == 0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[i] = temp;
                i++;
                j++;
            }
        }
        for (int ele : arr) {
            System.out.println(ele + " ");
        }
    }
}
