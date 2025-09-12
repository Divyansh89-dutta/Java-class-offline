import java.util.Scanner;

public class CalculateCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.printf("%.2f\n", circumference);
        System.out.printf("%.2f\n", area);
    }
}
