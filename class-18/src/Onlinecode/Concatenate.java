package Onlinecode;

public class Concatenate {
    public int[] getConvatenate(int[] arr, int n){
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[n + i] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Concatenate sol = new Concatenate();
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int[] result = sol.getConvatenate(arr, n);
        for (int num : result) {
            System.out.println(num + " ");
        }
    }
}
