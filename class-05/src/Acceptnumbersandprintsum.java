import java.util.Scanner;

public class Acceptnumbersandprintsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(" Sum of " + a + " & " + b + " is " + sum);
    }
}
