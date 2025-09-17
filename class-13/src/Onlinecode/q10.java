package Onlinecode;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0){
            sumOfDigits += square % 10;
            square /= 10;
        }
        System.out.println(sumOfDigits == number ? "Yes" : "No");
    }
}
