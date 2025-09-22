package Offlinecode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        double mean = (double) sum / n;
        System.out.print("nums = [");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + (i < n - 1 ? " , " : ""));
        }
        System.out.println("]");
        System.out.println("Sum = " + sum + ", Mean = " + mean);
    }
}
