import java.util.Arrays;
import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        // Convert to lowercase to make it case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Remove spaces (optional)
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        // Check if lengths are same
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams (Different lengths)");
        } else {
            // Convert strings to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are Anagrams!");
            } else {
                System.out.println("The strings are NOT Anagrams!");
            }
        }
    }
}