package Questions;
abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike started");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Vehicle[] v = {
                new Car(),
                new Bike()
        };
        for (Vehicle vehicle : v){
            vehicle.start();
            vehicle.stop();
        }
    }
}
