import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 4.2;
        } else if (units <= 200) {
            bill = (100 * 4.2) + (units - 100) * 6;
        } else if (units <= 400) {
            bill = (100 * 4.2) + (100 * 6) + (units - 200) * 8;
        } else {
            bill = (100 * 4.2) + (100 * 6) + (200 * 8) + (units - 400) * 13;
        }

        System.out.println("Total bill amount: " + bill);
    }
}
