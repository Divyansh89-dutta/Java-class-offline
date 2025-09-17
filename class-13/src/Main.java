

//🔹 while loop in Java
//A while loop executes its body as long as the condition is true.
//We use it when the number of iterations is unknown in advance, and we want to repeat until some condition is satisfied.

//public class Main {
//    public static void main(String[] args) {
//        int i = 1;   // starting value
//
//        while (i <= 13) {   // condition checked before each loop
//            System.out.println(i);
//            i++;   // update (to avoid infinite loop)
//        }
//    }
//}
//Here, we don’t know beforehand how many steps until i > 13.
//The loop runs until the condition i <= 13 becomes false.
//This is a case where the number of iterations is unknown.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter numbers (enter 0 to stop):");

        num = sc.nextInt();
        while (num != 0) {   // stop when user enters 0
            System.out.println("You entered: " + num);
            num = sc.nextInt();
        }

        System.out.println("Loop ended because you entered 0.");
    }
}
