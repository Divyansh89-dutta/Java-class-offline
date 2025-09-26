import java.util.Scanner;

public class ISBNValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10-digit ISBN number: ");
        String isbn = sc.nextLine();

        if (isbn.length() != 10) {
            System.out.println("Invalid input! ISBN-10 must have 10 digits.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int digit = isbn.charAt(i) - '0';
            sum += (digit * (i + 1));
        }
        if (sum % 11 == 0) {
            System.out.println("Valid ISBN-10");
        } else {
            System.out.println("Invalid ISBN-10");
        }
    }
}
