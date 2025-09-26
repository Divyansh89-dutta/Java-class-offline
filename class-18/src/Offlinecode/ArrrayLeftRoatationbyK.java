package Offlinecode;

import java.util.Scanner;

public class ArrrayLeftRoatationbyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        k = k % n;
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
