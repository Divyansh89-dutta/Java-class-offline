import java.util.Scanner;
public class q1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float rate = sc.nextFloat();

        if(rate >= 0.0 && rate <= 2.0) {
            System.out.println("Flop");
        }
        else if(rate > 2.0 && rate <= 3.4) {
            System.out.println("Semi-hit");
        }
        else if(rate > 3.4 && rate <= 4.5) {
            System.out.println("Hit");
        }
        else if(rate > 4.5 && rate <= 5.0) {
            System.out.println("Super-Hit");
        }
        else {
            System.out.println("Invalid");
        }
    }
}