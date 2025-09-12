import java.util.Scanner;

public class Readtextfromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
