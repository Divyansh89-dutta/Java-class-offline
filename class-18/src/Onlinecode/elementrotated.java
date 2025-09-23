package Onlinecode;

import java.util.Scanner;

public class elementrotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        k = k % size;
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = first;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
