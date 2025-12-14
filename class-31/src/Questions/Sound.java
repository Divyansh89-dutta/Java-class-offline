package Questions;
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Sound {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
    }
}
