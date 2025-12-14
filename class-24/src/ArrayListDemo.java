//1️⃣ ArrayList
//
//Type: Resizable array implementation of List interface.
//
//Characteristics:
//
//Ordered (maintains insertion order)
//
//Allows duplicates
//
//Random access is fast (get(index) is O(1))
//
//Adding/removing at end is fast; adding/removing in middle is slow (O(n))
// there is one more method that is set
//Not synchronized (thread-unsafe)

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
//        fruits.set(1, "uhpi")

        System.out.println(fruits.get(1)); // Banana
        fruits.remove("Apple");
        System.out.println(fruits); // [Banana, Mango]
    }
}
