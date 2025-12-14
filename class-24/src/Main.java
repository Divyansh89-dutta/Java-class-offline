//1️⃣ What is Collections API?
//
//Collections API is a framework of interfaces and classes in Java to store, retrieve, and manipulate data efficiently.
//
//Provides common methods like add(), remove(), contains(), size(), etc.
//
//Classes are found in java.util package.
//
//Replaces arrays in many use-cases for flexibility.

//Hierarchy of Java Collections
//              Iterable
//                 |
//             Collection
//         /        |       \
//       List       Set      Queue
//        |         |
//       ArrayList   HashSet
//       LinkedList  LinkedHashSet
//       Vector      TreeSet
//       Stack
//      Map (Not part of Collection)
//        |
//     HashMap
//        LinkedHashMap
//     TreeMap
//Collection: Root interface for List, Set, Queue
//
//List: Ordered, allows duplicates
//
//Set: Unordered, no duplicates
//
//Queue: FIFO
//
//Map: Key-Value pairs
//
//3️⃣ General Approach to Use Collections API
//
//Choose the right collection depending on need:
//
//List → ordered, duplicates allowed
//
//Set → unordered, unique elements
//
//Map → key-value storage
//Use interface type for reference:
//List<String> list = new ArrayList<>();
//Set<Integer> set = new HashSet<>();
//Map<Integer, String> map = new HashMap<>();
//

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create List
        List<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate allowed

        // Access elements by index
        System.out.println("First fruit: " + fruits.get(0)); // Apple

        // Iterate
        System.out.println("All fruits:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Size of List
        System.out.println("Total fruits: " + fruits.size());
    }
}