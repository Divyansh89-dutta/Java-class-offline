public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");           // Add text at the end
        sb.insert(5, ",");             // Insert at index 5
        sb.delete(0, 1);               // Delete first character
        sb.reverse();                  // Reverse the string

        System.out.println(sb);
    }
}
