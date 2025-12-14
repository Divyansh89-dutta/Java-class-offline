// File: VarHiding.java
class ParentVar {
    int x = 10;
}

class ChildVar extends ParentVar {
    int x = 20;
}

public class VarHiding {
    public static void main(String[] args) {
        ParentVar p = new ChildVar();
        System.out.println("p.x = " + p.x); // 10, resolved by reference type
        ChildVar c = new ChildVar();
        System.out.println("c.x = " + c.x); // 20
    }
}
