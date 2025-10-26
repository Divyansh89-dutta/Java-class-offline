import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int num = sc.nextInt();
        String binary = "";
        while(num > 0){
            int remainder = num%2;
            binary = remainder + binary;
            num /= 2;
        }
        System.out.println("Binary value will be: " + binary);
    }
}
