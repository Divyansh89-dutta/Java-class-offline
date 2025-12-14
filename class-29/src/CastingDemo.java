// File: CastingDemo.java
class Animal2 { void eat(){ System.out.println("eat"); } }
class Dog2 extends Animal2 { void bark(){ System.out.println("bark"); } }

public class CastingDemo {
    public static void main(String[] args) {
        Animal2 a = new Dog2();
        if (a instanceof Dog2) {
            Dog2 d = (Dog2) a;
            d.bark(); // safe cast
        }
    }
}
