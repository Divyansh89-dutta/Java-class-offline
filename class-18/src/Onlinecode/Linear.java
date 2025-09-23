package Onlinecode;

import java.util.Scanner;

public class Linear {
    public static int linearSeacrh (int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] arrgs){
        int[] nums = {18, 25, 30, 45, 50};
        int n = nums.length;
        int target = 30;
        int result = linearSeacrh(nums, n, target);
        if (result !=  -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in array");
        }
    }
}
