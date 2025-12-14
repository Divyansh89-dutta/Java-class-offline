package SuperandConstructor;
class Car {
    Car(String brand) {
        System.out.println("Car Brand: " + brand);
    }
}

class Sedan extends Car {
    Sedan(String brand, int price) {
        super(brand); // calling parent parameterized constructor
        System.out.println("Price: " + price);
    }
}
public class PROGRAM {
    public static void main(String[] args) {
        new Sedan("BMW", 50000000);
    }
}
