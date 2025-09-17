package onlinecode;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int even = 0, odd=0;
        for (int i = start; i <= end ; i++) {
            if (i%2==0) even += i;
            else odd += i;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
