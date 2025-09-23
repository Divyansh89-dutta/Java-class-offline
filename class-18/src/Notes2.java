import java.util.Scanner;

public class Notes2 {
    public static void main(String[] args) {
        // Create Scanner object 'sc' to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Declare and create an integer array 'arr' of size 5
        // This means arr has 5 "boxes" to store integers: arr[0], arr[1], arr[2], arr[3], arr[4]
        int arr[] = new int[5];

        // -------- INPUT LOOP --------
        // Fill the array with values entered by the user
        // arr.length = 5 (size of the array), so loop will run for i = 0,1,2,3,4
        for (int i = 0; i < arr.length; i++) {
            // Take input from user and store it in arr[i]
            arr[i] = sc.nextInt();
        }

        // -------- OUTPUT LOOP --------
        // Print all elements of the array one by one
        for (int i = 0; i < arr.length; i++) {
            // Print the element at index i, followed by a space
            // println() prints the value and then moves to the next line
            System.out.println(arr[i] + " ");
        }

        // Close the scanner to avoid memory leaks (good practice)
        sc.close();
    }
}
