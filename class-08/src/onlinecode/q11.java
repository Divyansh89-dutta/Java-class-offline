package onlinecode;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();

        double payableAmount =0;
        if (unit>400){
            payableAmount += (unit-400) * 13;
            unit = 400;
        }
        if (unit>200 && unit<=400){
            payableAmount += (unit-200) * 8;
            unit = 200;
        }
        if (unit>100 && unit<=200){
            payableAmount += (unit-100) * 6;
            unit = 100;
        }
        payableAmount += unit * 4.2;
        System.out.println(payableAmount);
    }
}
