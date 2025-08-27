// Sibgle line comment: This is a simple Java program
/* Multi-line comment:
   This program demonstrates variables, data types,
   and the role of the '+' operator
*/
public class Main {
    public static void main(String[] args) {
        // Understanding the need of a variable:
        // Variables store data that can be reused later

        // Variable declaration and initialization
        int num1 = 12;  // int - stores integres
        int num2 = 20;
        String name = "Shery"; // String - stores combination of characters

        // Demostrating + operation
        int sum = num1 + num2; // int + int = int (Arithmetic Addition)
        String greeting = "Hello" + name; //String + string =  String (Concatenation)
        String mix = name + num1; // String + int = String (Concatenation)

        // Result
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Sum (num1 + num2) = " + sum);
        System.out.println("Greeting (String + String) = " + greeting);
        System.out.println("Mix (String + int) = " + mix);
    }
}