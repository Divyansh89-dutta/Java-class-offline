package Onlinecode;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int origNum = num;
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println(origNum%sum==0?"Yes":"No");
    }
}
