// File: AbstractDemo.java
abstract class Shape {
    abstract double area();
    void printArea() { System.out.println("Area = " + area()); }
}

class Circle extends Shape {
    private double r;
    Circle(double r) { this.r = r; }
    @Override
    double area() { return Math.PI * r * r; }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new Circle(2.0);
        s.printArea();
    }
}
