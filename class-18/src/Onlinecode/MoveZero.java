package Onlinecode;

import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                result[index++] = 1;
            }
        }
        while (index < n){
            result[index++] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}
