package onlinecode;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gender = scanner.next().charAt(0);

        int yearsOfService = scanner.nextInt();

        char qualification = scanner.next().charAt(0);

        int salary = 0;

        if (gender == 'M') {
            if (yearsOfService >= 10) {
                if (qualification == 'P') {
                    salary = 15000;
                } else if (qualification == 'U') {
                    salary = 10000;
                }
            } else {
                if (qualification == 'P') {
                    salary = 10000;
                } else if (qualification == 'U') {
                    salary = 7000;
                }
            }
        } else if (gender == 'F') {
            if (yearsOfService >= 10) {
                if (qualification == 'P') {
                    salary = 12000;
                } else if (qualification == 'U') {
                    salary = 9000;
                }
            } else {
                if (qualification == 'P') {
                    salary = 10000;
                } else if (qualification == 'U') {
                    salary = 6000;
                }
            }
        } else {
            System.out.println("Invalid gender input.");
            scanner.close();
            return;
        }

        System.out.println(salary);
        scanner.close();
    }
}
