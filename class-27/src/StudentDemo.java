import java.util.Objects;

public class StudentDemo {
    public static void main(String[] args) {

        // ------------------------------
        // STEP 1: Create Students
        // ------------------------------
        Student s1 = new Student("Atharv", 22, "UIT", 3);
        Student s2 = new Student("Atharv", 22, "UIT", 3);
        Student s3 = new Student("Riya", 21, "UIT", 2);

        // ------------------------------
        // STEP 2: toString()
        // ------------------------------
        System.out.println("s1 = " + s1);  // calls toString()
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        // ------------------------------
        // STEP 3: equals() & hashCode()
        // ------------------------------
        System.out.println("s1.equals(s2)? " + s1.equals(s2)); // true (same data)
        System.out.println("s1.equals(s3)? " + s1.equals(s3)); // false (different data)
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("s3.hashCode() = " + s3.hashCode());

        // ------------------------------
        // STEP 4: Mutate object (setters)
        // ------------------------------
        s1.setAge(23);
        System.out.println("After changing s1 age: " + s1);
        System.out.println("Now s1.equals(s2)? " + s1.equals(s2));

        // ------------------------------
        // STEP 5: Record version
        // ------------------------------
        System.out.println("\n--- Using record StudentRecord ---");
        StudentRecord r1 = new StudentRecord("Atharv", 22, "UIT", 3);
        StudentRecord r2 = new StudentRecord("Atharv", 22, "UIT", 3);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r1.equals(r2)? " + r1.equals(r2));
        // r1.setAge(23); ❌ not allowed (records are immutable)
    }
}

// =========================================
// FULL CLASS WITH GENERATED METHODS
// =========================================
class Student {
    private String name;
    private int age;
    private String clgName;
    private int year;

    // ---- Constructor ----
    public Student(String name, int age, String clgName, int year) {
        this.name = name;
        this.age = age;
        this.clgName = clgName;
        this.year = year;
    }

    // ---- Getters ----
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getClgName() { return clgName; }
    public int getYear() { return year; }

    // ---- Setters ----
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setClgName(String clgName) { this.clgName = clgName; }
    public void setYear(int year) { this.year = year; }

    // =========================================
    // GENERATED METHODS (using IDE or manually)
    // =========================================

    // @Override tells compiler we are overriding Object class methods
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", clgName='" + clgName + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 1️⃣ same object → true
        if (this == o) return true;
        // 2️⃣ null or different class → false
        if (o == null || getClass() != o.getClass()) return false;
        // 3️⃣ compare fields
        Student student = (Student) o;
        return age == student.age &&
                year == student.year &&
                Objects.equals(name, student.name) &&
                Objects.equals(clgName, student.clgName);
    }

    @Override
    public int hashCode() {
        // Use Java's built-in helper
        return Objects.hash(name, age, clgName, year);
    }
}

// =========================================
// RECORD VERSION (auto-generated methods)
// =========================================
record StudentRecord(String name, int age, String clgName, int year) { }
