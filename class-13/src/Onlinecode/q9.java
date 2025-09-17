package Onlinecode;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= number / 2){
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum>number?"Yes":"No");
    }
}
