// File: SuperDemo.java
class ASuper {
    int x = 10;
    void show() { System.out.println("A: " + x); }
}

class BSuper extends ASuper {
    int x = 20;
    @Override
    void show() {
        System.out.println("B: " + x);
        System.out.println("super.x = " + super.x);
        super.show();
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        new BSuper().show();
    }
}
