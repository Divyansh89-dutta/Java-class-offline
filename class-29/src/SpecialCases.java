// File: SpecialCases.java
class ParentSpecial {
    private void secret() { System.out.println("Parent secret (private)"); }
    static void staticMethod() { System.out.println("Parent static"); }
    final void finalMethod() { System.out.println("Parent final"); }
}

class ChildSpecial extends ParentSpecial {
    // Can't override secret() — it's private in parent
    static void staticMethod() { System.out.println("Child static (hides)"); }
    // finalMethod() cannot be overridden (would be compile error)
}

public class SpecialCases {
    public static void main(String[] args) {
        ParentSpecial p = new ChildSpecial();
        p.staticMethod();    // calls ParentSpecial.staticMethod() at compile time
        p.finalMethod();     // calls inherited final method
    }
}
