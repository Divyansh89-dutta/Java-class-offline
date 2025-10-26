public class Q5 {
    public static void main(String[] args) {
        for (int count = 0; count <= 9; count++) {
            System.out.print("#");
            if (count > 6)
                continue;
            System.out.print(count);
        }
    }
}
