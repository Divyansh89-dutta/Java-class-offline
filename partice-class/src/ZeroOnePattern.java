public class ZeroOnePattern {
    public static void main(String[] args) {
        int rows = 5; // number of rows

        for (int i = 1; i <= rows; i++) {
            int val = i % 2; // starting value: 1 for odd row, 0 for even row
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val; // alternate between 0 and 1
            }
            System.out.println();
        }
    }
}
