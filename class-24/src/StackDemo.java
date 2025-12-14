//4️⃣ Stack
//
//Type: LIFO (Last In First Out) stack, extends Vector.
//
//        Characteristics:
//
//Ordered, allows duplicates
//
//Push → add element to top
//
//Pop → remove top element
//
//Peek → see top element without removing
//
//Synchronized (thread-safe because Vector)
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        System.out.println(stack.peek()); // Mango
        stack.pop();
        System.out.println(stack); // [Apple, Banana]
    }
}
