public class Q7 {
    public static void main(String[] args) {
        int N = 20;
        double s = 0.0;
        double f = 1.0;

        for (int i = 1; i <= N; i++) {
            f = f * i;
            s = s + (i / f);
        }
        System.out.println(s);
    }
}
