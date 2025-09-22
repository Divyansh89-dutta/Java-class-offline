package Offlinecode;

import java.util.Scanner;

public class GreatestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        Assume first element is greatest initially
        int greatest = nums[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > greatest) {
                greatest = nums[i];
                index = i; // store index of greatest element
            }
            System.out.println("Greatest number is " + greatest + " at index " + index);
        }
    }
}
