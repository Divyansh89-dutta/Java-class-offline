package Onlinecode;

public class Binary {
    public static int search (int arr[], int n, int target){
        int start = 0, end = n - 1;
        while(start <= end ){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2 ,5,8, 12, 16, 23, 38};
        int n = nums.length;
        int target = 16;
        int result = search(nums, n, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in array");
        }
    }
}
