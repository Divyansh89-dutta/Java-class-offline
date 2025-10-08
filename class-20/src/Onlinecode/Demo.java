package Onlinecode;

public class Demo {
    static void displayStudents(int... stu) {  // Corrected varargs syntax
        for (int val : stu)
            System.out.println(val + "");  // Optional: You can just use System.out.println(val);
    }

    public static void main(String[] args) {
        displayStudents(1, 3, 2);
    }
}

