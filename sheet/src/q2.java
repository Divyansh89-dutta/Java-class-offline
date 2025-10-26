public class q2 {
    public static void main(String[] args) {
        int p = 9, w = 6;
        p = p + 1;  // p = 10
        w = w - 1;  // w = 5
        p = p + w;  // p = 10 + 5 = 15

        if (p > w)
            System.out.println(p);
        else
            System.out.println(w);
    }
}
