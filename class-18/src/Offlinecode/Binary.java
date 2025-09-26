package Offlinecode;

import java.util.Scanner;

public class Binary {

    // Binary Search function
    public int search(int arr[], int n, int target) {
        int s = 0, e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid; // element found
            } else if (arr[mid] < target) {
                s = mid + 1; // search right half
            } else {
                e = mid - 1; // search left half
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input sorted array elements
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // input target
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // create object to call non-static method
        Binary sol = new Binary();
        int result = sol.search(arr, n, target);

        // output
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array");
        }

        sc.close();
    }
}
