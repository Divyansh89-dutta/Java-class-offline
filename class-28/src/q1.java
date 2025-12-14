class Student{
    static String School = "IPS";
    String name;
    Student(String name){
        this.name = name;
    }
}

public class q1 {
    public static void main(String[] args) {
        Student s1 = new Student("Divaynsh");
        Student s2 = new Student("Divya");
        System.out.println(s1);
        System.out.println(s2);
    }
}
