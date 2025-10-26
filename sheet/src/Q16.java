public class Q16 {
    public static void main(String[] args) {
        int a = 25, b = 15;

        if (a % 10 == 0)
            a = a * 2;
        else if (a % 5 == 0)
            a = a / 5;
        else
            a = a - 1;

        System.out.println(a + "," + b);
    }
}
