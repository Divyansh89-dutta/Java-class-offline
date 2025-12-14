// File: InterfaceDemo.java
interface Flyer { void fly(); }
interface Swimmer { void swim(); }

class Duck implements Flyer, Swimmer {
    public void fly() { System.out.println("Duck flies"); }
    public void swim(){ System.out.println("Duck swims"); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
