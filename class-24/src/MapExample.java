import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();

        // Add key-value pairs
        student.put(101, "Alice");
        student.put(102, "Bob");
        student.put(103, "Charlie");
        student.put(101, "Alex"); // Key 101 updated

        // Access value
        System.out.println("Roll 101: " + student.get(101));

        // Iterate
        System.out.println("All students:");
        for(Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Remove
        student.remove(102);
        System.out.println("After removal: " + student);
    }
}
