package onlinecode;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        if (age >= 18) {
            System.out.println(name + " is a valid voter.");
        } else {
            System.out.println(name + " is not a valid voter.");
        }
    }
}
