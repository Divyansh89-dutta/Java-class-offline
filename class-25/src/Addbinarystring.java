import java.util.Scanner;

public class Addbinarystring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two binary strings as input
        System.out.print("Enter first binary string: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary string: ");
        String b = sc.nextLine();

        String result = addBinary(a, b);
        System.out.println("Sum = " + result);

        sc.close();
    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop from end to start of both strings
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';  // convert '1' or '0' to int
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);  // current bit
            carry = sum / 2;     // carry for next bit
        }

        // Reverse the result
        return sb.reverse().toString();
    }
}
