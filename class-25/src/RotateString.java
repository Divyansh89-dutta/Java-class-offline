public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(canRotate(s, goal)); // true
    }

    public static boolean canRotate(String s, String goal) {
        // If lengths are different, cannot be rotations
        if (s.length() != goal.length()) {
            return false;
        }

        // Combine string with itself
        String doubled = s + s;

        // If goal is a substring of doubled, it's a rotation
        return doubled.contains(goal);
    }
}
