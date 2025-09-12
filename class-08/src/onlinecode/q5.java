package onlinecode;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline left after nextInt
        String name = sc.nextLine();

        if (age >= 18) {
            System.out.println(name + " is a valid voter.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println(name + " is not a valid voter.");

            System.out.println(name + " will be eligible in " + yearsLeft + " years.");
        }
    }
}
