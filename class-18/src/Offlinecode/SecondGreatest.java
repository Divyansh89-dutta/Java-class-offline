package Offlinecode;

import java.util.Scanner;

public class SecondGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }
        }
        System.out.println("Second greatest element = " + secMax);
    }
}
