//What is OOP?
//OOP (Object-Oriented Programming) is a way of writing programs that models real-world things as objects.
//Each object has:
//Properties (data or variables)
//Behaviors (methods or functions)
//What is a Class?
//A class is a blueprint or template for creating objects.
//For example:
//Think of a Car class as a blueprint — it defines what every car is (properties) and does (methods).
//What is an Object?
//An object is a real-world instance of a class.
//For example:
//car1 and car2 can be two different objects (actual cars) created from the Car class.
// Define a class called Car
class Car {
    // Properties (Attributes)
    String brand;
    String color;
    int speed;

    // Method (Behavior)
    void start() {
        System.out.println(brand + " is starting...");
    }

    void accelerate() {
        System.out.println(brand + " is accelerating at " + speed + " km/h.");
    }

    void brake() {
        System.out.println(brand + " is stopping.");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create first object of class Car
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.color = "Red";
        car1.speed = 120;

        // Create second object of class Car
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.color = "Black";
        car2.speed = 100;

        // Call methods using objects
        car1.start();
        car1.accelerate();
        car1.brake();

        System.out.println(); // just a blank line for clarity

        car2.start();
        car2.accelerate();
        car2.brake();
    }
}
