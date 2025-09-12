import java.util.Scanner;

public class AreaandPerimeterofaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        int area = w * l;
        int perimeter = 2 * (w + l);
        System.out.println("area is " + area);
        System.out.println("perimeter is " + perimeter);
    }
}
