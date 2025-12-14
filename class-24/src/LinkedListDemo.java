//2️⃣ LinkedList
//
//Type: Doubly linked list implementation of List and Deque interfaces.
//
//        Characteristics:
//
//Ordered
//
//Allows duplicates
//
//Adding/removing anywhere is fast (O(1) if you have reference)
//
//Random access is slow (get(index) is O(n))
//
//Can also be used as Queue or Deque

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Mango"); // Add at start

        System.out.println(fruits); // [Mango, Apple, Banana]
        fruits.removeLast();
        System.out.println(fruits); // [Mango, Apple]
    }
}

