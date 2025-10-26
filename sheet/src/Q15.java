public class Q15 {
    public static void main(String[] args) {
        int count = 0;
        int num = 64;

        while (num != 0) {
            if ((num & 1) == 1) {
                break;
            } else {
                count = count + 1;
            }
            num = num >> 1;
        }

        System.out.println(count);
    }
}
