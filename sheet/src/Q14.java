public class Q14 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 56, 34};
        int a = 3, n = 4;

        for (int k = 0; k < n - 1; k++) {
            array1[n - 1] = array1[0];   // move first element to last
            for (int j = 0; j < n - 1; j++) {
                array1[j] = array1[j + 1];
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(array1[k] + " ");
        }
    }
}
