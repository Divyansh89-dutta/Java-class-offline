public class Q8 {
    public static void main(String[] args) {
        int p = 2, q = 3;
        for (int i = 0; i <= 6; i = i + 2) {
            p = p + q + i;
            p = p + q;
            q = p - q;
            System.out.print(q + " ");
        }
    }
}
