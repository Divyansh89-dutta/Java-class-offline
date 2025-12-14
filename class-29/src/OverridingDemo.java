class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class OverridingDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
