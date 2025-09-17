package Onlinecode;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dupN = n;
        int sq = n*n;
        int countOfDigit = 0;
        while (n>0){
            countOfDigit++;
            n/=10;
        }
        if (dupN == sq%Math.pow(10,countOfDigit)){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
