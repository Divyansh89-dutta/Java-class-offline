import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num;

        System.out.print("Prime factors of " + num + " are: ");

        for (int i = 2; i <= n; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        sc.close();
    }
}
