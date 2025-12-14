import java.util.HashSet;
import java.util.Set;

public class Setinterface {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate ignored

        // Iterate
        for(Integer num : numbers) {
            System.out.println(num);
        }

        // Check if element exists
        System.out.println("Contains 20? " + numbers.contains(20));

        // Remove element
        numbers.remove(30);
        System.out.println("After removal: " + numbers);
    }
}
