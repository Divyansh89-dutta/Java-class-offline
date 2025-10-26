public class Q10 {
    public static void main(String[] args) {
        int f = 6, g = 9, sum = 0;
        if (g > f) {
            for (int n = f; n < g; n++) {
                sum = sum + n;
            }
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }
    }
}
