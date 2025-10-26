public class Q18 {
    public static void main(String[] args) {
        int a = 3, b = 2, c = 1;
        if (a > b) {
            if (a > c)
                System.out.println("A");
            else
                System.out.println("C");
        } else {
            if (b > c)
                System.out.println("B");
            else
                System.out.println("C");
        }
    }
}
