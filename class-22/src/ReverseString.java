public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }
}
