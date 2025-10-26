public class Q3 {
    public static void main(String[] args) {
        int t = 6, h = 9;
        int x = 0;

        if (h > t) {
            for (int c = t; c < h; c = c + 1) {
                x = x + c;   // add each c to x
            }
            System.out.println(x);
        } else {
            System.out.println("Error: " + x);
        }
    }
}
