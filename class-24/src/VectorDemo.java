//3️⃣ Vector
//
//Type: Resizable array, similar to ArrayList, but synchronized.
//
//Characteristics:
//
//Thread-safe (synchronized methods)
//
//Ordered, allows duplicates
//
//Random access is fast
//
//Slower than ArrayList in single-threaded applications
//
//Example:

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");

        fruits.add(1, "Mango"); // Insert at index 1
        System.out.println(fruits); // [Apple, Mango, Banana]

        fruits.remove("Mango");
        System.out.println(fruits); // [Apple, Banana]
    }
}
