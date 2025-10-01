package Offlinecode;


import java.util.Scanner;

class solution {
    public int[] getConcatenate(int[] arr, int n){
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[n + i] = arr[i];
        }
        return ans;
    }
}
public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution sol = new solution();
        int[] result = sol.getConcatenate(arr, n);
        for (int x : result) {
            System.out.println(x + " ");
        }
    }
}
