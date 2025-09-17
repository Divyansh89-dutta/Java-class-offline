package Onlinecode;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long origNumber = n;
        long c = 0;
        while (n!=0){
            c++;
            n /= 10;
        }
        if (c!=10) System.out.println(false);
        else {
            long sum = 0;
            while (origNumber > 0){
                sum += (origNumber/=10) * c--;
                origNumber/=10;
            }
            if (sum%11==0) System.out.println(true);
            else System.out.println(false);
        }
    }
}
