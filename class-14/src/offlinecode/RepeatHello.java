package offlinecode;

import java.util.Scanner;

public class RepeatHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise; // User input
        do {
            System.out.println("Hello");
//            Ask user if they want to repeat
            System.out.println("Press 1 to repeat");
            choise = sc.nextInt(); // take input
        } while (choise == 1);  // repeat only if user entered 1
        // when user enters anything other than 1
        System.out.println("Program Exits");
    }
}
