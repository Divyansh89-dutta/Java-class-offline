package onlinecode;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("Hello, Sir!");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Hello, Ma'am!");
        } else {
            System.out.println("Hello, Guest!");
        }
    }
}
