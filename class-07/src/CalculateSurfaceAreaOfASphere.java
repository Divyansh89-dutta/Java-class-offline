import java.util.Scanner;

public class CalculateSurfaceAreaOfASphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(4*Math.PI*Math.pow(r,2));
    }
}
