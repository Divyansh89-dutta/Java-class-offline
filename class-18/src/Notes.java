// Step 1: Understanding the need of Data Structures
// -----------------------------------------------
// Data structures help us store and manage data efficiently.
// Example: Array is used to store multiple values in a single variable instead of creating many variables.

public class Notes{

    public static void main(String[] args) {

        // ********** STACK VS HEAP MEMORY **********
        // Stack: Stores reference variables and method calls.
        // Heap: Stores actual objects and array data.

        // Example: Create an array using 'new' keyword
        int[] arr = new int[3]; // <-- arr is stored in STACK, actual [0,0,0] is stored in HEAP.

        // Assign values to the array
        arr[0] = 10; // arr[0] -> Heap memory location
        arr[1] = 20;
        arr[2] = 30;

        // Printing values
        System.out.println("Stack vs Heap Example:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }

        /*
         * Memory Visualization:
         * Stack                Heap
         * -----                -----
         * arr ---> (ref) ---> [10][20][30]
         *
         * Base Address = 0x1234 (Example)
         * Address of arr[i] = Base + (i * sizeOfEachElement)
         */

        // ********** INDEXING AND BASE ADDRESS **********
        // Indexing starts at 0 in Java arrays.
        // Let's manually calculate addresses assuming each int = 4 bytes

        int baseAddress = 1000; // Let's assume base starts at 1000 for example
        System.out.println("\nIndexing and Base Address:");
        for (int i = 0; i < arr.length; i++) {
            int address = baseAddress + (i * 4);
            System.out.println("arr[" + i + "] = " + arr[i] + " stored at address: " + address);
        }

        // ********** DIFFERENT WAYS TO CREATE ARRAYS **********

        // 1. With new keyword + only size
        int[] numbers1 = new int[5]; // Default values will be assigned
        numbers1[0] = 1;
        numbers1[1] = 2;

        // 2. With new keyword + initialization
        int[] numbers2 = new int[]{10, 20, 30, 40};

        // 3. Without new keyword (most common way)
        int[] numbers3 = {100, 200, 300, 400};

        System.out.println("\nDifferent Ways to Create Arrays:");
        System.out.println("numbers1 (with new + size, default + assigned values):");
        for (int num : numbers1) {
            System.out.print(num + " "); // Default values are 0 for remaining
        }
        System.out.println();

        System.out.println("numbers2 (with new + initialization):");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("numbers3 (without new keyword):");
        for (int num : numbers3) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ********** DEFAULT VALUES IN ARRAYS **********
        // Java assigns default values automatically if you only specify size.

        System.out.println("\nDefault Values of Array Elements:");

        int[] defaultInt = new int[3];         // integers default to 0
        float[] defaultFloat = new float[3];   // floats default to 0.0
        char[] defaultChar = new char[3];      // chars default to '\u0000'
        boolean[] defaultBoolean = new boolean[3]; // booleans default to false
        String[] defaultString = new String[3];    // non-primitive objects default to null

        System.out.println("Default int: " + defaultInt[0]);            // 0
        System.out.println("Default float: " + defaultFloat[0]);        // 0.0
        System.out.println("Default char (unicode '\\u0000'): '" + defaultChar[0] + "'"); // blank space
        System.out.println("Default boolean: " + defaultBoolean[0]);    // false
        System.out.println("Default object reference (String): " + defaultString[0]); // null

        // ********** STRING AS A DATA STRUCTURE **********
        // Strings are arrays of characters internally in Java
        String str = "Hello";
        System.out.println("\nString Example:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Index " + i + ": " + str.charAt(i));
        }

        // ********** STACK AS A DATA STRUCTURE **********
        // LIFO (Last In First Out)
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(10); // push elements
        stack.push(20);
        stack.push(30);
        System.out.println("\nStack Example (LIFO):");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // ********** QUEUE AS A DATA STRUCTURE **********
        // FIFO (First In First Out)
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("\nQueue Example (FIFO):");
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.remove());
        }

        // ********** LINKEDLIST AS A DATA STRUCTURE **********
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("\nLinkedList Example:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // ********** TREE EXAMPLE (Simple Binary Tree Node) **********
        // A tree node has data and references to child nodes
        class TreeNode {
            int data;
            TreeNode left, right;

            TreeNode(int value) {
                data = value;
                left = right = null;
            }
        }

        // Create a simple tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println("\nTree Example (Root, Left, Right):");
        System.out.println("Root: " + root.data);
        System.out.println("Left: " + root.left.data);
        System.out.println("Right: " + root.right.data);

        // ********** GRAPH EXAMPLE (Adjacency List) **********
        java.util.Map<String, java.util.List<String>> graph = new java.util.HashMap<>();
        graph.put("A", java.util.Arrays.asList("B", "C"));
        graph.put("B", java.util.Arrays.asList("A", "D"));
        graph.put("C", java.util.Arrays.asList("A"));
        graph.put("D", java.util.Arrays.asList("B"));

        System.out.println("\nGraph Example (Adjacency List):");
        for (String node : graph.keySet()) {
            System.out.println(node + " -> " + graph.get(node));
        }
    }
}
