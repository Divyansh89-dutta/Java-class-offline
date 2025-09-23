package Onlinecode;

import java.util.Scanner;

public class SecondGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstMax){
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                secondMax = num;
            }
            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("Second greatest element dose not exist!");
            } else {
                System.out.print("Second greatest element = " + secondMax);
            }
        }
    }
}
